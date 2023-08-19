package com.unitedcodernigar.conditions;

import java.util.Scanner;

public class FindMaxNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number :");
        int number1 = input.nextInt();
        System.out.println("Please enter second digit number :");
        int number2 = input.nextInt();
        System.out.println("Please enter third digit number :");
        int number3 = input.nextInt();
        // 100 300 200
        if (number1 > number2 && number1 > number3) {
            System.out.printf("%d is biggest number \n",number1);
        }
        else if (number2 > number3) {
            System.out.printf("%d is biggest number \n",number2);
        }
        else {
            System.out.printf("%d is biggest number \n",number3);
        }
    }
}
