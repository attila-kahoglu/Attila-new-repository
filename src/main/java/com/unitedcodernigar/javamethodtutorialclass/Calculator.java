package com.unitedcodernigar.javamethodtutorialclass;

import org.apache.commons.lang3.StringUtils;

public class Calculator {

    // method for print calculator information
    public void calculatorInfo() {
        System.out.println("Sony simple Calculator");
        System.out.println("Hope you enjoy to use !!! ");
    }
    // method for add two numbers
    public long sum(int i1,int i2) {
        //System.out.println(i1+i1);   // if you want to don't use sout, you can try this way !
        return i1+i2;
    }

    public long addTwoNumbers(String s1, String s2) {
        if (StringUtils.isNumeric(s1) && StringUtils.isNumeric(s2)) {
            long sum = Long.parseLong(s1) + Long.parseLong(s2);
            //System.out.println(sum);   // if you want to don't use sout, you can try this way !
            return sum;
        }else {
            System.out.println("Please provide numeric string !! ");
            return 0;
        }
    }

    // add multiple numbers
    public long addMultipleNumbers(long...numbers) {
        long sum =0;
        for (long eachNumber : numbers) {
            sum += eachNumber;
        }
        return sum;
    }





}
