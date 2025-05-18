package com.example.demo.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Student extends Person {
  private String academicDegree;

    @OneToMany(mappedBy = "student")
    private List<FoodOrder> foodOrders;
  
}
