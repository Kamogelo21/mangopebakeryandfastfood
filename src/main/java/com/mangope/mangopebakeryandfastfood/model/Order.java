package com.mangope.mangopebakeryandfastfood.model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String item;
    private int quantity;

    public String getName() { return name; }
    public String getItem() { return item; }
    public int getQuantity() { return quantity; }

    // getters & setters
}