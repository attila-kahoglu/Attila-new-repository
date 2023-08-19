package com.unitedcodernigar.allpracticerepeat.alotofmixfunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaGenerics {
    public static void main(String[] args) {

        ArrayList sing = new ArrayList<>();   //   <Object>   you needn't  give  Object
        sing.add(100);
        sing.add(89.5);
        sing.add(200);
        sing.add("429");

        for (Object blind : sing) {
            System.out.println(blind);
        }

        System.out.println("------------2-------------");

        ArrayList<Integer> apologize = new ArrayList<>();
        apologize.add(30);
        apologize.add(70);
        apologize.add(90);
        apologize.add(55);
        apologize.add(76);
        System.out.println(apologize);
        Object[] judge = apologize.toArray();
        for (int i=0;i<judge.length;i++) {
            System.out.print(judge[i]+" ");
        }
        System.out.println();

        List<Integer> podcast =Arrays.asList(23,43,65,67,789,8);
        System.out.println(podcast);




    }
}
