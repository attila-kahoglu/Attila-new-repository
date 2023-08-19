package com.unitedcodernigar.collectiondatastucture;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo1N {
    public static void main(String[] args) {

        /* ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(300);
        arrayList.add(200); */
        List<Integer> List = new ArrayList<>();
        List.add(200);
        List.add(500);
        List.add(100);

        // Size
        System.out.println(List.size());
        System.out.println(List.get(1));
        System.out.println(List);
        List.add(400);
        List.add(900);
        System.out.println(List.get(4));
        System.out.println(List);
        List.set(1,1000);
        System.out.println(List);
        System.out.println("------------------------2-----------------");
        Collections.sort(List);
        System.out.println(List);
        System.out.println("------------------------3---------------");
        Collections.reverse(List);
        System.out.println(List);

        int sum = 0;
        for (int i=0;i<List.size();i++) {
            sum+=List.get(i);
            System.out.print(List.get(i)+" ");
        }
        System.out.println();
        System.out.println(sum);
        List.remove(2);
        System.out.println(List);
    }
}
