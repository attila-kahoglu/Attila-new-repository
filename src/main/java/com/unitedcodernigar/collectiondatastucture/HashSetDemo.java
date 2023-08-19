package com.unitedcodernigar.collectiondatastucture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

        //Set<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(100);        set2.add(200);
        set2.add(300);        set2.add(50);
        set2.add(70);         set2.add(20);

        set2.add(70);         set2.add(20);
        System.out.println(set2);

        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);        list.add(200);
        list.add(300);        list.add(50);
        list.add(70);         list.add(20);

        list.add(70);         list.add(20);
        System.out.println(list);

        System.out.println();

        int sum=0;
        for (int s:set2) {
            System.out.print(s+" ");
            sum+=s;
        }
        System.out.println();
        System.out.println("Sum og the set value is: "+sum);

        System.out.println("--------------2---------------");

        for (int s:set2) {
            System.out.print(s+" ");
        }

        System.out.println();
        System.out.println("--------------3-----------------");

        Iterator<Integer> iterator = set2.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println();
        System.out.println("-------------4------------------");

        //convert to object array
        Object[] array = set2.toArray();
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }




    }
}
