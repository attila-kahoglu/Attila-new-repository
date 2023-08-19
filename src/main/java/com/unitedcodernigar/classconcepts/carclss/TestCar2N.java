package com.unitedcodernigar.classconcepts.carclss;

import com.unitedcodernigar.classconcepts.carclss.Car1N;

public class TestCar2N {
    public static void main(String[] args) {

        Car1N car1 = new Car1N(); // if you want to see all parameter you can "Command P" button click in the break!
        Car1N car2 = new Car1N("Toyota","japan","White",1000,30000,2023,"2..3");
        System.out.println(car1.getBran());
        System.out.println(car2.getBran());

        System.out.println("---------------------2---------------------");


        // car array object
        Car1N[] cars = new Car1N[3];
        Car1N car3 = new Car1N("BMW","German","Black",1500,40000,2023,"3..1");
        Car1N car4 = new Car1N("KIA","Spanish","Silver",1000,30000,2023,"3..0");
        Car1N car5 = new Car1N("Ford","Italy","Blue",1100,25000,2023,"2..3");
        cars[0] = car3;
        cars[1] = car4;
        cars[2] = car5;

        for (Car1N c : cars) {
            //System.out.println(c.toString());
            System.out.println(c.getBran()+" "+c.getMade()+" "+c.getColor()+" "+c.getPrice());
            System.out.println();
        }





    }
}
