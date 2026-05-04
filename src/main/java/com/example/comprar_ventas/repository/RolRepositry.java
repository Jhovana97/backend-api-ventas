package com.example.comprar_ventas.repository;

import org.springframework.data.repository.ListCrudRepository;

import com.example.comprar_ventas.entity.Rol;
//ListCrudRepository es una interfaz de Spring Data que proporciona métodos para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la entidad Rol. Al extender ListCrudRepository, RolRepositry hereda estos métodos y puede utilizarlos para interactuar con la base de datos sin necesidad de escribir código adicional para las operaciones básicas.
public interface RolRepositry extends ListCrudRepository<Rol, Integer> {
    //aqui se define las operaciones con base de datos para la entidad Rol, como guardar, actualizar, eliminar y buscar roles.

}
