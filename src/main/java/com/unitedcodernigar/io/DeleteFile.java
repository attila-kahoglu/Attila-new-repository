package com.unitedcodernigar.io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) {

        File deleteFile = new File("doc","TestReport.txt2023-07-03-19-25-06-415");
        try {
            FileUtils.delete(deleteFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        boolean isFileDelete = FileUtils.deleteQuietly(new File("doc"
                +File.separator+"TestReport.txt2023-07-03-18-48-14-412"));
        System.out.println("File delete is :  "+isFileDelete);
    }
}
