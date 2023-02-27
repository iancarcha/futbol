package com.example.futbol;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Equipos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_equipo;

    @OneToMany (mappedBy = "equipos",cascade = CascadeType.ALL)
    private List<Pais>pais;

    @OneToMany (mappedBy = "equipos", cascade = CascadeType.ALL)
    private List<Jugadores>jugadores;

    @OneToMany (mappedBy = "equipos",cascade = CascadeType.ALL)
    private List<Ligas>ligases;
    private String nombre;

    private Date anyo_f;

    private String ciudad;

    private String escudo;

    public Equipos(Long id_equipo, List<Pais> pais, List<Jugadores> jugadores, String nombre, Date anyo_f, String ciudad, String escudo) {
        this.id_equipo = id_equipo;
        this.pais = pais;
        this.jugadores = jugadores;
        this.nombre = nombre;
        this.anyo_f = anyo_f;
        this.ciudad = ciudad;
        this.escudo = escudo;
    }

    public Long getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(Long id_equipo) {
        this.id_equipo = id_equipo;
    }

    public List<Pais> getPais() {
        return pais;
    }

    public void setPais(List<Pais> pais) {
        this.pais = pais;
    }

    public List<Jugadores> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugadores> jugadores) {
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getAnyo_f() {
        return anyo_f;
    }

    public void setAnyo_f(Date anyo_f) {
        this.anyo_f = anyo_f;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    public Equipos() {
    }
}
