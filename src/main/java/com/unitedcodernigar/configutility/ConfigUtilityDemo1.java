package com.unitedcodernigar.configutility;

import org.openqa.selenium.Keys;

import java.io.*;
import java.util.Properties;

public class ConfigUtilityDemo1 {
    public static void main(String[] args) {

        Properties properties = new Properties();
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("config.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));
        properties.getProperty("timeout","20");
        System.out.println(properties.getProperty("timeout"));


        /*
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("config.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            properties.store(outputStream,null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(properties.getProperty("timeout"));

         */

    }

}
