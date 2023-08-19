package com.unitedcodernigar.io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileWriteDemo2 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Apache Commons IO Test,\n");
        builder.append("Test Automation CubeCat");

        File myFile = new File("doc"+File.separator+"TestReport.txt"+FileWriteDemo1.gerCurrentDatetime());
        try {
            FileUtils.writeStringToFile(myFile,builder.toString(),"UTF-8");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }





}
