package com.example.Week2ThymeleafApp.repositories;

import com.example.Week2ThymeleafApp.models.Dish;

import java.util.ArrayList;
import java.util.List;

public class DishRepository {
    private static List<Dish> dishes = new ArrayList<>();

    public static List<Dish> getAllDishes() {
//        Dish d1 = Dish.builder().id(1).name("Pizza").category("Main Course").price(10.0).build();
//        Dish d2 = Dish.builder().id(2).name("Pasta").category("Main Course").price(8.0).build();
//        Dish d3 = Dish.builder().id(3).name("Salad").category("Appetizer").price(5.0).build();
//        Dish d4 = Dish.builder().id(4).name("Ice Cream").category("Dessert").price(3.0).build();


        //同じものだけど、書き方をが２種類あるので、その例を示している
        //その１
        dishes.add(new Dish(1, "Pizza", "Main Course", 10.0));
        //その２
        dishes.add(
                Dish.builder().id(1).name("Pizza").category("Main Course").price(10.0).build()
        )

        return dishes;
    }

}
