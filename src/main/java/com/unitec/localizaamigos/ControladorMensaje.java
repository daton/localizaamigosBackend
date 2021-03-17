package com.unitec.localizaamigos;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//api es Aplication Programming Interface
@RequestMapping("/api")
public class ControladorMensaje {

@Autowired
MensajeRepository mensajeRepositorio;

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
public   Estatus guardar(@RequestBody String json)throws Exception{
       //Recibimos por medio del RequestBody el objeto json proveniente de Android
    ObjectMapper mapper =new ObjectMapper();
    //Ahora vamos a convertir el objeto json que viene de android a objeto Java usando la clase ObjectMapper
     Mensaje mensa   =   mapper.readValue(json, Mensaje.class);
     //El objeto mensa es el objeto ya traducido de json a java, ahora lo guardamos por medio del repositorio
    mensajeRepositorio.save(mensa);
    //CReamos la notificacion donde se informa a android el estatus del servicio REST (guardar)
    Estatus estatus=new Estatus("Mensaje guardado bieeeeenn", true);
    //Lo retornamos
    return  estatus;

}


}
