package com.unitedcodernigar.collectiondatastucture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(60);        list1.add(80);
        list1.add(90);        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list1);
        System.out.println(list2);

        Object[] array = list1.toArray();    // this convert  / if you want to change arraylist for array.
        for (int i=0;i< array.length;i++) {
            System.out.print(array[i]+" ");
        }

        System.out.println();

        List<Integer> list3 = Arrays.asList(10,40,80,90,100,400,200);// if you want to change array for list.
        System.out.println(list3);


    }
}
