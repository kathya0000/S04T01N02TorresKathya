package cat.itacademy.barcelonactiva.torres.kathya.s04.t01.n02.S04T01N02TorresKathya.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    public class HolaMundoRestController {

        @GetMapping({"/helloWorld2", "/helloWorld2/{nombre}"})
        public String saluda2(@PathVariable(required = false) String nombre) {
            if (nombre == null) {
                nombre = "UNKNOWN";
            }
            return "Hola, " + nombre + ". Estás ejecutando un proyecto Maven.";
        }

        @GetMapping("/HolaMundo")
        public String saluda(@RequestParam(name = "nom", defaultValue = "UNKNOWN") String nombre) {
            return "Hola, " + nombre + ". Estás ejecutando un proyecto Maven.";
        }


    }


