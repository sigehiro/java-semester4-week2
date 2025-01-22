package com.example.Week2ThymeleafApp.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Dish {
    private String name;
    private String category;
    private int id;
    private double price;


}
