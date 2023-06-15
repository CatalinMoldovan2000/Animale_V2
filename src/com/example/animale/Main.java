package com.example.animale;

public class Main {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.createAnimal("dog");
        Animal cat = AnimalFactory.createAnimal("cat");
        Animal cow = AnimalFactory.createAnimal("cow");

        if (dog != null) {
            System.out.println(dog.getName() + " makes sound: " + dog.makeSound());
        }

        if (cat != null) {
            System.out.println(cat.getName() + " makes sound: " + cat.makeSound());
        }

        if (cow != null) {
            System.out.println(cow.getName() + " makes sound: " + cow.makeSound());
        }
    }
}
