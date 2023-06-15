package com.example.animale;

public class Cow extends Animal {
    @Override
    public String getName() {
        return "Cow";
    }

    @Override
    public String makeSound() {
        return "Moo";
    }
}