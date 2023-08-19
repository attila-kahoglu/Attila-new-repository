package com.unitedcodernigar.javamethodtutorialclass;

public class TestCalculator {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.calculatorInfo();
        System.out.println(calculator.addMultipleNumbers(12,34,35,45,56,66,74,33,45,76,78));
        System.out.println(calculator.addTwoNumbers("45","77"));
        System.out.println(calculator.sum(24,56));

        System.out.println("------------------------2-------------------");

        FindMaxValueMethod method = new FindMaxValueMethod();
        System.out.println(method.findMaxValue(new int[]{30,10,70,20,50,90,40}));
        //method.findMaxValue(new int[]{23,34,54,46,56,57});          this is esy way

        System.out.println("-------------------------3------------------------");

        StaticMethodAndVariable.setAccountBalance(90000.87);
        StaticMethodAndVariable.money=300;
        StaticMethodAndVariable staticMethod = new StaticMethodAndVariable();
        staticMethod.deposit=900;








    }
}
