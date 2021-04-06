package com.unitec.localizaamigos;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//api es Aplication Programming Interface
@RequestMapping("/api")
public class ControladorUsuario {


    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    //La anotacion GetMapping indica que vamos a hacer una operacion GET
    @GetMapping("/usuario")
    public List<Usuario> obtenerMensaje(){


        return  usuarioRepositorio.findAll();
    }

    @PostMapping("/usuario")
    public   Estatus guardar(@RequestBody String json)throws Exception{
        //Recibimos por medio del RequestBody el objeto json proveniente de Android
        ObjectMapper mapper =new ObjectMapper();
        //Ahora vamos a convertir el objeto json que viene de android a objeto Java usando la clase ObjectMapper
        Usuario usua   =   mapper.readValue(json, Usuario.class);
        //El objeto mensa es el objeto ya traducido de json a java, ahora lo guardamos por medio del repositorio
        usuarioRepositorio.save(usua);
        //CReamos la notificacion donde se informa a android el estatus del servicio REST (guardar)
        Estatus estatus=new Estatus("Tu usuario se registro bieeeeenn", true);
        //Lo retornamos
        return  estatus;

    }
//Este es el metodo PUT para poder actualizar tu usuario (ya registro) para guardar la localizacion
// en un rango de 1 a 5 segundos, es decir, cada 1 a 5 segundos se actualiza en el back tu localizacion
    @PutMapping("/usuario")
    public   Estatus actualizarUsuario(@RequestBody String json)throws Exception{
        //Recibimos por medio del RequestBody el objeto json proveniente de Android
        ObjectMapper mapper =new ObjectMapper();
        //Ahora vamos a convertir el objeto json que viene de android a objeto Java usando la clase ObjectMapper
        Usuario usua   =   mapper.readValue(json, Usuario.class);

        //Lo buscamos
        Usuario usuarioBuscado=usuarioRepositorio.findById(usua.getEmail()).get();
        //Le asignamos la propiedad localizacion que llego
        usuarioBuscado.setLocalizacion(usua.getLocalizacion());
        //Lo guardamos nuevamente ya con la localizacion
        usuarioRepositorio.save(usuarioBuscado);
        //CReamos la notificacion donde se informa a android el estatus del servicio REST (guardar)
        Estatus estatus=new Estatus("Ya estas geolocaliazdo!!! JAJAJAJAJA ", true);
        //Lo retornamos
        return  estatus;

    }

    @DeleteMapping("/usuario/{id}")
    public Estatus borrarUsuario(@PathVariable String id){
        //Borramos
         usuarioRepositorio.deleteById(id);
         Estatus e=new Estatus("Usuario borrado con exito",true);
        return e;

    }
}
