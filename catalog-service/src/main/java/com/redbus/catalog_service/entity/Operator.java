package com.redbus.catalog_service.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity @Table(name = "operators")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Operator {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    private String contactEmail;
}
