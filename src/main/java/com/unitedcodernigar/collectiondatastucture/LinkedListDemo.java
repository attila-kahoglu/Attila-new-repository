package com.unitedcodernigar.collectiondatastucture;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        Queue<Integer> list2 = new LinkedList<>();

        linkedList.add(60);        linkedList.add(80);
        linkedList.add(90);        linkedList.add(100);

        linkedList.addFirst(200);
        linkedList.addLast(400);
        System.out.println(linkedList);
        list.add(300);
        System.out.println(list);
        list2.add(110);
        System.out.println(list2);
        list2.addAll(linkedList);
        System.out.println(list2);

        Iterator<Integer> it = linkedList.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }


    }
}
