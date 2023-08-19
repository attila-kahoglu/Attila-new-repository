package com.unitedcodernigar.allpracticerepeat.alotofmixfunction;

import java.util.Arrays;
import java.util.Scanner;

public class SortAnArray1N {
    public static void main(String[] args) {

        Scanner confuse = new Scanner(System.in);
        System.out.println("Please enter length of any number : ");
        int repeat = confuse.nextInt();
        int[] spot = new int[repeat];
        for (int i=0;i<spot.length;i++) {
            spot[i] = (int)(Math.random()*(100-40+1)+40);
        }
        System.out.println(Arrays.toString(spot));
        Arrays.sort(spot);
        System.out.println(Arrays.toString(spot));


        for (int i=spot.length-1;i>=0;i--) {
            System.out.print(spot[i]+" ");
        }





    }
}
