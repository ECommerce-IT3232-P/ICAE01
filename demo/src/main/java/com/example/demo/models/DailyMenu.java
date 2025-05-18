package com.example.demo.models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class DailyMenu {
   @Id
    private Long id;

    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "canteen_id")
    private Canteen canteen;

   
    @ManyToMany
    @JoinTable(
        name = "menu_food_item",
        joinColumns = @JoinColumn(name = "menu_id"),
        inverseJoinColumns = @JoinColumn(name = "food_item_id")
    )
    private List<FoodItem> foodItems;   
}
