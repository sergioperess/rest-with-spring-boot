package com.example.restwithspringboot;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Controlador REST, facilita nas requisições web
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    // Mapeia uma requisição para um método e o torna em http
    @RequestMapping("/greeting")
    public Greeting greeting(

        // Passa uma variável por parametro e seta na variavel name, se não passar nada, o váriavel é o default
        @RequestParam(value = "name", defaultValue  = "World") 
        String name){
            return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
