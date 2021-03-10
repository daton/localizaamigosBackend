package com.unitec.localizaamigos;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//api es Aplication Programming Interface
@RequestMapping("/api")
public class ControladorMensaje {

    //La anotacion GetMapping indica que vamos a hacer una operacion GET
   @GetMapping("/mensaje")
    public Mensaje obtenerMensaje(){
       //Esto de aqui lo ahce un objeto modelo, por ahora lo va a hacer el controlador
       Mensaje mensa=new Mensaje();
       mensa.setTitulo("MI primer mensaje");
       mensa.setCuerpo("Ya casi termina la clase y tengo ganas de papas con salsa y limonsito");
       //regresamos al ciente (que vive fuera del servidor) el objeto de tipo mensaje
       return  mensa;
   }
}
