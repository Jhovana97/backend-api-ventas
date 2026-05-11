package com.example.comprar_ventas.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.comprar_ventas.entity.Rol;

@Repository
//ListCrudRepository es una interfaz de Spring Data que proporciona métodos para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la entidad Rol. Al extender ListCrudRepository, RolRepositry hereda estos métodos y puede utilizarlos para interactuar con la base de datos sin necesidad de escribir código adicional para las operaciones básicas.
public interface RolRepository extends ListCrudRepository<Rol, Integer> {
    //aqui se define las operaciones con base de datos para la entidad Rol, como guardar, actualizar, eliminar y buscar roles.
    //query methods
    Optional<Rol> findByNombre(String nombre); //select * from rol where nombre = ?nombre

    //sql nativo 
    @Query (value = "select * from rol where nombre like '?1'", nativeQuery = true)
    Optional<Rol> findByNombreNative(String nombre);    

    //JPQL 
    @Query (value = "select Rol from Rol  where nombre like '?1'")
    Optional<Rol> findByNombreNativeJpql(String nombre);
}
