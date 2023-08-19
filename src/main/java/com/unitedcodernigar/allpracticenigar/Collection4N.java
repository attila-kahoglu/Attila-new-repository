package com.unitedcodernigar.allpracticenigar;

import java.util.Arrays;
import java.util.Scanner;

public class Collection4N {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int mix = input.nextInt();

        int[] ascending = new int[mix];
        for (int i=0;i<ascending.length;i++) {
            ascending[i] = (int)(Math.random()*100+1);
        }

        System.out.println(Arrays.toString(ascending));
        Arrays.sort(ascending);
        System.out.println(Arrays.toString(ascending));

        System.out.println("--------------2-------------");

        int[] arr1 = new int[mix];
        for (int i=0; i<arr1.length;i++) {
            arr1[i] = (int)(Math.random()*100+1);
        }
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("-------------3--------------");

        int[] arr2 = new int[mix];
        for (int i=0;i<arr2.length;i++) {
            arr2[i] = (int)(Math.random()*100+1);
        }
        System.out.println();
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("-------------4----------------");

        //int[] arr3 = new int[mix];
        for (int i=arr2.length-1;i>=0;i--) {
            System.out.print(arr2[i]+" ");
        }
        //System.out.println(Arrays.toString(arr2));
        //Arrays.sort(arr2);
        //System.out.println(Arrays.toString(arr2));



    }
}
