package com.example.animale;

public class AnimalFactory {
    public static Animal createAnimal(String type, String name) {
        if (type.equalsIgnoreCase("dog")) {
            return new Dog(name);
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat(name);
        } else if (type.equalsIgnoreCase("cow")) {
            return new Cow(name);
        }
        return null;
    }
}