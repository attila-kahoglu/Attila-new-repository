package com.unitedcodernigar.collectiondatastucture;

import java.util.*;

public class TreeSetAndHashSetDemo {
    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();               // this is print out mixing
        hashSet.add(50);                 hashSet.add(30);
        hashSet.add(70);                 hashSet.add(40);
        hashSet.add(60);                 hashSet.add(100);
        System.out.println(hashSet);

        Set<Integer>  linkedHashset = new LinkedHashSet<>();          // this is print ot with row
        linkedHashset.add(70);           linkedHashset.add(40);
        linkedHashset.add(80);           linkedHashset.add(60);
        linkedHashset.add(90);           linkedHashset.add(30);
        linkedHashset.add(90);
        System.out.println(linkedHashset);

        //SortedSet<Integer> treeSet = new TreeSet<>();
        Set<Integer> treeSet = new TreeSet<>();               // this is start small to big/large
        treeSet.add(200);                treeSet.add(100);
        treeSet.add(90);                 treeSet.add(60);
        treeSet.add(50);                 treeSet.add(150);
        treeSet.add(50);
        System.out.println(treeSet);

        Set<String> treeSet1 = new TreeSet<>();              // this is start A to last char/Z
        treeSet1.add("Banana");
        treeSet1.add("Grape");
        treeSet1.add("Apple");
        treeSet1.add("Mango");
        System.out.println(treeSet1);
    }
}
