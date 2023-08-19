package com.unitedcodernigar.io;

import org.apache.commons.io.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class FileReadDemo {
    public static void main(String[] args) {

        // file with content
        File fileToRead = new File("doc"+File.separator+"test-automation-2023-07-03-14-44-55-211.text");
        String fileContent = null;
        try {
            fileContent = FileUtils.readFileToString(fileToRead);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(fileContent);


    }
}
