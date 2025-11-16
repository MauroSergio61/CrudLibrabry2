package com.Arthur.biblioteca.model;

import jakarta.persistence.*;

@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    // GETTERS
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    // SETTERS
    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
