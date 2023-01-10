package com.reto.kruger2.repositories;

import com.reto.kruger2.models.Dato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface DatoRepository extends JpaRepository <Dato, Integer>{
    List<Dato> findByEstado(boolean estado);

    List<Dato> findByTipoVacuna(String tipoVacuna);
    List<Dato> findByFechaVacunacion(Date fechaVacunacion);
}
