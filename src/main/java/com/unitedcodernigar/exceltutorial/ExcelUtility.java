package com.unitedcodernigar.exceltutorial;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtility {

    // method to read from Excel cell
    public String readFromExcelCell(String fileName, String sheetName, int rowNumber, int cellNumber){
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        XSSFWorkbook workbook = null;
        try {
            workbook = new XSSFWorkbook(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XSSFSheet sheet = workbook.getSheet(sheetName);
        XSSFRow row = sheet.getRow(rowNumber);
        String cellValue = null;
        if (row==null){
            System.out.println("Empty row !!!");
        }else {
            XSSFCell cell = row.getCell(cellNumber);
            CellType cellType = cell.getCellType();
            switch (cellType){
                case NUMERIC:
                    cellValue = String.valueOf(cell.getNumericCellValue());
                    System.out.println(cellValue);
                    break;
                case STRING:
                    cellValue = cell.getStringCellValue();
                    System.out.println(cellValue);
                    break;
                default:
                    System.out.println("You made the wrong choice");
            }
        }
        return cellValue;


    }

    public List<LoginInfo> readFromMultipleCell(String fileName, String sheetName){
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        XSSFWorkbook workbook = null;
        try {
            workbook = new XSSFWorkbook(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XSSFSheet sheet = workbook.getSheet(sheetName);
        List<LoginInfo> loginUsers = new ArrayList<>();
        int rowCount = sheet.getLastRowNum();
        for (int r=1;r<=rowCount;r++){
            XSSFRow row = sheet.getRow(r);
            XSSFCell userName = row.getCell(0);
            XSSFCell password = row.getCell(1);
            loginUsers.add(new LoginInfo(userName.getStringCellValue(),password.getStringCellValue()));
        }
        return loginUsers;

    }

    public void writeToExcelCCells(String fileName, String sheetName, List<String> content){
        // define a file to write
        File excelFile = new File(fileName);
        // define a work book
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(sheetName);
        int numberOfRow = content.size();
        for (int roeNumber=0;roeNumber<numberOfRow;roeNumber++) {
            XSSFRow row = sheet.createRow(roeNumber);
            String[] rowContent = content.get(roeNumber).split(",");
            int totalCell = rowContent.length;
            for (int cellNumber=0;cellNumber<totalCell;cellNumber++) {
                XSSFCell cell = row.createCell(cellNumber);
                // add contents to the cell
                cell.setCellValue(rowContent[cellNumber]);
            }
        }
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(excelFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            workbook.write(outputStream);
            workbook.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
