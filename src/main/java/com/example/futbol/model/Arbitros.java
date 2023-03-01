package com.example.futbol.model;

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

    public Long getId_arbitro() {
        return id_arbitro;
    }

    public void setId_arbitro(Long id_arbitro) {
        this.id_arbitro = id_arbitro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComite_arb() {
        return comite_arb;
    }

    public void setComite_arb(String comite_arb) {
        this.comite_arb = comite_arb;
    }

    public String getImg_arb() {
        return img_arb;
    }

    public void setImg_arb(String img_arb) {
        this.img_arb = img_arb;
    }
}
