package com.unitedcodernigar.detatypes;

public class ReferenceValue {
    public static void main(String[] args) {

        int x = 900;
        int y = 100;
        // y = 900   x = 100
        int tempValue  = x;
        x = y;                    //100
        y = tempValue;            //900
        System.out.println("Value of x is: "+x);
        System.out.println("Value of y is: "+y);
    }
}
