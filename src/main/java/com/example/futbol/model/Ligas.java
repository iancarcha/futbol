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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Equipos getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipos equipos) {
        this.equipos = equipos;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Arbitros getArbitros() {
        return arbitros;
    }

    public void setArbitros(Arbitros arbitros) {
        this.arbitros = arbitros;
    }

    public String getNombre_liga() {
        return nombre_liga;
    }

    public void setNombre_liga(String nombre_liga) {
        this.nombre_liga = nombre_liga;
    }

    public Date getInicio_liga() {
        return inicio_liga;
    }

    public void setInicio_liga(Date inicio_liga) {
        this.inicio_liga = inicio_liga;
    }

    public Date getFin_liga() {
        return fin_liga;
    }

    public void setFin_liga(Date fin_liga) {
        this.fin_liga = fin_liga;
    }

    public String getImg_liga() {
        return img_liga;
    }

    public void setImg_liga(String img_liga) {
        this.img_liga = img_liga;
    }
}

