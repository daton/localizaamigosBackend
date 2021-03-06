package com.unitec.localizaamigos;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControladorMensaje {

@GetMapping("/mensaje")
 public  Mensaje obtenerMensaje(){
 //Creamos un objeto de tipo mensaje
 Mensaje mensaje=new Mensaje();
 mensaje.setTitulo("Para mis alumnos de ANDROID");
 mensaje.setCuerpo("Este es un servicio REST muy basico pero funciona ");

 return mensaje;


}

}
