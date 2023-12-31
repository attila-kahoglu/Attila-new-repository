package com.unitedcodernigar.multithreading;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonSearch extends Thread{

    private String keyWords;
    public AmazonSearch(){
    }
    public AmazonSearch(String keyWords){
        this.keyWords = keyWords;
    }

    @Override
    public void run(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys(keyWords+ Keys.ENTER);
        WebElement result = driver.findElement(By.xpath("//span[contains(text(),\""+keyWords+"\")]"));
        if (result.isDisplayed()) {
            System.out.println("Test passed !!");
        }else {
            System.out.println("Test failed !!");
        }
        driver.close();
        driver.quit();
    }
}
