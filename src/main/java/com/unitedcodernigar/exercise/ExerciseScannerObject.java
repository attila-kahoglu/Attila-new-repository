package com.unitedcodernigar.exercise;

import java.util.Scanner;

public class ExerciseScannerObject {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter one digit number");
        int a = input.nextInt();
        System.out.println("Please enter the digit second number");
        int b = input.nextInt();
        System.out.printf("Please enter result of %d + %d\n",a,b);
        int c = input.nextInt();
        if (c==a+b){
            System.out.println("Your answer is correct!!!");
        }
        else {
            System.out.println("wrong answer");
        }
    }
}
