package com.unitec.localizaamigos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication

public class LocalizaamigosApplication implements CommandLineRunner {
@Autowired MensajeRepository mensajeRepository;


	public static void main(String[] args) {
		SpringApplication.run(LocalizaamigosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Mensaje mensaje=new Mensaje();
		mensaje.setCuerpo("Juan Carlos");
		mensaje.setTitulo("Campos");
		mensaje.setId("33868");
		mensajeRepository.save(mensaje);

	}
}
