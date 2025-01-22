package com.example.Week2ThymeleafApp.controllers;

import com.example.Week2ThymeleafApp.services.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/restaurant")
public class DishController {

    @Autowired
    private DishService dishService;

    @Value("${restaurant.name}")
    private String restaurantName;

    //endpoint for home page
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("rName", restaurantName);
        return "home";
    }

    //endpoint for main page
    @GetMapping("/menu")
    public String menu(Model model) {
        model.addAttribute("dishes", dishService.getAllDishes());
        return "menu";
    }






}
