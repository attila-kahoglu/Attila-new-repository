package com.unitedcodernigar.allpracticerepeat.alotofmixfunction;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetAndHashset1N {
    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(49);             hashSet.add(29);
        hashSet.add(53);             hashSet.add(80);
        hashSet.add(76);             hashSet.add(66);
        hashSet.add(49);
        System.out.println(hashSet+"   hash");

        Set<Integer>  linkedHashset= new LinkedHashSet<>();
        linkedHashset.add(65);             linkedHashset.add(12);
        linkedHashset.add(54);             linkedHashset.add(76);
        linkedHashset.add(23);             linkedHashset.add(89);
        linkedHashset.add(54);
        System.out.println(linkedHashset+"  link");

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(200);         treeSet.add(78);
        treeSet.add(300);         treeSet.add(56);
        treeSet.add(100);         treeSet.add(54);
        treeSet.add(200);
        System.out.println(treeSet+"  tre");







    }
}
