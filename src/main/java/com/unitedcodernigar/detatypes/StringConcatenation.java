package com.unitedcodernigar.detatypes;

public class StringConcatenation {
    public static void main(String[] args) {

        // Numeric & Non Numeric
        String s1 = "JAva";
        String s2 = "test";
        String s3 = "100";
        String s4 = "200Plus";
        String s5 = "500";
        int i1 = 200;
        int i2 = 300;
        String s6 = "";
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2+s3));


        //String Value can be any Value /    (*****)
        System.out.println(s3+s5); //100500
        System.out.println(i1+i2); //500
        System.out.println(i1+s3);; //200100
        System.out.println(s1+i1*i2); //Java60000
        System.out.println(i1+i2+s5+s1+s2); //500500JavaTest
        System.out.println(s2+s4); //Test200Plus
        System.out.println(s3+s4); //100200Plus
        System.out.println(s1+(s3+s5)); //Java500
        System.out.println(s1+i1+i2);  //Java200300
        System.out.println(i1+s6+i2);


       // Hard code

        // Contains--Keyword
        String message = "Customer added Successfully";
        System.out.println(message.toLowerCase().contains("successfully"));

    }

}
