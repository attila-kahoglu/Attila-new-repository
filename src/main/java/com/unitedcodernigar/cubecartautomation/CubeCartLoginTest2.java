package com.unitedcodernigar.cubecartautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class CubeCartLoginTest2 {
    public static void main(String[] args) throws InterruptedException {

        LoginUser1NClass loginUser = new LoginUser1NClass();
        String[] credentials={"testautomation1","automation123!"};

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("http://cubecartuat.unitedcoder.com/admin_tu8sml.php");

        WebElement userNameField = driver.findElement(By.id("username"));
        loginUser.setUserName(credentials[0]);
        userNameField.sendKeys(loginUser.getUserName());
        WebElement passwordField = driver.findElement(By.id("password"));
        loginUser.setPassword(credentials[1]);
        passwordField.sendKeys(loginUser.getPassword());
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(3000);
        WebElement logoutLink = driver.findElement(By.cssSelector("i.fa fa-sign-out"));
        if (logoutLink.isDisplayed()) {
            System.out.println("Login Test passed");
        }else {
            System.out.println("Login Test Failed");
        }
        driver.close();



    }
}
