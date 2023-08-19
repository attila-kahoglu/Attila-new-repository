package com.unitedcodernigar.allpracticerepeat.alotofmixfunction;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRandom1 {
    public static void main(String[] args) {

        System.out.println("Please enter digit number !");
        Scanner scan = new Scanner(System.in);
        int mix = scan.nextInt();

        int[] guess = new int[mix];
        for (int i=0;i<guess.length;i++) {
            guess[i] = (int)(Math.random()*(100-30+1)+30);
        }
        System.out.println(Arrays.toString(guess));
        Arrays.sort(guess);
        System.out.println(Arrays.toString(guess));
        Arrays.fill(guess,54);
        System.out.println(Arrays.toString(guess));

        System.out.println("---------------2-------------");

        int[] forest = new int[mix];
        for (int i=0;i<forest.length;i++) {
            forest[i] = (int)(Math.random()*(100-40+1)+40);
        }
        System.out.println(Arrays.toString(forest));
        Arrays.sort(forest);
        System.out.println(Arrays.toString(forest));
        System.out.println((int)Math.pow(3,2));

        System.out.println("----------------3------------------");

        int[] describe = new int[mix];
        for (int i=0;i<describe.length;i++) {
            describe[i] = (int)(Math.random()*(100-70+1)+70);
        }
        System.out.println(Arrays.toString(describe));
        Arrays.sort(describe);
        System.out.println(Arrays.toString(describe));












    }
}
