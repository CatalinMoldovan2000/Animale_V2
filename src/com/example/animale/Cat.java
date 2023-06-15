package com.example.animale;

public class Cat extends Animal {
    @Override
    public String getType() {
        return "Cat";
    }

    @Override
    public String makeSound() {
        return "Meow";
    }
}