package com.unitedcodernigar.exercise;

import org.apache.commons.lang3.StringUtils;

public class AboutStringUtils {
    public static void main(String[] args) {

        String a = "i wake up at 1:30pm on today, so i slept enough.";
        String  a1 = "everyone know about phone.";
        System.out.println(a);
        System.out.println(StringUtils.capitalize(a));
        System.out.println(a1);
        System.out.println(StringUtils.capitalize(a1));

        String a2 = "i have new computer.";
        System.out.println(a2);
        System.out.println(StringUtils.capitalize(a2));


        String s1 = "i learn Java everyday, so i don't hava more free time.";
        System.out.println(StringUtils.reverse(s1));
        System.out.println(StringUtils.reverseDelimited(s1,' '));


    }
}