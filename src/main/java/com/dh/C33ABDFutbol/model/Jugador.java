package com.dh.C33ABDFutbol.model;

import javax.persistence.*;

@Entity
@Table
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String puesto;
    private int numero;
    //un jugador pertenece a un equipo
    //si elimino el equipo, eliminare los alumnos en casacada
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //indico cual es la columna relacionada para el JOIN
    @JoinColumn(name="equipo_id")
    private Equipo equipo;

    public Jugador() {
    }

    public Jugador(String nombre, String puesto, int numero) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.numero = numero;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
