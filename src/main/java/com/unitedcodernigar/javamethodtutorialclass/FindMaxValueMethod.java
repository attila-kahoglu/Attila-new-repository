package com.unitedcodernigar.javamethodtutorialclass;

public class FindMaxValueMethod {

    // method for find a max value in an array

    public int findMaxValue(int[] array) {
        int maxValue =0;
        for (int i=0;i<array.length;i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        //System.out.println(maxValue);   // if you want to don't use sout, you try this way !
        return maxValue;
    }








}
