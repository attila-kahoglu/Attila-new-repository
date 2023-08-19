package com.unitedcodernigar.uiautomation;

import com.unitedcodernigar.classconcepts.Products;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonMultipleSearchWithArrayUseDateTimeArrayClass {
    public static void main(String[] args) throws InterruptedException {


        Products products = new Products();
        products.setProducts(new String[]{"Iphone","Ipad","JavaBook","earphone"});
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        ChromeDriver driver = new ChromeDriver(options);
        DateTime browserOpenedTime = new DateTime();
        driver.get("https://www.amazon.com/amazonprime");
        driver.manage().window().maximize();

        for (String keyWords : products.getProducts()) {
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys(keyWords + Keys.ENTER);
            driver.navigate().back();
        }
        driver.close();
        driver.quit();







    }
}
