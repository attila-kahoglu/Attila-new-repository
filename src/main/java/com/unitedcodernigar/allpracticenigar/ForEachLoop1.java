package com.unitedcodernigar.allpracticenigar;

public class ForEachLoop1 {
    public static void main(String[] args) {

        int apple = 90;
        for (String  value : args) {
            apple = Integer.parseInt(value);
        }
        System.out.println(apple);
    }
}
