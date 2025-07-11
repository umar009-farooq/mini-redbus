package com.redbus.catalog_service.controller;

import com.redbus.catalog_service.entity.Operator;
import com.redbus.catalog_service.repository.OperatorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/operators")
@RequiredArgsConstructor
public class OperatorController {

    private final OperatorRepository repo;

    @PostMapping
    public Operator create(@RequestBody Operator op) {
        return repo.save(op);
    }

    @GetMapping
    public List<Operator> all() {
        return repo.findAll();
    }
}
