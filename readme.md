# Smart Canteen Management System - University of Vavuniya

## Overview

The **Smart Canteen Management System** is a backend solution built with **Spring Boot** to efficiently manage food services across multiple canteens located on the University of Vavuniya campus. This system handles daily food menus, student orders, and employee associations with canteens.

## Features

- **Multiple Canteen Management**: Supports multiple canteens at different campus locations.
- **Food Items Registry**: Maintains a university-approved food list with name, price, and weight.
- **Daily Menu System**: Each canteen can offer different menus on different days.
- **User Management**:
  - **Students**: Can browse menus and place food orders.
  - **Employees**: Have job positions and can be linked to multiple canteens.
- **Order Management**:
  - Students can place multiple food orders.
  - Each order can contain multiple items (order lines) with specific quantities.
  - Every order records the date it was placed.

## Entity Relationships

- **Canteen**
  - `OneToMany` → DailyMenu
  - `ManyToMany` ← Employee

- **FoodItem**
  - `ManyToMany` → DailyMenu
  - `OneToMany` ← OrderLine

- **DailyMenu**
  - `ManyToOne` → Canteen
  - `ManyToMany` → FoodItem

- **Person** (Abstract)
  - Common fields: ID, name, age, gender
  - Subclasses:
    - **Student**
      - `OneToMany` → FoodOrder
    - **Employee**
      - `ManyToMany` → Canteen

- **FoodOrder**
  - `ManyToOne` → Student
  - `OneToMany` → OrderLine
  - Attributes: Order date

- **OrderLine**
  - `ManyToOne` → FoodOrder
  - `ManyToOne` → FoodItem
  - Attributes: quantity

