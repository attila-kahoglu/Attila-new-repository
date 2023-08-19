package com.unitedcodernigar.syncdemo;

public class NoSyncDemo1 {
    public static void main(String[] args) {

        // Object of line class that is shared
        // among the threads.
        Line obj = new Line();

        // creating the threads that are
        // sharing the same Object.
        Train train1 = new Train(obj);
        Train train2 = new Train(obj);

        //threads start their execution.
        train1.start();
        train2.start();
    }
}
