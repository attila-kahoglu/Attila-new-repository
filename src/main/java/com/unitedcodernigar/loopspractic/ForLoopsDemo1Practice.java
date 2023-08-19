package com.unitedcodernigar.loopspractic;

public class ForLoopsDemo1Practice {
    public static void main(String[] args) {

        // 1-100
        // Starting point  1  condition <= 100 ++ sout
        for (int i=1;i<=100;i++) {
            System.out.print(i+" ");
        }
        System.out.println("********************************");
        //100-1  starting 100 condition i<=1 --
        for (int i=100;i>=1;i--) {
            System.out.print(i+" ");
        }

        System.out.println("**************************");

        // 0-100 jup san 0 - <=100  +2
        for (int j=0;j<100;j=j+2) {
            System.out.print(j+" ");
        }

        System.out.println("****************************");
        for (int j=0;j<=100;j++) {
            if (j!=0&&j%2==0) {
                System.out.print(j+" ");
            }
        }




    }
}
