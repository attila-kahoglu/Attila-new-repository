package com.unitedcodernigar.oopsconcept.interfacetutorial;

public interface SimpleCalculator {

    // interface -- 100% abstraction,
    public abstract   // it is not necessary
    // only accept abstract method
    // all variables in interface are static final by default,
    // all method in interface are public abstract by default,
    double addTwoNumbers(int a, int b); // method name, return type, arguments no implementation,
    int addMultipleNumbers(int...numbers);
    double multiplyTwoNumbers(double d1, double d2);
    float divideTwoNumbers(double x, double y);
    long subtractTwoNumbers(long l1, long l2);
    void printCalculatorInfo();

}
