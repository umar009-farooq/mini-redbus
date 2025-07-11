package com.redbus.catalog_service.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity @Table(name = "buses")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Bus {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String plateNumber;

    @ManyToOne(optional = false)
    private Operator operator;

    private int totalSeats;

    // e.g. "2+1", "2+2"
    private String seatLayout;
}
