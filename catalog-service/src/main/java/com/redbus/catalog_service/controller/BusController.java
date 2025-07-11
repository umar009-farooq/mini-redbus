package com.redbus.catalog_service.controller;

import com.redbus.catalog_service.entity.Bus;
import com.redbus.catalog_service.entity.Operator;
import com.redbus.catalog_service.repository.BusRepository;
import com.redbus.catalog_service.repository.OperatorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/buses")
@RequiredArgsConstructor
public class BusController {
    public record BusCreateDto(String plateNumber,
                               Long operatorId,
                               int totalSeats,
                               String seatLayout) { }
    private final BusRepository repo;
    private final OperatorRepository operatorRepo;

    @PostMapping
    public Bus create(@RequestBody BusCreateDto dto) {
        Operator op = operatorRepo.findById(dto.operatorId())
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.BAD_REQUEST, "Operator not found"));
        Bus bus = Bus.builder()
                .plateNumber(dto.plateNumber())
                .operator(op)
                .totalSeats(dto.totalSeats())
                .seatLayout(dto.seatLayout())
                .build();
        return repo.save(bus);
    }

    @GetMapping
    public List<Bus> all() { return repo.findAll(); }
}

/* DTO record */

