package com.meetup.controller;

import com.meetup.message.MeetupRequest;
import org.springframework.web.bind.annotation.*;

/**
 * Las clases Controller exponen los endponits de los servicos  y mapean las peticiones http
 * a metodos Java para ser procesadas.
 */

@RestController // esta anotacion automaticamente serializa la data en json (por defecto.. tambien podria ser xml)
@RequestMapping(value = "meetup/springboot/ejemplo")
public class ServiceController {

    @RequestMapping(value = "/getHola" , method = RequestMethod.GET)
    public String getSaludo(){

        return "hola spring boot";

    }

    @RequestMapping(value = "/{nombre}", method = RequestMethod.POST)
    public String postSaludo(@PathVariable("nombre") String nombre){

        // hago algo...

        return "hola " + nombre;

    }

    @RequestMapping(value = "/postHola", method = RequestMethod.POST)
    public String postSaludoRequest(@RequestBody MeetupRequest meetupRequest){

        // hago algo...

        return "hola " + meetupRequest.getNombre() + " " + meetupRequest.getApellido();

    }
}
