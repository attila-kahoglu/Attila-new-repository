package com.unitedcodernigar.conditions;

import java.util.Scanner;

public class SwitchCaseDemo3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number >= 0 && number <10) {
            System.out.println("one digit");
        }
        else if (number >= 10 && number < 100) {
            System.out.println("Two digit");
        }
        else if (number >=100 && number < 1000) {
            System.out.println("three digits");
        }
        else {
            System.out.println("Number is greater than 1000");
        }




    }
}
