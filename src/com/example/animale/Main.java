package com.example.animale;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Dante");
        Animal cat = new Cat("Thomas");
        Animal cow = new Cow("Viorica");

        if (dog != null) {
            System.out.println(dog.getName() + " the " + dog.getType() + " makes this sound: " + dog.makeSound());
        }

        if (cat != null) {
            System.out.println(cat.getName() + " the " + cat.getType() + " makes this sound: " + cat.makeSound());
        }

        if (cow != null) {
            System.out.println(cow.getName() + " the " + cow.getType() + " makes this sound: " + cow.makeSound());
        }
    }
}
