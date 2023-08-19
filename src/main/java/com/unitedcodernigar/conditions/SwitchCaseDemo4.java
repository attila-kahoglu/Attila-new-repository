package com.unitedcodernigar.conditions;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class SwitchCaseDemo4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String number = input.next();
        if (StringUtils.isNumeric(number)) {
            switch (number.length()) {
                case 1:
                    System.out.println("one digit");
                    break;
                case 2:
                    System.out.println("Two digit");
                    break;
                case 3:
                    System.out.println("Three digit");
                    break;
                default:
                    System.out.println("NUmber is grated than 1000");
            }
        }
        else {
            System.out.println("Please enter digit number");
        }
    }
}
