package com.unitedcodernigar.exercise;

import org.apache.commons.lang3.StringUtils;

public class ExerciseConversionAll {
    public static void main(String[] args) {


        // covert String to Primitive data type
        String a1 = "i spent 155 Lira wednesday";
        String a2 = "i spent 120 Lira today";
        String a3 = "i am so sad. i hava just 150 Lira";
        System.out.println(StringUtils.capitalize(a1));
        System.out.println(StringUtils.capitalize(a2));
        System.out.println(StringUtils.capitalize(a3));

        System.out.println("---------------");




        String b1 = "155L";
        String b2 = "120L";
        String b3 = "150";

        b1 = b1.replace("L","");
        int s1 = Integer.parseInt(b1);
        b2 = b2.replace("L","");
        int s2 = Integer.parseInt(b2);
        b3 = b3.replace("L","");
        int s3 = Integer.parseInt(b3);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1+s2+s3);// expected result 425 lira.


        //Convert primitive data type to String
        int t1 = 320;
        int t2 = 120;

        System.out.println(t1+t2);
        String n1 = String.valueOf(t1);
        String n2 = String.valueOf(t2);

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n1+n2);

        byte m = 101;
        byte m1 = 001;
        byte v1 = 25;
        byte v2 = 16;
        System.out.println(m&m1);
        System.out.println(v1&v2);


        float number = 3.1415f;
        System.out.println(String.format("%.2f",number));




    }
}
