package com.unitedcodernigar.io;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class FileWriteDemo1 {
    public static void main(String[] args) {
        String s1 = "I am United Coder student";
        String s2 = "I am learning Java SDET to find a job";
        String finalContent = s1+"\n"+s2;
        FileUtility fileUtility = new FileUtility();
        fileUtility.writeToFile("doc","test-automation-"+gerCurrentDatetime(),".text",finalContent);
    }
    public static String gerCurrentDatetime(){
        DateTime dateTime = new DateTime();
        // formatting date time
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd-HH-mm-ss-SSS");
        return dateTime.toString(formatter);
    }
}
