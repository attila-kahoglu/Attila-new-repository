package com.unitedcodernigar.syncdemo;

import java.util.Date;

import static java.lang.Thread.sleep;

public class Line {
    // public void getLine()
   synchronized public void getLine() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            //Date date = new Date();
            //
            // System.out.println(date);
            try {
                Thread.sleep(400);
            }
            catch (Exception e) {
                System.out.println(e);
            }

        }


    }
}
