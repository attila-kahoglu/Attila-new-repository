package com.unitedcodernigar.oopsconcept.polymorphism;

public class MethodOverLoading {

    public void sum(int a, int b){
        System.out.println(a+b);
    }

    public void sum(double a, int b){
        System.out.println(a+b);
    }

    public void sum(double a, float b){
        System.out.println(a+b);
    }




}
