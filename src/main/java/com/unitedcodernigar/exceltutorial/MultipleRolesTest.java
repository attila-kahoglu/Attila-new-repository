package com.unitedcodernigar.exceltutorial;

import com.unitedcodernigar.oopsconcept.inheritancetutorial.BaseClass;
import java.util.List;

public class MultipleRolesTest extends BaseClass {
    public static void main(String[] args) {
        String fileName = "testdatafolders/myFile.xlsx";

        openBrowser();
        ExcelUtility excelUtility = new ExcelUtility();
        List<LoginInfo> users = excelUtility.readFromMultipleCell(fileName,"LoginInfo");
        for (LoginInfo user : users) {
            loginIn(user.getUserName(),user.getPassword());
            logOut();
        }
        closeBrowser();

    }
}
