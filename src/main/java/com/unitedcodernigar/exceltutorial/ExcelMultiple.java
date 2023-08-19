package com.unitedcodernigar.exceltutorial;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelMultiple {
    public void multipleFle (){
        String filePath = "testdatafolders/myFile.xlsx";
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        XSSFWorkbook workbook = null;
        try {
            workbook = new XSSFWorkbook(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XSSFSheet sheet = workbook.getSheetAt(1);
        int rowCount = sheet.getLastRowNum();
        int cellCount = sheet.getRow(0).getLastCellNum();
        for (int r=0;r<=rowCount;r++){
            XSSFRow row = sheet.getRow(r);
            for (int cell=0;cell<cellCount;cell++){
                XSSFCell column = row.getCell(cell);
                switch (column.getCellType()) {
                    case STRING:
                        System.out.print(column.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.print(column.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        System.out.print(column.getBooleanCellValue());
                        break;
                    default:
                        System.out.print("You entered wrong element !!");
                }
                System.out.print("  |  ");
            }
            System.out.println();
        }
    }

}
