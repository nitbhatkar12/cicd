package com.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/welcome")
    public String displayMessage(){
        return "Welcome to CICD!";
    }

    @GetMapping("/cicd")
    public String displayCicd(){
        return "Welcome to CICD!";
    }

    @GetMapping("/auto")
    public String displayAuto(){
        return "Welcome to CICD!";
    }
}
