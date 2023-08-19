package com.unitedcodernigar.exceltutorial;

import java.util.List;

public class ReadFromExcelDemo1 {
    public static void main(String[] args) {

        String fileName = "testdatafolders/cubecart.xlsx";
        ExcelUtility excelUtility = new ExcelUtility();
        excelUtility.readFromExcelCell(fileName,"Sayfa1",1,0);
        excelUtility.readFromExcelCell(fileName,"Sayfa1",1,1);

        System.out.println();

        String fileName1 = "testdatafolders/myFile.xlsx";
        List<LoginInfo> users = excelUtility.readFromMultipleCell(fileName1,"LoginInfo");
        System.out.println(users);

    }
}
