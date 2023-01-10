package com.reto.kruger2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HolaController {

    @GetMapping("/holita")
    public String saludar(){
        return "prueba piloter";
    }
}