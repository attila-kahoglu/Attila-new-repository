package com.unitedcodernigar.loops;

public class MultiplicationTable1 {
    public static void main(String[] args) {

        for(int i=1; i<=9; i++) {
            for(int j=1; j<=i; j++) {
                int multiply=i*j;
                System.out.print(String.format("%d * %d = %d\t",i,j,multiply));
            }
            System.out.println();
        }
    }
}
