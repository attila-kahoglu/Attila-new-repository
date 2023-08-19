package com.unitedcodernigar.exercise;

import java.util.Scanner;

public class ExerciseScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your real name");
        String realName = input.nextLine();
        System.out.println("Please enter your nickname");
        String nickName = input.nextLine();
        System.out.println("Please enter your phone number");
        String  number = input.nextLine();
        System.out.println("Please enter your full address");
        String address = input.nextLine();
        //System.out.printf("User full address is %s %s %s %s",realName,nickName,number,address);

        System.out.printf("User full address and full name is: \t%s \t %s \t%s \t%s",realName,nickName,number,address);



    }
}
