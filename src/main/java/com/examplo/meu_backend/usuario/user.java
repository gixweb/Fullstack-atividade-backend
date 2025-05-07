package com.examplo.meu_backend.usuario;

import jakarta.persistence.*;

@Table(name = "usuario")
@Entity(name = "user")

public class user {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String senha;
}
