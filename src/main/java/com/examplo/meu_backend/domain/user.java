package com.examplo.meu_backend.domain;

public class user {
    private String email;
    private String senha;

    public String getemail(){
        return email;
    }
    public void setemail(){
        this.email = email;
    }

    public String getsenha(){
        return "******";
    }

    public void setsenha(@org.jetbrains.annotations.NotNull String senha) throws IllegalAccessException {
        if(senha.length() < 6){
            throw new IllegalAccessException("Insira uma senha de 6 dígitos!");
        }
        this.senha = senha;
    }
}