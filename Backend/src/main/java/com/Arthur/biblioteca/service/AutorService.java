package com.Arthur.biblioteca.service;

import com.Arthur.biblioteca.model.Autor;
import com.Arthur.biblioteca.repository.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public List<Autor> listar() {
        return autorRepository.findAll();
    }

    public Autor salvar(Autor autor) {
        return autorRepository.save(autor);
    }
}
