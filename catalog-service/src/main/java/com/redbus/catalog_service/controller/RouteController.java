package com.redbus.catalog_service.controller;

import com.redbus.catalog_service.entity.Route;
import com.redbus.catalog_service.repository.RouteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/routes")
@RequiredArgsConstructor
public class RouteController {

    private final RouteRepository repo;

    @PostMapping
    public Route create(@RequestBody Route r) {
        return repo.save(r);
    }

    @GetMapping
    public List<Route> all() {
        return repo.findAll();
    }
}
