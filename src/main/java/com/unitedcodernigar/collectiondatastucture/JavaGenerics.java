package com.unitedcodernigar.collectiondatastucture;

import com.beust.ah.A;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaGenerics {
    public static void main(String[] args) {

        //ArrayList<Integer> list1 = new ArrayList();
        //list1.add("100");
        ArrayList list = new ArrayList();
        list.add(100);
        list.add(90);
        list.add(200);
        list.add(300);

        for (Object a : list) {
            System.out.println((Integer)a*2);
        }







    }
}
