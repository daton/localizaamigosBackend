package com.unitec.localizaamigos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;



public interface MensajeRepository extends MongoRepository<Mensaje, String> {
}
