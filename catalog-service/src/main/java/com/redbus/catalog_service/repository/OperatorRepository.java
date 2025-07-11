package com.redbus.catalog_service.repository;

import com.redbus.catalog_service.entity.Operator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperatorRepository extends JpaRepository<Operator, Long> { }