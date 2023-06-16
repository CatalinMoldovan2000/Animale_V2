package com.example.animale;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Baw Waw";
    }
}