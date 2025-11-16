package com.Arthur.biblioteca.controller;

import com.Arthur.biblioteca.model.Livro;
import com.Arthur.biblioteca.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
@CrossOrigin("*")
public class LivroController {

    private final LivroService service;

    public LivroController(LivroService service) {
        this.service = service;
    }

    @GetMapping
    public List<Livro> listar() {
        return service.listar();
    }

    @PostMapping
    public Livro salvar(@RequestBody Livro livro) {
        return service.salvar(livro);
    }
}
