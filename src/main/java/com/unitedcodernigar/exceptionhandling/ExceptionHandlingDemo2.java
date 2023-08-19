package com.unitedcodernigar.exceptionhandling;

public class ExceptionHandlingDemo2 {
    public static void main(String[] args) throws InterruptedException {

        wait(3);
        sleep(4);

    }
    public static void sleep(int second) throws InterruptedException {
        Thread.sleep(second*1000);
    }

    public static void wait(int sec){  // this is way easy ,
        try {
            Thread.sleep(sec*1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
