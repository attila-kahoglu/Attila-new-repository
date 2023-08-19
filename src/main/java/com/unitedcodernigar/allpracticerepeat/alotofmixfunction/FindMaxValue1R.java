package com.unitedcodernigar.allpracticerepeat.alotofmixfunction;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxValue1R {
    public static void main(String[] args) {

        System.out.println("Please enter digit number ! :");
        Scanner deaf = new Scanner(System.in);
        int length =  deaf.nextInt();
        int[] arr = new int[length];
        int maxValue = 0;
        for (int i=0;i<arr.length;i++) {
            arr[i] = (int)(Math.random()*(100-30+1)+30);
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Max number is : "+maxValue);

        int[] arr1 = new int[length];
        int minValue = 100;
        for (int i=0;i<arr1.length;i++) {
            arr1[i] = (int)(Math.random()*(100-40+1)+40);
            if (arr1[i] < minValue) {
                minValue = arr1[i];
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("Min number is : "+minValue);



        int[] arr2 = new int[length];
        int minValue1 =0;
        for (int i=0;i<arr2.length;i++) {
            arr2[i] = (int)(Math.random()*(100-40+1)+40);
            if (i==0) {
                minValue1 = arr2[0];
            }
            else if (minValue1 > arr2[i]) {
                minValue1 = arr2[i];
            }
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println("Min number is :"+minValue1);

        System.out.println("-------------2-----------------\n");

        int[] wave = new int[length];
        int max1 = 0;
        for (int i=0;i<wave.length;i++) {
            wave[i] = (int)(Math.random()*(100-50+1)+50);
            if (wave[i] > max1) {
                max1 = wave[i];
            }
        }
        System.out.println(Arrays.toString(wave));
        System.out.println("Max number is : "+max1);

        int[] deal = new int[length];
        int min = 0;
        for (int i=0;i<deal.length;i++) {
            deal[i] = (int)(Math.random()*(100-20+1)+20);
            if (i==0) {
                min = deal[0];
            }
            else if (min > deal[i]) {
                min = deal[i];
            }
        }
        System.out.println(Arrays.toString(deal));
        System.out.println("Min number is :"+min);


        System.out.println("Please enter digit number ! :");
        Scanner ignore = new Scanner(System.in);
        int settle = ignore.nextInt();
        int[] confuse = new int[settle];
        int max2 = 0;
        for (int i=0;i<confuse.length;i++) {
            confuse[i] = (int)(Math.random()*(100-30+1)+30);
            if (confuse[i] > max2) {
                max2 = confuse[i];
            }
        }
        System.out.println(Arrays.toString(confuse));
        System.out.println("Max number is : "+max2);

        int[] regret = new int[settle];
        int min1 = 0;
        for (int i=0;i<regret.length;i++) {
            regret[i] = (int)(Math.random()*(100-30+1)+30);
            if (i==0) {
                min1 = regret[0];
            }
            else if (min1 > regret[i]) {
                min1 = regret[i];
            }
        }
        System.out.println(Arrays.toString(regret));
        System.out.println("Min number is : "+min1);



    }
}
