package com.example.futbol.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Ligas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_equipo")
    private Equipos equipos;

    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Pais pais;

    @ManyToOne
    @JoinColumn(name = "id_arbitro")
    private Arbitros arbitros;
    private String nombre_liga;

    private Date inicio_liga;

    private Date fin_liga;

    private String img_liga;
}

