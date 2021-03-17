package com.unitec.localizaamigos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.MongoId;


public class Mensaje {

    @MongoId
   private String id;
   private String titulo;
   private String cuerpo;

    public Mensaje(String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }



    public Mensaje() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
}
