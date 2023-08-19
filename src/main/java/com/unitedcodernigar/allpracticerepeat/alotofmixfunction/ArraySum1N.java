package com.unitedcodernigar.allpracticerepeat.alotofmixfunction;

import java.util.Arrays;
import java.util.Random;

public class ArraySum1N {
    public static void main(String[] args) {

        /*  Random ran = new Random();
        System.out.println(ran.nextInt(50));
        System.out.println(ran.nextInt(70));
        System.out.println(ran.nextInt(80));
        System.out.println(ran.nextInt(90));
        System.out.println(ran.nextInt(100));   */

        int[] a = {17,45,71,65,19};
        int sum =0;
        for (int b : a ) {
            sum += b;
        }
        System.out.println(sum);


        for (int i=0;i<a.length;i++) {
            sum += a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(sum);

        int[] n = new int[a.length];
        for (int i=0;i<a.length;i++) {
            n[i] = a[i];
        }
        System.out.println(Arrays.toString(n));

        System.out.println("----------------2-------------");

        String r = "United_coder";
        String m ="Hello,World";

        String[] arr1 = r.split("_");
        for (String k : arr1) {
            System.out.println(k+"  1");
        }
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

        String[] arr2 = m.split(",");
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

        for (String g : arr1) {
            System.out.println(g);
        }

        for (String h : arr2) {
            System.out.println(h);
        }

        System.out.println("----------------3--------------");

        char[] w = new char[r.length()] ;
        for (int i=0;i<r.length();i++) {
            w[i] = r.charAt(i);
        }
        System.out.println(Arrays.toString(w));

        char[] p = new char[m.length()];
        for (int i=0;i<m.length();i++) {
            p[i] = m.charAt(i);
        }
        System.out.println(Arrays.toString(p));






    }
}
