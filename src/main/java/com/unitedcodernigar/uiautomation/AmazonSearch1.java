package com.unitedcodernigar.uiautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonSearch1 {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://www.amazon.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        // Set browser
        Dimension dimension = new Dimension(500,700);
        driver.manage().window().setSize(dimension);








    }
}
