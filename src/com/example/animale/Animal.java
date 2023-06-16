package com.example.animale;


public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String getType();
    public abstract String makeSound();

    public String getName() {
        return name;
    }
}






