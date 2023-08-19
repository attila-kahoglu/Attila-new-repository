package com.unitedcodernigar.loops;

public class ForLoopDemo1 {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.print(i+" "); // 0
        }
        System.out.println("*********************");

        for (int o=1; o<=3; o=o+2) {
            System.out.print(o);
        }
        System.out.println("**********************");
        // 1-1000
        //Starting point 1 condition <= 100 ++ sout
        for (int t=1; t<=100; t++) {
            System.out.print(t+" ");
        }

        System.out.println("********************");


        // 0-100 jup san 0 - <=100  +2
        for (int j=0;j<100;j=j+2) {
            System.out.println(j+" ");
        }
        System.out.println();
        for (int j=0;j<=100;j++) {
            if (j!=0&&j%2==0) {
                System.out.println(j+" ");
            }
        }


    }
}
