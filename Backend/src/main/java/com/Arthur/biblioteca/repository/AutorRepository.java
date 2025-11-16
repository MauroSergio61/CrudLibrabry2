package com.Arthur.biblioteca.repository;

import com.Arthur.biblioteca.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}