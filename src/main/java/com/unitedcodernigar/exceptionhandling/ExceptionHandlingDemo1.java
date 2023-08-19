package com.unitedcodernigar.exceptionhandling;

import java.lang.reflect.Array;

public class ExceptionHandlingDemo1 {
    public static void main(String[] args)  {

        // ExceptionHandling in Java:

        // Condition statement: 0
        //  tey  catch
        //  try catch finally
        //  throws--add exception t method signature
        //  throws






        // compile time exception   checked exception
        // ThreadClass.sleep(3000);  interrupted exception

        //int[] a = {3,4,2,5,8};
        //System.out.println(a[5]);    //  index out of bound exception

        // there is selenium , no such element , stale element, null pointer , illegal statement

        try{
            int[] a = {3,5,6,2,6};
            System.out.println(a[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("Hello World");
        }

        try {   //  try block
            int[] b = {54,23,4,2,1};
            System.out.println(b[7]);
        }catch (Exception e){   //   catch block
            e.printStackTrace();
            System.out.println("Hello World");
        }




    }
}
