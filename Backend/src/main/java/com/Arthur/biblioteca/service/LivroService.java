package com.Arthur.biblioteca.service;

import com.Arthur.biblioteca.model.Autor;
import com.Arthur.biblioteca.model.Livro;
import com.Arthur.biblioteca.repository.AutorRepository;
import com.Arthur.biblioteca.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private final LivroRepository livroRepository;
    private final AutorRepository autorRepository;

    public LivroService(LivroRepository livroRepository, AutorRepository autorRepository) {
        this.livroRepository = livroRepository;
        this.autorRepository = autorRepository;
    }

    public List<Livro> listar() {
        return livroRepository.findAll();
    }

    public Livro salvar(Livro livro) {
        Autor autor = autorRepository.findById(livro.getAutor().getId())
                .orElseThrow(() -> new RuntimeException("Autor não encontrado"));

        livro.setAutor(autor);
        return livroRepository.save(livro);
    }
}
