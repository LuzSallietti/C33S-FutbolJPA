package com.dh.C33ABDFutbol.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String ciudad;
    //genero le relacion 1 a muchos con jugador
    @OneToMany(mappedBy = "equipo", fetch = FetchType.LAZY)
    private Set<Jugador> jugadores = new HashSet<>();

    //Hibernate pide el constructor vacio

    public Equipo() {
    }


    //crear el constructor SIN ID --> se autogenera en la BD

    public Equipo(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    //generar el getter para el ID, una vez que se genera no se cambia nunca

    public Long getId() {
        return id;
    }

    //getter y setter para la coleccion de Jugadores

    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Set<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
