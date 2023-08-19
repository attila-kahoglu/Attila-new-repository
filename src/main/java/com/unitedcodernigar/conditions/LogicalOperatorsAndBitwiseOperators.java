package com.unitedcodernigar.conditions;

public class LogicalOperatorsAndBitwiseOperators {
    public static void main(String[] args) {

        // &&    &
        boolean b1 = false;
        int number = 200;
        if (b1 && (number++ > 0)) {       // 200
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        System.out.println("Value of number is :"+number);  // 200

        int number1 = 300;
        if (b1 & (number1++ > 0)) {       // 301
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        System.out.println("Value of number is : "+number1);  // 301
    }
}
