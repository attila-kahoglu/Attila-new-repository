package com.unitedcodernigar.detatypes;

public class ArithmeticOperators {
    public static void main(String[] args) {


        // + - * / % ++ --
        //Premier of Rectangle   w+h  *2    h*w
        int width = 45;
        int height = 25;
        int area = width*height;
        int premier = (width+height)*2;
        System.out.println("Area of rectangle is: "+area);
        System.out.println("premier of rectangle is: "+premier);

        float division = (float)width/height;
        System.out.println(division);

        System.out.println(5%3); //2
        System.out.println(9%8); //1 sadace kalani gosterir


        // Increment  &  Decrement ++ --
        int i = 2;
        int j = 1;
        i++; //3
        j++;  //2
        System.out.println(i);
        System.out.println(j);
        i++; //4   //post increment
        j--; //1
        j--; //0
        ++i;        //pre increment
        --j;
        System.out.println(i); //4
        System.out.println(j); //0
        i = i+2;
        j = j+2;
        System.out.println(i);
        System.out.println(j);



    }
}
