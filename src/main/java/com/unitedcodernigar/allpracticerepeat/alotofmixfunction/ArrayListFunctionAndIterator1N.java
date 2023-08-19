package com.unitedcodernigar.allpracticerepeat.alotofmixfunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListFunctionAndIterator1N {
    public static void main(String[] args) {

        ArrayList<Integer> amaze = new ArrayList<>();
        amaze.add(300);
        amaze.add(200);
        amaze.add(400);
        System.out.println(amaze);
        amaze.set(1,500);
        amaze.add(600);
        System.out.println(amaze);
        Collections.sort(amaze);
        System.out.println(amaze);
        Collections.reverse(amaze);
        System.out.println(amaze);
        int sum =0;
        for (int i=0;i<amaze.size();i++) {
            sum += amaze.get(i);
            System.out.print(amaze.get(i)+" ");
        }
        System.out.println();
        System.out.println(sum);
        amaze.remove(3);
        System.out.println(amaze);


        ArrayList<Integer>  confuse1 = new ArrayList<>();
        confuse1.add(100);
        confuse1.add(200);
        confuse1.add(400);
        confuse1.add(500);
        ArrayList<Integer> confuse2 = new ArrayList<>();
        confuse2.add(32);
        confuse2.add(54);
        confuse2.add(34);
        confuse2.add(44);
        confuse2.add(76);
        confuse2.add(87);
        confuse2.addAll(confuse1);
        System.out.println(confuse2);

        int sum1 = 0;
        for (int i=0;i<confuse2.size();i++) {
            sum1 += confuse2.get(i);
            System.out.print(confuse2.get(i)+" ");
        }
        System.out.println(" : --> Total sum is : "+sum1);

        Iterator<Integer> iterator = confuse2.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (int i=0;i<confuse2.size();i++) {
            if (iterator.hasNext()) {
                System.out.print(iterator.next()+" ");
            }
        }

        System.out.println("----------------2-----------------");

        ListIterator<Integer> bump = confuse2.listIterator(4);      // you try another page
        while (bump.hasPrevious()) {
            System.out.print(bump.previous()+" ");
        }










    }
}
