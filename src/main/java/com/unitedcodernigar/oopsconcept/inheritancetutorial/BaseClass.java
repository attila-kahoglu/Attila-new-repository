package com.unitedcodernigar.oopsconcept.inheritancetutorial;

import com.unitedcodernigar.exceltutorial.FunctionUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    static WebDriver driver;
    static FunctionUtility utility;

    public BaseClass(){
    }

    public static void openBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(options);
        utility = new FunctionUtility(driver);
        driver.manage().window().maximize();
        driver.get("http://cubecartuat.unitedcoder.com/admin_tu8sml.php");
    }

    public static void loginIn(String userName, String password){
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys(userName);
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        utility.takeScreenShot(userName+".jpg");
    }

    public static void logOut(){
        WebElement logoutLink = driver.findElement(By.xpath("//a[contains(text(),\"Log Out\")]"));
        logoutLink.click();
    }
    public static void closeBrowser(){
        driver.close();
        driver.quit();
    }

    public static void implicitlyWait(int second){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public static void explicitlyWait(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void fluentWait(WebElement element) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void sleep(int sec){
        try {
            Thread.sleep(1000*sec);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
            //e.printStackTrace();
        }
    }



}
