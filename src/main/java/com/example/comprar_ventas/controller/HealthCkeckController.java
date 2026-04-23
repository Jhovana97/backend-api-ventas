package com.example.comprar_ventas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HealthCkeckController {

    @GetMapping("/heath")
    public String healthCheck() {
        return "servicio ejecutandose exitosamente";
    }
}
