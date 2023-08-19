package com.unitedcodernigar.oopsconcept.polymorphism;

public class Cat extends Animal{

    @Override
    public void animalSound(){
        System.out.println("The cat says: meow meow ");
    }

    public void animalEat(String foodName){
        System.out.println("The cat eats "+foodName);
    }

    public void catRun(){
        System.out.println("Cat is running !!");
    }


}
