package com.example.tiendaropa.entities;



import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Entity
public class CamisaEntity {
    //@Id
    private UUID id;
    private String size;
    private String color;
    private double price;
    private int stock;

    public void setId(UUID uuid) {
    }

    // Getters y Setters
}
