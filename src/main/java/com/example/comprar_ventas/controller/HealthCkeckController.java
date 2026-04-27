package com.example.comprar_ventas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//tenemos un conrolador que se encarga de manejar las peticiones http, en este caso es un controlador de salud
@RequestMapping("/health")//tenemos una ruta base para todas las peticiones que se hagan a este controladors
public class HealthCkeckController {

    @GetMapping//tenemos una ruta definida en el cotrol
    public String healthCheck() {
        return "servicio ejecutandose exitosamente";
    }
}
