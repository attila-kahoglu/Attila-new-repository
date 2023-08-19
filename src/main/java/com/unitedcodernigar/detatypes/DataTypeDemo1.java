package com.unitedcodernigar.detatypes;

public class DataTypeDemo1 {
    // Code block
    public static void main(String[] args) {

        // Byte data type
        byte b1 = 20;
        System.out.println(b1);
        b1 = 120; // variable
        System.out.println("b1 Value After Change: "+b1);


        short n = 23;
        short n1 = 24;
        int n2 = n+n1;
        System.out.println(n2);

        short m = 14;
        short m1 = 24;
        int m2 = m*m1;
        System.out.println(m2);
        System.out.println("Short Min Value"+Short.MIN_VALUE);
        System.out.println("Short MAX Value"+Short.MAX_VALUE);

        // char
         char c1 = 'a';
         char c2 = 'C';
        System.out.println(c1);
        System.out.println(c2);
        int value1 = c1;
        int value2 = c2;
        char c3 = 64;
        char c4 = 78;
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(c3);
        System.out.println(c4);


        byte x1 = 100;
        byte x2 = 101;
        System.out.println(x1&x2);//100 / burda usttei sayiyi alttaki sayiya karsilastirilr ve ustteki sayiyi alir.(gibi)(k)
        System.out.println(x1|x2);//101 / alttaki sayiyi ustteki sayiya karsilastirilir ve alttaki sayiyi alir.(gibi)(B)



    }
}
