package com.unitedcodernigar.uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonSearch {
    public static void main(String[] args) {


        // define driver--chromedriver
        System.setProperty("webdriver.chrome.driver","/opt/homebrew/bin/chromedriver");
        //define chrome driver object
        // ChromeOptions options = new ChromeOptions();
        // chromeOptions.setProxy(null);
        WebDriver driver = new ChromeDriver();
        // open amazon hoe page
        driver.navigate().to("https://www.amazon.com");
        driver.manage().window().maximize();

        // default waiting time 3 second time out exception
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        // search browser element      twotabsearchtextbox
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(searchBox));

        searchBox.sendKeys("AirPod"+ Keys.ENTER);
        WebElement rsultStatusElement = driver.findElement(By.id("result-stats"));
        System.out.println("Result displayed: " + rsultStatusElement.isDisplayed());
        driver.quit();






    }
}
