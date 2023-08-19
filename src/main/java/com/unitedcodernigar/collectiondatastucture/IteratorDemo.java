package com.unitedcodernigar.collectiondatastucture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(45,32,89,12,76));
        Iterator<Integer> iterator = list1.iterator();
        while ((iterator.hasNext())) {
            System.out.print(iterator.next()+" ");
        }
        /*
        for (int i=0;i< list1.size();i++) {
            if (iterator.hasNext()) {
                System.out.print(iterator.next());
            }
        }
         */

        System.out.println();

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list1);
        list2.add(12);
        list2.add(33);

        ListIterator<Integer> it = list2.listIterator(list1.size());
        while (it.hasPrevious()) {
            System.out.print(it.previous()+" ");
        }


    }
}
