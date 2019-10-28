package com.example.demo.controllers;

import com.example.demo.data.Ingredient;
import lombok.Data;
import java.util.List;

@Data
public class Taco {
    private String name;
    private List<Ingredient> ingredients;
}
