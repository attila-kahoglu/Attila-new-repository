package com.unitedcodernigar.loops;

public class ForLoopDemo2 {
    public static void main(String[] args) {

        // 1-10    sum
        //

        int sum = 0;    // 55
        for (int i=1; i<=10; i++) {
            sum += i; // sum=sum+i
            System.out.printf("i=%d sum=%d\n",i,sum);
        }
        System.out.println("Total sum: "+sum);
        System.out.println("******************************");

        int total =  0;         // 15
        for (int i = 0; i <= 5; i++) {
            total += i;
        }
        System.out.println(total);
        System.out.println("********************************");

        // 1-5 factorial 1*2*3*4*5 5*4*3*2*1
        int factorial = 1;          // 120
        for (int i = 1; i <= 5; i++) {
            factorial *= i;  // factorial = factorial * i
        }
        System.out.println(factorial);
        System.out.println("**********************");

        int car = 1;
        for (int i = 5; i <= 1; i++) {
            car *= i;
        }
        System.out.println(car);
        System.out.println("**********************************\n");

        // Count even numbers
        int evenNumberAccount = 0;
        for (int i = 0; i<=100; i++) {
            if (i !=0 && i % 2 == 0) {
                //System.out.println(i+" ");
                evenNumberAccount++;
            }
        }
        System.out.println("Total even numbers is : "+evenNumberAccount);

    }
}
