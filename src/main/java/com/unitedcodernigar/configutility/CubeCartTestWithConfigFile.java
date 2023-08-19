package com.unitedcodernigar.configutility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CubeCartTestWithConfigFile {
    public static void main(String[] args) {

        String fileName = "config.properties";
        String username = ApplicationConfig.readConfigProperties(fileName,"username");
        String password = ApplicationConfig.readConfigProperties(fileName,"password");
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        String url;
        if (Integer.parseInt(ApplicationConfig.readConfigProperties(fileName,"qa"))==0){
            url = ApplicationConfig.readConfigProperties(fileName,"prod-url");
        }else {
            url = ApplicationConfig.readConfigProperties(fileName,"qaUrl");
            username = ApplicationConfig.readConfigProperties(fileName,"prodUserName");
        }
        driver.get(url);
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys(username);
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        driver.quit();


    }
}
