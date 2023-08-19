package com.unitedcodernigar.cubecartautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class CubeCartLoginTest {
    public static void main(String[] args) throws InterruptedException {

        String username = "testautomation1";
        String password = "automation123!";
        String[] credentials={"testautomation1","automation123!"};

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.setHeadless(true);
        ChromeDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("http://cubecartuat.unitedcoder.com/admin_tu8sml.php");
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys(username);
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(3000);
        WebElement logoutLink = driver.findElement(By.xpath("//a[contains(text(),\"Log Out \")]"));
        if (logoutLink.isDisplayed()) {
            System.out.println("Login Test passed");
        }else {
            System.out.println("Login Test Failed");
        }
        logoutLink.click();
        driver.close();
        driver.quit();



    }
}
