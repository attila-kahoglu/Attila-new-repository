package com.unitedcodernigar.allpracticenigar;

public class ForLoopNigar2 {
    public static void main(String[] args) {

        for (int i=0; i<=30; i++) {
            if (i != 0 && i %2 ==0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for (int i=2; i<=25; i++) {
            if (i != 2 && i % 3 == 2) {
                System.out.print(i+" ");
            }
        }
        System.out.println();


        for (int i=1; i<=20; i=i*2) {
            System.out.print(i+" ");
        }
        System.out.println();

        for(int i=1;;i++)
        {
            System.out.print(i+" ");
            if(i>5)
                break;
        }
        System.out.println();
        for(int i=1;i<10;i++)
        {
            if(i<5)
                continue;
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=2;i<4;i=i*2){
            for(int j=2;j<4;j++)
            {
                System.out.print(i*j+" ");
            }

            System.out.print(" ");
        }







    }
}
