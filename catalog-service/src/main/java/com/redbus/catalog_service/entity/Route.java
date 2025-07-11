package com.redbus.catalog_service.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity @Table(name = "routes",
        uniqueConstraints = @UniqueConstraint(columnNames = {"sourceCity","destCity"}))
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Route {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String sourceCity;

    @Column(nullable = false)
    private String destCity;

    private int distanceKm;   // keep 0 if unknown
}
