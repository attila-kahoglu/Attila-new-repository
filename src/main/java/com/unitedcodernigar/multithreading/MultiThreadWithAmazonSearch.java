package com.unitedcodernigar.multithreading;

public class MultiThreadWithAmazonSearch {
    public static void main(String[] args) {
        AmazonSearch amazonSearch1 = new AmazonSearch("Java Book");
        AmazonSearch amazonSearch2 = new AmazonSearch("Iphone Case");
        AmazonSearch amazonSearch3 = new AmazonSearch("Baby Stroller");
        AmazonSearch amazonSearch4 = new AmazonSearch("air pods");

        // Thread is coming from Java.lang !
        Thread t1 = new Thread(amazonSearch1);
        Thread t2 = new Thread(amazonSearch2);
        Thread t3 = new Thread(amazonSearch3);
        Thread t4 = new Thread(amazonSearch4);

        t1.start();
        t2.start();
        //t3.start();
        //t4.start();

        //t1.run();
        //t2.run();



    }
}
