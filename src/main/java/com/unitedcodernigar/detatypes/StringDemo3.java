package com.unitedcodernigar.detatypes;

public class StringDemo3 {
    public static void main(String[] args) {

        String result = " All Test Passed ";
        System.out.println(result.length());
        System.out.println((result.trim()).length());
        result = result.replace(" ","");
        System.out.println(result.length());

        // String format
        String course = "United Coder";
        String course1 = "Selenium Master";
        String course2 = "Java Selenium Course";
        // Welcome
        System.out.println("Welcome to "+course);
        System.out.println(String.format("Welcome to %s",course1));

        int i1 = 100;
        int i2 = 200;
        int i3 = i1+i2;
        System.out.println(i1+i2);
        System.out.println(String.format("I am learning Arithmetic operation plus in %s : %d + %d = %d",course,i1,i2,i3));
        System.out.printf("%d + %d = %d\n",i1,i2,i3);     // this is significant (*****)
        System.out.println("************");

        float f1 = 789.7354f;
        float f2 = 789.7654f;
        System.out.println(String.format("f1=%.1f",f1));
        System.out.println(String.format("%.1f",f2));

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(String.format("Login Test Passed %s",b1));
        System.out.println(String.format("Login Test Passed %s",b2));

    }
}
