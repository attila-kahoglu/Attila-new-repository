package com.unitedcodernigar.allpracticenigar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Practice1805AutoBoxAndUnBox {
    public static void main(String[] args) {

        ArrayList<Integer>  array = new ArrayList<>();
        for (int i=0;i<=10;i++) {
            array.add(Integer.valueOf(i));
        }

        for (int i=0;i<=10;i++) {
            System.out.println(i+"-->"+array.get(i).intValue());
        }


        ArrayList<Integer>  arr = new ArrayList<>();
        for (int i=0;i<=8;i++) {
            arr.add(Integer.valueOf(i));
        }

        for (int i=0;i<=8;i++) {
            System.out.println(i+"###>"+arr.get(i).intValue());
        }



    }
}
