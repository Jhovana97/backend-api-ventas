package com.example.comprar_ventas.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.comprar_ventas.dto.RolRequest;

@RestController
@RequestMapping("/rol")

public class RolController {
    @GetMapping
    public String listarRoles() {
        return "Listado de roles";
    }
    @GetMapping("/{rolId}")// /rol/1 para obtener el rol con id 1
    public String obtenerRolPorId(@PathVariable Integer rolId) {
        return "Rol con id: " + rolId;
    }
    @PostMapping
    public String crearRol(@RequestBody  RolRequest rolRequest) {
        return "Rol creado";
    }
    @PutMapping("/{rolId}")
    public String actualizarRol(@PathVariable Integer rolId, @RequestBody  RolRequest rolRequest) {
        return "Rol actualizado";
    }
    @DeleteMapping("/{id}")
    public String borrarRol(@PathVariable Integer id) {
        return "Rol eliminado";
    }
}
