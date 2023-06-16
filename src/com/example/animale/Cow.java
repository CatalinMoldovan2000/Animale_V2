package com.example.animale;

public class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Cow";
    }

    @Override
    public String makeSound() {
        return "Moo";
    }
}