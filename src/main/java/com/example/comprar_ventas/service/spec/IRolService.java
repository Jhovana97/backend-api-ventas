package com.example.comprar_ventas.service.spec;

import java.util.List;

import com.example.comprar_ventas.dto.RolRequest;
import com.example.comprar_ventas.entity.Rol;

public interface IRolService {

    List<Rol> findAllRoles();

    Rol findRolById(Integer id);

    Rol findRolByNombre(String nombre);

    Rol createRol(RolRequest rol);

    Rol updateRol(Integer id, RolRequest rol);

    void deleteById(Integer id);
}
