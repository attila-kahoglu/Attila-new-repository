package com.unitedcodernigar.collectiondatastucture;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class FindMaxValueInArray {
    public static void main(String[] args) {

       //int maxValue=0;
       //nt[] arr={100,70,30,90,10,200,25};

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter length of an array: ");
        int length=input.nextInt();
        int[] arr = new int[length];
        int maxValue =0;
        for(int i=0;i<arr.length;i++) {
            arr[i]=(int)(Math.random()*100+1);
            if(arr[i]>maxValue) {
                maxValue=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Max number in this array is: "+maxValue);



        int[] arr1 = new int[length];
        int minValue=arr1[0];
        for(int i=0;i<arr1.length;i++) {
            arr1[i]=(int)(Math.random()*100+1);
            if(i==0){
                minValue=arr1[0];
            }
            if (arr1[i]<minValue) {
                minValue=arr1[i];
            }

        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("Min number in this is: "+minValue);

    }
}
