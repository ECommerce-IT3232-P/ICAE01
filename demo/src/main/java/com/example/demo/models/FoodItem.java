package com.example.demo.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class FoodItem {
    @Id

    private Long id;

    private String name;
    private double price;
    private double weight;

    @ManyToMany(mappedBy = "foodItems")
    private List<DailyMenu> dailyMenus;

    @OneToMany(mappedBy = "foodItem")
    private List<OrderLine> orderLines;

}
