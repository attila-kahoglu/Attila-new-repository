package com.unitedcodernigar.exceptionhandling;

public class ExceptionHandlingDemo4 {
    public static void main(String[] args) {

        //String s = "A123";
        //int x = Integer.parseInt(s); // The give  NumberFormatException

        try {
            String b = "A123";
            int n = Integer.parseInt(b);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        System.out.println("Java Exception");



        // Date base test
        // Date base connect
        // Disconnect         // the code is processed ont disconnect
        try {
            String b = "A123";
            int n = Integer.parseInt(b);
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        finally {   //  Generally we can use on date base   /  this is for use date base disconnect
            System.out.println("Java Exception");
        }




    }
}
