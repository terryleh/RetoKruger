package com.reto.kruger2.controllers;

import com.reto.kruger2.models.Dato;
import com.reto.kruger2.repositories.DatoRepository;
import com.reto.kruger2.services.DatoService;
import com.reto.kruger2.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/infodatos")
public class DatoController {

    //llamar servicios
    @Autowired
    private DatoService datoService;
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private DatoRepository datoRepository;

    //implementar funciones


    @PostMapping("/create")
    public Dato createDato(@Validated @RequestBody Dato dato){return datoService.saveDato(dato);}

    @GetMapping("/read")
    public List<Dato> readDatos(){
        return datoService.getAllDatos();
    }

    @GetMapping("/readEs/{estado}")
    public List<Dato> readEstados(@PathVariable boolean estado, @Validated @RequestBody Dato dato){return datoService.getByEstado(estado);}


    @GetMapping("/readV/{tipoVacuna}")
    public List<Dato> readTipoVacuna(@PathVariable String tipoVacuna, @Validated @RequestBody Dato dato){return datoService.getByVacuna(tipoVacuna);}

    @PostMapping("/readF/{fechaVacunacion}")
    public List<Dato> readFechaVacunacion(@PathVariable Date fechaVacunacion, @Validated @RequestBody Dato dato){return datoService.getByFechaVacunacion(fechaVacunacion);}


    @PutMapping("/actualizar/{idUsuario}")
    public Dato updateDato(@PathVariable Integer idUsuario, @Validated @RequestBody Dato dato){
        return datoService.saveDato(dato);
    }
    @DeleteMapping("/borrar/{idUsuario}")
    private void deleteDato(@PathVariable Integer idUsuario){
        usuarioService.deleteUsuario(idUsuario);

    }
}
