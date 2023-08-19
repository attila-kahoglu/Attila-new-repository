package com.unitedcodernigar.collectiondatastucture;

public class ArrayDemo1N {
    public static void main(String[] args) {



        // integer array
        int[] array = new int[13];  // can store 12 value/element 0 1 2 3 ------11
        array[0] =10;             array[1] =25;
        array[2] =15;             array[3] =20;
        array[4] =200;            array[5] =880;
        array[6] =40;             array[7] =50;
        array[8] =206;            array[9] =90;
        array[10]=130;            array[11] =2100;
        array[12]=89;

        System.out.println(array[8]);
        System.out.println(array[12]);
        //System.out.println(array[13]);
        System.out.println(array.length);

        for(int i=0; i<=array.length-1; i++) {      // 0-12
            System.out.print(array[i]+" ");
        }
        System.out.println();

        // for each loop
        for(int a:array) {
            System.out.print(a+" ");
        }


        System.out.println("\n-----------------------------");


        String[] s=new String[2];
        s[1]="name";
        System.out.println(s[1]);
        System.out.println(s[0]);




    }
}
