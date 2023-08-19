package com.unitedcodernigar.collectiondatastucture;

import java.util.Arrays;

public class ArrayDemo2N {
    public static void main(String[] args) {


        int[] a =new int[] {20,40,10,50,60,89,66,78,56};
        int[] b={10,40,30,80,90,100};

        System.out.println(a[5]);
        System.out.println(a.length);
        System.out.println(b.length);
        System.out.println(b[3]);
        boolean resul = Arrays.equals(a,b);
        System.out.println(resul);


        int sum=0;
        for(int i=0; i<b.length; i++) {
            sum+=b[i];
        }
        System.out.println(sum);

        // for each loop
        int sum1=0;
        for (int r:b){
            sum1+=r;
            System.out.print(r+" ");
        }
        System.out.println(sum1);
    }
}
