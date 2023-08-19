package com.unitedcodernigar.classconcepts.carclss;

import com.unitedcodernigar.classconcepts.carclss.Car1N;

import java.util.ArrayList;

public class TestCar1N {
    public static void main(String[] args) {

        Car1N toyota = new Car1N();
        toyota.setBran("Toyota");
        toyota.setMade("Japan");
        toyota.setColor("White");
        toyota.setYear(2023);
        toyota.setPrice(35000);
        toyota.setMileAge(1000);
        toyota.setGetEngineType("2.0");


        Car1N honda = new Car1N();
        honda.setBran("Honda");
        honda.setMade("Japan");
        honda.setColor("Pink");
        honda.setYear(2023);
        honda.setPrice(35000);
        honda.setMileAge(1000);
        honda.setGetEngineType("2.6");


        Car1N benz = new Car1N();
        benz.setBran("Benz");
        benz.setMade("German");
        benz.setColor("Black");
        benz.setYear(2023);
        benz.setPrice(35000);
        benz.setMileAge(1000);
        benz.setGetEngineType("3.4");

        //System.out.println(toyota.carInfo());  you can do it this way , it is easy actually!

        System.out.println(toyota.getColor());
        System.out.println(benz.getMade());
        System.out.println(honda.getMileAge());

        ArrayList<Car1N>  carList = new ArrayList<>();
        carList.add(toyota);
        carList.add(honda);
        carList.add(benz);

        for (Car1N cars : carList) {
            if (cars.getBran().equalsIgnoreCase("Honda"))
            System.out.println(String.format(" %s  %s  %s  %d  %d  %d  %s ",
                    cars.getBran(),
                    cars.getMade(),
                    cars.getColor(),
                    cars.getYear(),
                    cars.getPrice(),
                    cars.getMileAge(),
                    cars.getGetEngineType()));
        }



    }
}
