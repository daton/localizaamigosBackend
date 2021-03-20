package com.unitec.localizaamigos;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepositorio extends MongoRepository<Usuario, String> {
}
