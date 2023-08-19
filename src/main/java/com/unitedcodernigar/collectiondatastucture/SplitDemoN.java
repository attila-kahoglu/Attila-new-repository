package com.unitedcodernigar.collectiondatastucture;

public class SplitDemoN {
    public static void main(String[] args) {

        String school = "United_Coder";
        String s = "Hello,world";

        String[] array1 =school.split("_");
        for(String a:array1){
            System.out.println(a);
        }

        String[] s1 =s.split(",");
        for(String b:s1){
            System.out.println(b);
        }
    }
}
