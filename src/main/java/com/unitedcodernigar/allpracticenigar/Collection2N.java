package com.unitedcodernigar.allpracticenigar;

import java.util.Arrays;

public class Collection2N {
    public static void main(String[] args) {

        int[] boos = {32,53,65,76,87,8};
        System.out.println(boos.length);
        System.out.println(boos[5]);

        // for each loop
        for (int a : boos) {
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("---------2------------");

        int sum = 0;
        for (int i=0;i<boos.length;i++) {
            sum+=boos[i];
        }
        System.out.println(sum);

        System.out.println("----------3--------------");

        int sum1=0;
        for(int b:boos) {
            System.out.print(b+" ");
        }
        System.out.println();
        System.out.println(sum1);

        System.out.println("----------4------------");
        // Copy of two array
        int[] student1 = {56,76,89,54,65};
        int[] student2 = {34,56,78,98,23};
        int[] student3 = {45,67,87,98,90};

        for (int a : student1) {
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println(student1.length);

        System.out.println("-----------5------------");

        boolean result1 = Arrays.equals(student1,student2);
        boolean result2 = Arrays.equals(student2,student3);
        System.out.println(result1);
        System.out.println(result2);

        Arrays.fill(student1,20);
        System.out.println(Arrays.toString(student1));

        int[] Student4 = Arrays.copyOf(student3,5);
        System.out.println(Arrays.toString(student3));

        System.out.println("-------------6----------------");

        // copy of two array
        int[] array1 = new int[student2.length];
        for (int i=0; i<student2.length;i++) {
            array1[i] = student2[i];
        }
        System.out.println(Arrays.toString(array1));

        System.out.println("-------------7-----------------");

        int[] a = {32,12,32,5,465,};
        int[] a1= {55,23,89,23};
        int[] a2= {11,65,98,9};

        int[] arr1 = new int[a.length];
        for (int i=0; i< a.length;i++) {
            arr1[i] = a[i];
        }
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[a1.length];
        for (int i=0; i<a1.length;i++) {
            arr2[i] = a1[i];
        }
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[a2.length];
        for (int i=0;i<a2.length;i++) {
            arr3[i] = a2[i];
        }
        System.out.println(Arrays.toString(arr3));

        Arrays.fill(a1,34);
        System.out.println(Arrays.toString(a1));

        System.out.println("------------8-------------");

        int[] m = {12,34,32,43,45,4};
        System.out.println(Arrays.toString(m));
        int[] n = new int[m.length];
        for (int i=0;i<n.length;i++) {
            n[i] = m[i];
        }
        System.out.println(Arrays.toString(n));

        int sum3 = 0;
        for (int i=0;i<m.length;i++) {
            sum3 += m[i];
            System.out.print(m[i]+" ");
        }
        System.out.println("\nTotal sum : "+sum3);

        int sum5 = 0;
        for (int v:m) {
            sum5 += v;
            System.out.print(v+" ");
        }
        System.out.println("\nTotal sum : "+sum5);

        System.out.println("-----------------9--------------------");

        int[] h = {43,23,3,32,34,45,10,12,76,54,98};
        System.out.println(Arrays.toString(h));





    }
}
