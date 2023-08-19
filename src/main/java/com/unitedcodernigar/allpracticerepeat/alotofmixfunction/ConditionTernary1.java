package com.unitedcodernigar.allpracticerepeat.alotofmixfunction;

import java.util.Scanner;

public class ConditionTernary1 {
    public static void main(String[] args) {

        Scanner each = new Scanner(System.in);
        System.out.println("Please enter first digit number !");
        int relax = each.nextInt();
        System.out.println("Please enter second digit number !");
        int focus = each.nextInt();
        int maxNumber = relax > focus ?  relax : focus;
        System.out.println("Max number is : "+maxNumber);
        int minNumber = relax < focus ? relax : focus;
        System.out.println("Min number is : "+minNumber);

        var result = (Math.random()*(100-30+1)+30);
        System.out.println("The random number is : "+result);


        System.out.println("Enter Your marks !");
        double marks = each.nextDouble();
        String attention = marks > 50  ?  "Pass" : "fail";
        System.out.println("You "+attention+" the exam.");



        System.out.println("Please  enter your age, are you married!!   yes  or  no ");
        double wonder = each.nextDouble();
        String occupied = wonder > 25  ?  "Yes" : "No";
        System.out.println(occupied);






    }
}
