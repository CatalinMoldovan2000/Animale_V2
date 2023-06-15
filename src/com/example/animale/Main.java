package com.example.animale;

public class Main {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.createAnimal("dog");
        Animal cat = AnimalFactory.createAnimal("cat");
        Animal cow = AnimalFactory.createAnimal("cow");

        if (dog != null) {
            System.out.println(dog.getType() + " makes sound: " + dog.makeSound());
        }

        if (cat != null) {
            System.out.println(cat.getType() + " makes sound: " + cat.makeSound());
        }

        if (cow != null) {
            System.out.println(cow.getType() + " makes sound: " + cow.makeSound());
        }
    }
}
