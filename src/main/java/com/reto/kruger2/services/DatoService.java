package com.reto.kruger2.services;


import com.reto.kruger2.models.Dato;
import com.reto.kruger2.repositories.DatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class DatoService {

    @Autowired
    private DatoRepository datoRepository;

    public Dato saveDato(Dato dato) {
        return datoRepository.save(dato);
    }

    public List<Dato> getAllDatos() {
        return datoRepository.findAll();
    }

    public List<Dato> getByEstado(boolean estado) {
        return datoRepository.findByEstado(estado);
    }

    public List<Dato> getByVacuna(String tipoVacuna) {
        return datoRepository.findByTipoVacuna(tipoVacuna);
    }

    public List<Dato> getByFechaVacunacion(Date fechaVacunacion) {
        return datoRepository.findByFechaVacunacion(fechaVacunacion);
    }

}
