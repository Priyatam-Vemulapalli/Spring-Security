package com.example.security.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/home")
    public String home(){
        return "This is home page";
    }

    @GetMapping("/admin")
    public String admin(){
        return "This is admin page";
    }

    @GetMapping("/student")
    public String student(){
        return "This is student page";
    }
}
