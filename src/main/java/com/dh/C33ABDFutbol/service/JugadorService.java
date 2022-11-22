package com.dh.C33ABDFutbol.service;

import com.dh.C33ABDFutbol.repository.IJugadorRepository;

public class JugadorService {
    public final IJugadorRepository jugadorRepository;

    public JugadorService(IJugadorRepository jugadorRepository) {
        this.jugadorRepository = jugadorRepository;
    }
}
