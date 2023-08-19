package com.unitedcodernigar.collectiondatastucture;

import java.util.ArrayList;

public class AutoBoxAndUnBox {
    public static void main(String[] args) {

        ArrayList<Integer> intarrayList = new ArrayList<>();
        for (int i=0;i<=10;i++) {
            intarrayList.add(Integer.valueOf(i)); //Autoboxing
        }

        for (int i=0;i<=10;i++) {
            System.out.println(i+" -->"+intarrayList.get(i).intValue());// unboxing
        }
    }
}


