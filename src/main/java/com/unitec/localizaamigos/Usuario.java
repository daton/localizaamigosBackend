package com.unitec.localizaamigos;

import org.springframework.data.mongodb.core.mapping.MongoId;

public class Usuario {

    @MongoId
    private String email;
    private String nickname;
    private String nombre;


    public Usuario() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
