package com.practise.rest.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Column
    private String name, type, destination;
    @Column
    private int result, tarrif, price, mass;
    @Id
    @GeneratedValue
    private Long id;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }



    public void setTarrif(int tarrif) {
        this.tarrif = tarrif;
    }
    public int getTarrif() {
        return tarrif;
    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }



    public void setId(Long id) {
        this.id = id;
    }

    ;

    @Id
    public Long getId() {
        return id;
    }

    public void setResult(int result) {
        this.result = tarrif+mass*price;
    }
    public int getResult() {
        return result;
    }
}

