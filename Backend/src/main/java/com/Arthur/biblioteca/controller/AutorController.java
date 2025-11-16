package com.Arthur.biblioteca.controller;

import com.Arthur.biblioteca.model.Autor;
import com.Arthur.biblioteca.service.AutorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
@CrossOrigin("*")
public class AutorController {

    private final AutorService service;

    public AutorController(AutorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Autor> listar() {
        return service.listar();
    }

    @PostMapping
    public Autor salvar(@RequestBody Autor autor) {
        return service.salvar(autor);
    }
}
