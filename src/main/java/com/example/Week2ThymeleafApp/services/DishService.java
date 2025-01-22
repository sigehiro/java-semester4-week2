package com.example.Week2ThymeleafApp.services;

import com.example.Week2ThymeleafApp.models.Dish;
import com.example.Week2ThymeleafApp.repositories.DishRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {
    //get all dishes from the repository

    public List<Dish> getAllDishes() {
        //business logic should have been here
        return DishRepository.getAllDishes();
    }
}
