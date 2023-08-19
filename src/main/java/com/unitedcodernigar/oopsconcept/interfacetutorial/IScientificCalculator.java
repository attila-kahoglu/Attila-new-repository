package com.unitedcodernigar.oopsconcept.interfacetutorial;

public interface IScientificCalculator {

    // all variables in interface are static final by default, you can not change body and give body . // no implementation
    static final String version = "2.0";
    double calculatePower(int base, int power);
    double calculateSquareRoot(long l);
    double calculateAbsoluteValue(int x);
    double minValue(int x, int y);


}
