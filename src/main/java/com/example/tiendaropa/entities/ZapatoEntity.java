package com.example.tiendaropa.entities;

import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ZapatoEntity {
    @Id
    private UUID id;

    private String size;
    private String color;
    private double price;
    private int stock;

    // Constructor
    public ZapatoEntity() {
        this.id = UUID.randomUUID(); // Genera un ID único al crear un nuevo ZapatoEntity
    }

    // Getter y Setter para id
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    // Getters y Setters para los demás campos
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}