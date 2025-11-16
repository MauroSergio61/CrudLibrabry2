package com.Arthur.biblioteca.repository;

import com.Arthur.biblioteca.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
