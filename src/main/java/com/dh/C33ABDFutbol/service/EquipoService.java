package com.dh.C33ABDFutbol.service;

import com.dh.C33ABDFutbol.repository.IEquipoRepository;

public class EquipoService {
    private final IEquipoRepository equipoRepository;

    public EquipoService(IEquipoRepository equipoRepository) {
        this.equipoRepository = equipoRepository;
    }
}
