package com.unitedcodernigar.detatypes;

public class ArgumentsDemo {
    public static void main(String[] args) {

        // define arguments  arg[0] = 100
        int i1 = Integer.parseInt(args[0]);
        int i2 = Integer.parseInt(args[1]);
        int i3 = Integer.parseInt(args[2]);
        System.out.printf("%d + %d + %d = %d",i1,i2,i3,i1+i2+i3);



    }
}
