package com.unitedcodernigar.loops;

public class ForEachLoopDemo {
    public static void main(String[] args) {

        //  argument   4   value
        /* int sum = 0;
        for (int i = 0; i < 4; i++) {   // 0 1 2 3 4
            System.out.print(args[i]+" ");
            sum += Integer.parseInt(args[i]);  // args[0]  args[1]
        }
        System.out.println(sum);  */

        // for each loop
        int sum1 = 0;
        for (String argumentValue: args) {
            sum1 += Integer.parseInt(argumentValue);
        }
        System.out.println(sum1);


    }
}
