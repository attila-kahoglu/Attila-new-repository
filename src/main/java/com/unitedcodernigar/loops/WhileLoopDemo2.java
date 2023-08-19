package com.unitedcodernigar.loops;

import java.util.Scanner;

public class WhileLoopDemo2 {
    public static void main(String[] args) {

        // Scanner  0

        Scanner input = new Scanner(System.in);

        int positiveNumberCount =0;
        int negativeNumberCount =0;
        while (true) {
            int number = input.nextInt();
            if (number>0) {
                positiveNumberCount++;
                if (number==1) {
                    break;
                }
            }
            else if (number<0) {
                negativeNumberCount++;
            }
            else {
                break;
            }
        }
        System.out.println("Positive Numbers: "+positiveNumberCount);
        System.out.println("Negative Numbers: "+negativeNumberCount);

    }
}
