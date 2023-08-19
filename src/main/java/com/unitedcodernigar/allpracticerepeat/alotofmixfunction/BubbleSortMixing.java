package com.unitedcodernigar.allpracticerepeat.alotofmixfunction;

import java.util.Arrays;

public class BubbleSortMixing {
    public static void main(String[] args) {

        int[][] curious = {
                {34,36,76,78,12,34,65,6},
                {12,34,45,56,57,678,89},
                {45,56,7,45,3,42,35,76},
                {54,66,78,123,57},
                {32,68,78,311}
        };
        System.out.println(curious.length);
        System.out.println(curious[3][2]);
        System.out.println(curious[2][6]);

        System.out.println("-------------2-----------");
        int sum = 0;
        for (int i=0;i<curious.length;i++) {
            for (int j=0;j<curious[i].length;j++) {
                System.out.print(curious[i][j]+" ");
                sum += curious[i][j];
            }
            System.out.println();
        }
        System.out.println("Total sum : "+sum);

    }
}
