package com.example.animale;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Cat";
    }

    @Override
    public String makeSound() {
        return "Meow";
    }
}
