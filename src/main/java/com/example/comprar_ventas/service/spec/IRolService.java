package com.example.comprar_ventas.service.spec;

import java.util.List;


import com.example.comprar_ventas.entity.Rol;

public interface IRolService {

    List<Rol> findAllRoles();

    Rol findRolById(Integer id);

    Rol findRolByNombre(String nombre);

    Rol createRol(Rol rol);
    Rol upddateRol(Integer id, Rol rol);

    void deleteById(Integer id);
}
