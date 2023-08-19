package com.unitedcodernigar.lambdaandstream;

@FunctionalInterface
public interface LambdaFunctions {

    void read();
    static void write(){

    }
    default void say(){

    }

}
/*
// actually you can not use this on the Lambda function , this is not necessary
class Test implements LambdaFunctions{
    @Override
    public void read() {
        System.out.println("I am reading");
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.read();
    }
}
 */

// you use this way, this way is so easy and short
class TestLambda{
    public static void main(String[] args) {
        LambdaFunctions functions = ()-> System.out.println("I am reading Book");
        functions.read();
    }
}
