package com.unitec.localizaamigos;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//api es Aplication Programming Interface
@RequestMapping("/api")
public class ControladorMensaje {
@Autowired MensajeRepository mensajeRepository;
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

@PostMapping("/mensaje")
    public Estatus guardar(@RequestBody String json)throws Exception{
    ObjectMapper maper=new ObjectMapper();
    Mensaje mensaje=maper.readValue(json, Mensaje.class);

 Estatus estatus=new Estatus("Guardadoooo", true);
 mensajeRepository.save(mensaje);
 return  estatus;
   }
}
