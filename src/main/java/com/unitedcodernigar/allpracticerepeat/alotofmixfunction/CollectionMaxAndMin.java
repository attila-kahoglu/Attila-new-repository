package com.unitedcodernigar.allpracticerepeat.alotofmixfunction;

import java.util.Arrays;

public class CollectionMaxAndMin {
    public static void main(String[] args) {

        int[] occupied = new int[8];
        for (int i=0;i<occupied.length;i++) {
            occupied[i] = (int)(Math.random()*(100-30+1)+30);
        }
        System.out.println(Arrays.toString(occupied));
        Arrays.sort(occupied);
        System.out.println(Arrays.toString(occupied));

        for (int i=occupied.length-1;i>=0;i--) {
            System.out.print(occupied[i]+" ");
        }



    }
}
