package com.unitedcodernigar.conditions;

import java.util.Scanner;

public class ATMDemo1 {
    public static void main(String[] args) {


        // Pin number
        int correctPin = 1234;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your pin number");
        int pin = input.nextInt();
        if (pin == correctPin){
            System.out.println("Your account number is 7123486544688");
            System.out.println("Your account balance is 10000$");
        }
        else {
            System.out.println("You entered wrong pin number");
            System.out.println("Please try again with correct pin number");
        }



    }
}
