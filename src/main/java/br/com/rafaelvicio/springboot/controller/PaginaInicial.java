package br.com.rafaelvicio.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaginaInicial {

    @RequestMapping("/")
    String nome() {
        return "Olá Spring Boot";
    }

}