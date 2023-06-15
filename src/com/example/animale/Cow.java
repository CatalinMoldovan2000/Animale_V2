package com.example.animale;

public class Cow extends Animal {
    @Override
    public String getType() {
        return "Cow";
    }

    @Override
    public String makeSound() {
        return "Moo";
    }
}