package com.example.futbol;

import jakarta.persistence.*;

@Entity
public class Jugadores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_jugadores;

    @ManyToOne
    @JoinColumn(name = "id_equipo")
    private Equipos equipos;
    private String nombre;
    private String nacionalidad;

    private String posicion;

    private int numero;

    public Jugadores(Long id_jugadores, Equipos equipos, String nombre, String nacionalidad, String posicion, int numero) {
        this.id_jugadores = id_jugadores;
        this.equipos = equipos;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.posicion = posicion;
        this.numero = numero;
    }

    public Long getId_jugadores() {
        return id_jugadores;
    }

    public void setId_jugadores(Long id_jugadores) {
        this.id_jugadores = id_jugadores;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Jugadores() {
    }

    @Override
    public String toString() {
        return "Jugadores{" +
                "id_jugadores=" + id_jugadores +
                ", equipos=" + equipos +
                ", nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", posicion='" + posicion + '\'' +
                ", numero=" + numero +
                '}';
    }
}
