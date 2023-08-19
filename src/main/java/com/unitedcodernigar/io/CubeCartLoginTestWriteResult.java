package com.unitedcodernigar.io;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class CubeCartLoginTestWriteResult {
    public static void main(String[] args) throws InterruptedException {

        String username = "testautomation1";
        String password = "automation123!";

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("http://cubecartuat.unitedcoder.com/admin_tu8sml.php");
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys(username);
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(3000);
        WebElement dashBoard = driver.findElement(By.xpath("//h3[contains(text(),\"Dashboard\")]"));
        WebElement logoutLink = driver.findElement(By.xpath("//*[@id=\"header\"]/span/a[2]"));

        String testResult="";
        if (logoutLink.isDisplayed()) {
            //System.out.println("Login Test passed");
            testResult = "Login Test Passed";
        }
        if (dashBoard.getText().equalsIgnoreCase("dashboard")){
            System.out.println("Login Test passed !!");
            testResult = testResult+"\n"+"dashboard displayed";
        }
        else {
            System.out.println("Login Test Failed");
            testResult="Login Test Failed";
        }
        FileUtility fileUtility = new FileUtility();
        fileUtility.writeToFile("doc","cubecart-test"+FileWriteDemo1.gerCurrentDatetime()
                , ".txt", testResult);

        driver.close();
        driver.quit();



    }
}
