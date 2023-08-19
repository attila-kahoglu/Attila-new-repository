package com.unitedcodernigar.detatypes;

public class PrePostIncrementAndDecrement {
    public static void main(String[] args) {

        // post increment-first execute the operation and then plus one
        //pre increment--first plus one and then execute operation

        int a = 30;
        int b = 50+(++a); //50+31
        int c = ++a;  // 32
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("***************");                // this grammar is asked at the interview. (*****)
        int a1 = 30;
        System.out.println(a1);  // 30
        int b1 = 50+(a1++); // 30   b1=50+30
        System.out.println(a1);  //31
        int c1 = a1++;  // 31   c1=30+1
        System.out.println(a1);  //32    a1=30+1+1
        System.out.println(b1);
        System.out.println(c1);


        // pre decrement
        //post decrement

        int x1 = 10 ;
        int y1 = --x1 ;
        System.out.println(x1); // 9
        System.out.println(y1); // 9

        int x2 = 20 ;
        int y2 = (x2--)+90 ;
        int y3 = (--x2)-20 ;
        int y4 = --y3 ;
        int y5 = y4-- ;
        System.out.println(x2); //18
        System.out.println(y2); //110
        System.out.println(y3); //-3
        System.out.println(y4); //-4
        System.out.println(y5); //-3



    }
}
