package com.unitedcodernigar.detatypes;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsFunction {
    public static void main(String[] args) {

        String s1 = "Learn Java is fun";
        String s2 = "Selenium,Test,Automation";
        String name = "alim";
        String s3 = "some times i am upset because i don't hava money";
        String s = "ah;ahihoahvohsaniowehsvhhhooawhevswalhhahsz";
        String s4 = "100";

        System.out.println(s1);
        System.out.println(StringUtils.reverse(s1));
        System.out.println(StringUtils.reverseDelimited(s1,' '));
        System.out.println(StringUtils.reverseDelimited(s2,','));
        System.out.println(name);
        System.out.println(StringUtils.capitalize(name));
        //System.out.println(StringUtils.countMatches());
        System.out.println(StringUtils.isEmpty(name));
        System.out.println(StringUtils.substring(s2,7));
        System.out.println(s2.substring(9,16));
        System.out.println(s2.substring(5,18));
        System.out.println(StringUtils.countMatches(s3,"o"));
        System.out.println(StringUtils.countMatches(s3,"m"));
        System.out.println(StringUtils.countMatches(s,"h"));
        System.out.println(StringUtils.isNumeric(s));
        System.out.println(StringUtils.isNumeric(s4));


    }
}
