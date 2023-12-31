package com.unitedcodernigar.detatypes;

public class DataTypeConversion1 {
    public static void main(String[] args) {

        // widening casting--convert data to large
        int i1 = 100;
        long l1 = i1;
        System.out.println(l1);

        int i2 = 300;
        double d1 = i2;
        System.out.println(i2);
        System.out.println(d1);

        char c1 = 'B';
        int i3 = c1;
        System.out.println(i3);


        // Narrowing casting
        long l2 = 1000;
        //int i4 = l2; / compile
        int i4 = (int)l2;
        System.out.println(i4);


        double d2 = 26.98;
        //nt i5 = (int)d2;
        float f1 = (float)d2;
        System.out.println(f1);



    }
}
