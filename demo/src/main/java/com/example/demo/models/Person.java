package com.example.demo.models;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {
  @Id 
    private Long id;

    private String name;
    private int age;
    private String gender;
  
}
