package com.test.docker.dockerspringboot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloResource {

    @GetMapping
    public String hello() {
        return "Palo IT";
    }
    
    @PostMapping("/")
    public String hola() {
    	return "Hola";
    }
    
    

}
