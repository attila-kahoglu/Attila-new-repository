package com.unitedcodernigar.allpracticenigar;

import java.util.Arrays;
import java.util.Scanner;

public class Collection3N {
    public static void main(String[] args) {

        // Split
        String school = "United_Coder";
        String say = "Hello,World";

        String[] arr1 = school.split("_");
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

        System.out.println();

        for (String a : arr1) {
            System.out.println(a);
        }

        System.out.println("----------2---------------");

        String[] arr2 = say.split(",");
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

        for (String b : arr2) {
            System.out.println(b);
        }

        System.out.println("----------3--------------");

        String q = "Turkey_is_big_country";
        String[] w = q.split("_");
        System.out.println(Arrays.toString(w));

        System.out.println(w[0]);
        System.out.println(w[1]);
        System.out.println(w[2]);
        System.out.println(w[3]);

        System.out.println();

        for (String r : w) {
            System.out.println(r);
        }

        String l = "canada";
        char[] j = new char[l.length()];
        for (int i=0;i<l.length();i++) {
            j[i] = l.charAt(i);
        }
        System.out.println(Arrays.toString(j));

        String et = "Uyghur";
        char[] uy = new char[et.length()];
        for (int i=0;i<et.length();i++) {
            uy[i] = et.charAt(i);
        }
        System.out.println(Arrays.toString(uy));

        String name = "Abdulla";
        char[] d = new char[name.length()];
        for (int i=0;i<name.length();i++) {
            d[i] = name.charAt(i);
        }
        System.out.println(Arrays.toString(d));



        System.out.println("------------4-------------");

        String city = "Istanbul";
        char[] c = new char[city.length()];
        for (int i=0; i<city.length();i++){
            c[i] = city.charAt(i);
        }
        System.out.println(Arrays.toString(c));
        System.out.println();

        String city1 = "Ankara";
        char[] n = new char[city1.length()];
        for (int i=0;i<city1.length();i++) {
            n[i] = city1.charAt(i);
        }
        System.out.println(Arrays.toString(n));

        System.out.println("--------------5--------------");

        // Find max value array
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of an array: ");
        int length = scan.nextInt();
        int[] arr = new int[length];
        int naxValue = 0;
        for (int i=0;i<arr.length;i++) {
            arr[i] = (int)(Math.random()*100+1);
            if (arr[i]>naxValue) {
                naxValue = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Max number in this array is: "+naxValue);

        // minValue
        int[] array1 = new int[length];
        int minValue = 100;
        for (int i=0; i<array1.length;i++) {
            array1[i] = (int)(Math.random()*100+1);
            if (array1[i]<minValue) {
                minValue = array1[i];
            }
        }
        System.out.println(Arrays.toString(array1));
        System.out.println("Min number in this array is: "+minValue);

        System.out.println();

        int[] array2 = new int[length];
        int minValue2 = 100;
        for (int i=0; i<array1.length;i++) {
            array1[i] = (int)(Math.random()*100+1);
            if (i==0) {
                minValue2 = array2[0];
            }
            else if (minValue2>array2[i]) {
                minValue2 = array2[i];
            }
        }
        System.out.println(Arrays.toString(array1));
        System.out.println("Min number in this array is: "+minValue2);











    }
}
