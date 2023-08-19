package com.unitedcodernigar.classconcepts.carclss;

public class Car1N {

    // state    behavior
    // clas  level  variable
    private String brand;
    private String made;
    private String color;
    private long  mileAge;
    private long  price;

    public String getGetEngineType() {
        return getEngineType;
    }

    public void setGetEngineType(String getEngineType) {
        this.getEngineType = getEngineType;
    }

    private long  year;
    private String getEngineType;

    public String getBran() {
        return brand;
    }

    public void setBran(String brand) {
        this.brand = brand;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getMileAge() {
        return mileAge;
    }

    public void setMileAge(long mileAge) {
        this.mileAge = mileAge;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    @Override
    public String toString() {     // method overriding
        return "Car1N{" +
                "bran='" + brand + '\'' +
                ", made='" + made + '\'' +
                ", color='" + color + '\'' +
                ", mileAge=" + mileAge +
                ", price=" + price +
                ", year=" + year +
                ", getEngineType='" + getEngineType + '\'' +
                '}';
    }

     /*                            // this is done another toString shame ,  you can do it , maybe it is easy for you!!
    public String carInfo() {
        return brand+", "+made+", "+color+", "+price+", "+year+", ";
    }
      */

    public Car1N() {  // Default Constructor
        System.out.println("Car Object was created ..... ");     // Actually we didn't write here, don't forget
    }

    public Car1N(String brand, String made, String color, long mileAge, long price, long year, String getEngineType) {
        this.brand = brand;
        this.made = made;
        this.color = color;
        this.mileAge = mileAge;
        this.price = price;
        this.year = year;
        this.getEngineType = getEngineType;
    }








}
