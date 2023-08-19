package com.unitedcodernigar.oopsconcept.polymorphism;

public class AnimalApplication {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.animalSound();
        animal.animalEat("Animal foods");


        Cat cat = new Cat();
        cat.animalSound();
        cat.animalEat("fish");
        cat.catRun();
        cat.animalSleep();

        Dog dog = new Dog();
        dog.animalSound();
        dog.animalEat("bone");
        dog.dogRuns();
        dog.animalSleep();

        System.out.println("Cat Object with Animal object reference ");
        Animal c = new Cat();
        c.animalEat("Food");
        c.animalSound();

        Animal d = new Dog();
        d.animalSound();
        d.animalEat("Good food");
        d.animalSleep();

       // Cat f = (Cat)new Animal();







    }
}
