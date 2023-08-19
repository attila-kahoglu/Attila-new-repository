package com.unitedcodernigar.allpracticerepeat.alotofmixfunction;

import org.bouncycastle.asn1.iso.ISOIECObjectIdentifiers;

import java.util.*;

public class LinkedListAndQueueAndStack1N {
    public static void main(String[] args) {

        LinkedList<Integer> career = new LinkedList<>();
        List<Integer> career1 = new LinkedList<>();
        Queue<Integer> career2 = new LinkedList<>();

        career.add(30);
        career.add(20);
        career.add(40);
        career.add(100);

        career.addFirst(200);
        career.addLast(400);
        System.out.println(career);

        Iterator<Integer> summarize = career.iterator();
        while (summarize.hasNext()){
            System.out.print(summarize.next()+" ");
        }

        System.out.println("----------------2----------------");

        Stack<String>  both = new Stack<>();
        both.push("Bottle 1");
        both.push("Bottle 2");
        both.push("Bottle 3");
        both.push("Bottle 4");
        both.push("Bottle 5");
        System.out.println(both.size());
        System.out.println(both.get(3));
        both.pop(); // LIFO
        System.out.println(both);
        System.out.println(both.empty());    // result is finished with false  !
        both.pop();
        System.out.println(both);


        int sum = 0;
        for (int ruin : career) {
            System.out.print(ruin+" ");
            sum+= ruin;
        }
        System.out.println();
        System.out.println("Total sum is : "+sum);

        Iterator<Integer> earphone = career.iterator();
        while (earphone.hasNext()) {
            System.out.print(earphone.next()+" ");
        }
        System.out.println();

        // convert to object array
        Object[] brain = career.toArray();
        for (int i=0;i<brain.length;i++) {
            System.out.print(brain[i]+" ");
        }

        System.out.println();

        System.out.println("------------------3----------------");


        Queue<Integer> cell = new LinkedList<>();
        cell.add(12);           cell.add(22);
        cell.add(32);           cell.add(42);

        System.out.println(cell);
        cell.remove();
        System.out.println(cell);
        cell.peek();
        cell.poll();
        System.out.println(cell);












    }
}
