package com.unitedcodernigar.collectiondatastucture;

import java.util.Arrays;

public class ArrayObjectDemoN {
    public static void main(String[] args) {

        int[] arr1={98,67,44,23,10};
        int[] arr2={78,90,34,80,45};
        int[] arr3={98,67,44,23,10};
        int[] arr4= Arrays.copyOf(arr2,5);

        boolean result1 = Arrays.equals(arr1,arr2);
        boolean result2 = Arrays.equals(arr1,arr3);
        System.out.println(result1);
        System.out.println(result2);

        Arrays.fill(arr2,20);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr4));



        int[] arr5 = new int[arr2.length];
        for(int i=0;i<arr2.length;i++){
            arr5[i]=arr3[i];
        }
        System.out.println(Arrays.toString(arr5));



    }
}
