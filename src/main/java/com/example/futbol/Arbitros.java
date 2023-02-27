package com.example.futbol;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Arbitros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_arbitro;

    private String nombre;

    private String comite_arb;

    private String img_arb;
}
