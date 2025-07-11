package com.redbus.catalog_service.repository;

import com.redbus.catalog_service.entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus, Long> { }
