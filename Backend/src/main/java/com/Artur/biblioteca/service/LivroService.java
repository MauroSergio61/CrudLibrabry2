package com.Artur.biblioteca.service;

import com.Artur.biblioteca.model.Autor;
import com.Artur.biblioteca.model.Livro;
import com.Artur.biblioteca.repository.AutorRepository;
import com.Artur.biblioteca.repository.LivroRepository;
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
