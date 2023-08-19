package com.unitedcodernigar.conditions;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ATMDemo4 {

    public static void main(String[] args) {


        // Pin number
        int correctPin = 1234;
        int balance = 100000;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your pin number");
        String pin = input.nextLine();
        if (StringUtils.isNumeric(pin)) {
            if (Integer.parseInt(pin) == correctPin) {
                System.out.println("Please select the menu: Transfer money, deposit money, withdraw money");
                String selectedMenu = input.nextLine();
                if (selectedMenu.equalsIgnoreCase("withdraw money")) {
                    System.out.println("Please select withdraw amount!!");
                    int withDrawAmount = input.nextInt();
                    if (withDrawAmount <= balance) {
                        System.out.println("Please take you money!! Enjoy!!!!");
                        System.out.printf("Your current balance is %d\n  ", balance - withDrawAmount);
                    } else {
                        System.out.println("Insufficient amount!");
                        System.out.println("Withdraw amount is greater than our balance!!");
                    }

                } else if (selectedMenu.equalsIgnoreCase("deposit money")) {
                        System.out.println("Please put your money into the machine");
                        int money = input.nextInt();
                        System.out.printf("You have deposited %d amount\n",money);
                        System.out.printf("Your current balance is %d",balance+money);

                } else if (selectedMenu.equalsIgnoreCase("Transfer mooney")) {
                    System.out.println("Please enter the amount 10-10000");
                    int transfer = input.nextInt();
                    if (transfer >= 10 && transfer < 10000) {
                        System.out.println("Your money has been sent successfully!!");
                        if (transfer <= 10001) {
                            System.out.println("The money limit you want to send is too high!, please enter the appropriate limit !!");
                        } else if (transfer <= 9) {
                            System.out.println("The amount yu want to send is below the limit amount!, pleas enter a valid limit !!");
                        }
                    }
                }

            }
            else {
                System.out.println("You entered wrong pin number, please try again with correct pin !!!");
            }
        }
        else {
            System.out.println("Please enter Valid 4 digit numbers");
            System.out.println("Please try again with correct digit pin number");
        }


    }


}

