package com.example.comprar_ventas.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rol")

public class RolController {
    @GetMapping
    public String listarRoles() {
        return "Listado de roles";
    }
    @GetMapping 
    public String obtenerRolPorId(Integer rolId) {
        return "Rol con id: " + rolId;
    }
    @PostMapping
    public String crearRol(Object rol) {
        return "Rol creado";
    }
    @PutMapping
    public String actualizarRol(Object rol) {
        return "Rol actualizado";
    }
    @DeleteMapping String borrarRol(Integer rol){
        return "Rol eliminado";
    }
}
