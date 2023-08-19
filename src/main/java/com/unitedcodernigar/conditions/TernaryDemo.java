package com.unitedcodernigar.conditions;

import java.util.Scanner;

public class TernaryDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number :");
        int number = input.nextInt();
        System.out.println("Please enter second digit number :");
        int number1 = input.nextInt();
        int maxNumber = number > number1 ? number : number1;
        System.out.println("Max number is :"+maxNumber);
        int minNumber = number < number1 ? number : number1;
        System.out.println("Min number is :"+minNumber);

    }
}
