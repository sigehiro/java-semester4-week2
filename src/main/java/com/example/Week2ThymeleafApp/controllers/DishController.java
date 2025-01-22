package com.example.Week2ThymeleafApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DishController {

    //endpoint for home page
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    //endpoint for main page







}
