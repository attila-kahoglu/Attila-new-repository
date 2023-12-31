package com.unitedcodernigar.allpracticenigar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CollectionAmazonMultipleSearchWithArray {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://www.amazon.com");
        driver.manage().window().maximize();
        String[] productName={"Ipad","Java Oracle","Hard Disk"};
        for (String keyWords:productName) {
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys(keyWords + Keys.ENTER);
            driver.navigate().back();
        }
        driver.close();
        driver.quit();







    }
}
