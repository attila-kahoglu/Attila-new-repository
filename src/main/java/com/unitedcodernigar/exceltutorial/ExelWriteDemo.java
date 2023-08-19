package com.unitedcodernigar.exceltutorial;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.List;

public class ExelWriteDemo {
    public static void main(String[] args) {
        ExcelUtility excelUtility = new ExcelUtility();
        List<String> content = new ArrayList<>();
        content.add("test-name,test-module,test-statues,executedAt,executedBy");
        content.add("Login,Login,Passed,"+getCurrentDataTime()+","+getAdminName());
        content.add("Add_Customer,Customer,Passed,"+getCurrentDataTime()+","+getAdminName());
        content.add("Add_Product,Inventory,Passed,"+getCurrentDataTime()+","+getAdminName());
        String fileName = "testdatafolders/testReport.xlsx";
        excelUtility.writeToExcelCCells(fileName, "Test-Report", content);
    }

    public static String getCurrentDataTime() {
        DateTime time = new DateTime();
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        return time.toString(formatter);
    }

    public static String getAdminName(){
        String user = System.getProperty("user.name");
        return user;
    }

}
