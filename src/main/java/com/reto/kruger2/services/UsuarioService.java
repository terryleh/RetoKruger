package com.reto.kruger2.services;

import com.reto.kruger2.models.Usuario;
import com.reto.kruger2.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAllUsuarios(){return usuarioRepository.findAll();}

    //porbando
    public Usuario saveUsuario(Usuario usuario){ return usuarioRepository.save(usuario);}
    
    public void deleteUsuario(Integer idUsuario){
        usuarioRepository.deleteById(idUsuario);
    }
}
