package com.example.futbol;

import jakarta.persistence.*;

@Entity
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pais;
    @ManyToOne
    @JoinColumn(name = "id_equipo")
    private Equipos equipos;
    private String nombre;

    private String idioma;

    public Pais(Long id_pais, Equipos equipos, String nombre, String idioma) {
        this.id_pais = id_pais;
        this.equipos = equipos;
        this.nombre = nombre;
        this.idioma = idioma;
    }

    public Pais() {
    }

    public Long getId_pais() {
        return id_pais;
    }

    public void setId_pais(Long id_pais) {
        this.id_pais = id_pais;
    }

    public Equipos getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipos equipos) {
        this.equipos = equipos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "id_pais=" + id_pais +
                ", equipos=" + equipos +
                ", nombre='" + nombre + '\'' +
                ", idioma='" + idioma + '\'' +
                '}';
    }
}
