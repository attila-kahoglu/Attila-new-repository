package com.unitedcodernigar.allpracticenigar;

import java.util.Arrays;

public class Collection5N {
    public static void main(String[] args) {

        // Bubble Sort
        int[] a = {20, 10, 5, 30, 25, 70, 55, 90, 77, 0, 60};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int tempValue = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tempValue;
                }
            }
        }
        System.out.println(Arrays.toString(a));

        System.out.println("---------2------------"

        );

        //  Dimension
        int[][] a1 = new int[4][];
        // int[] a2[] = {};
        int[][] array = {
                {1, 2, 3},
                {6, 9, 10, 70},
                {30, 90},
                {20, 80, 30, 5, 8, 10}
        };
        System.out.println(array.length);
        System.out.println(array[1].length);
        System.out.println(array[1][1]);
        System.out.println(array[3][2]);
        System.out.println(array[2][1]);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
                sum += array[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of array: " + sum);

        System.out.println("------------------3-----------------");


        int[][] b = {
                {21, 24, 56, 87, 2, 5,},
                {43, 45, 5, 67, 33, 2},
                {56, 78, 89, 3, 54,},
                {23, 73, 90, 76}
        };
        System.out.println(b.length);
        System.out.println(b[3].length);
        System.out.println(b[2][4]);
        System.out.println(b[3][1]);
        Arrays.fill(b[2], 16);
        System.out.println(Arrays.toString(b[2]));
        Arrays.sort(b[3]);
        System.out.println(Arrays.toString(b[3]));




    }
}
