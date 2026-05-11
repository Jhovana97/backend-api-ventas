package com.example.comprar_ventas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.comprar_ventas.dto.RolRequest;
import com.example.comprar_ventas.entity.Rol;
import com.example.comprar_ventas.service.spec.IRolService;

@RestController
@RequestMapping("/rol")

public class RolController {

    @Autowired
    private IRolService rolService;

    @GetMapping
    public List<Rol> listarRoles() {
        return rolService.findAllRoles();
    }
    @GetMapping("/{rolId}")// /rol/1 para obtener el rol con id 1
    public Rol obtenerRolPorId(@PathVariable Integer rolId) {
        return rolService.findRolById (rolId);
    }
    @PostMapping
    public Rol crearRol(@RequestBody  RolRequest rolRequest) {
        return rolService.createRol(rolRequest);
    }
    @PutMapping("/{rolId}")
    public Rol actualizarRol(@PathVariable Integer rolId, @RequestBody  RolRequest rolRequest) {
        return rolService.updateRol(rolId, rolRequest);
    }
    @DeleteMapping("/{id}") 
    public void borrarRol(@PathVariable Integer id) {
        rolService.deleteById(id);
    }
}


