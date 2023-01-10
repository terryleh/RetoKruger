package com.reto.kruger2.controllers;


import com.reto.kruger2.models.Dato;
import com.reto.kruger2.models.Usuario;
import com.reto.kruger2.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/infousuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    @GetMapping("/readu")
    public List<Usuario> readUsuarios(){
        return usuarioService.getAllUsuarios();
    }

    @PostMapping("/createu")
    public Usuario createUsuario(@RequestBody Usuario usuario){return usuarioService.saveUsuario(usuario);}

}
