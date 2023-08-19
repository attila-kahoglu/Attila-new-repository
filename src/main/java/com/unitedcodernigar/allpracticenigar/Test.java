package com.unitedcodernigar.allpracticenigar;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        LinkedList<String> names=new LinkedList<>();
        names.add("Selenium");
        names.addFirst("Java");
        names.addLast("Master");
        System.out.println(names.toString());

        System.out.println("------------2------------");

        for (int i=0;i<7;i++) {
            int g = (int) (Math.random() * (155 - 34 + 1) + 34);

            System.out.print(g+" ");
        }
// Random Class
        Random random = new Random();
        int randomNumber1 = random.nextInt(11)+10;
        System.out.println(randomNumber1);

        // Random Class
        Random random1 = new Random();
        int randomNumber = random.nextInt(11)+10;
        System.out.println(randomNumber);


        System.out.println("Please enter any number : ");
        Scanner scan = new Scanner(System.in);
        int digitNumber = scan.nextInt();
        for (int i=2; i<digitNumber;i++) {
            boolean prime = true;
            for (int j=2; j<i; j++) {
                if (i%j==0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.println(i+" ");
            }
        }


        System.out.println("-----------2-------------");
        String shape = "[]";
        for (int i=2;i<=8;i*=2) {
            for  (int j=1;j<=i;j++){
                System.out.print(shape);
            }
            System.out.println();
        }

        System.out.println("-----------3-------------");
        System.out.println("Please enter number of row that you want print ");
        int n1 = scan.nextInt();
        for (int i=1;i<=n1;i++) {
            for (int j=1;j<=Math.pow(2,i);j++) {
                System.out.print(shape);
            }
            System.out.println();
        }












    }
}
