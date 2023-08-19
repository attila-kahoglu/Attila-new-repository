package com.unitedcodernigar.loops;

public class LoopBreakDemo {
    public static void main(String[] args) {

        int i = 0;
        for (i=0 ; i<10 ; i++ ) {
            if (i==4) {
                System.out.println(i);
                break;
            }
        }
        System.out.println("final value: "+i);

    }
}
