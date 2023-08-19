package com.unitedcodernigar.allpracticerepeat.alotofmixfunction;

public class TernaryMixing {
    public static void main(String[] args) {


        // this code ternary nested function !!!
        int n1 = 2, n2 = 9, n3 = -11;

        // nested ternary operator
        // to find the largest number
        int largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);
        System.out.println("Largest Number: " + largest);


        // Example function !!!
        int num = 8;
        String msg = "45";
        if(num > 10) {
            msg = "Number is greater than 10";
        }
        else {
            msg = "Number is less than or equal to 10";
        }
        System.out.println(msg);


        final String msg1 = num > 10
                ? "Number is greater than 10"
                : "Number is less than or equal to 10";

        System.out.println(msg1);


    }
}
