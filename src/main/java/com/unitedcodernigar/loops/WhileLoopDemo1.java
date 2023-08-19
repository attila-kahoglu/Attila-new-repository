package com.unitedcodernigar.loops;

public class WhileLoopDemo1 {
    public static void main(String[] args) {

        int i =0;
        while (i<5) {
            i++;
            System.out.print(i+" ");
        }

        int a = 0;
        while (true) {
            if (a<5) {
                System.out.print(a+" ");
                a++;
            }
            else {
                break;
            }
        }
    }
}
