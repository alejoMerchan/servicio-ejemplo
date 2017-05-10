package com.meetup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by abelmeos on 2017/05/10.
 */

/**
 * Indica al framework que esta es la bootstrap class para el proyecto.
 */

@SpringBootApplication
public class Application {

    public static void main(String[] args){
        // llamado para iniciar el servicio spring boot.
        /**
         * Se inicia el spring container (cargando todos los spring beans del proyecto (@Component, @service , @Repository ...))
         */
        SpringApplication.run(Application.class, args);
    }

}
