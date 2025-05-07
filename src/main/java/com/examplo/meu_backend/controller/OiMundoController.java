package com.examplo.meu_backend.controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/Oi-Mundo")
public class OiMundoController {
    @GetMapping
    public String OiMundo(){
        return "Oiie Mundão!";
    }

    @PostMapping("")
    public String OiMundoPost(@RequestBody User body){
        return "Oiee Mundão " + body.getName();
    }
}

