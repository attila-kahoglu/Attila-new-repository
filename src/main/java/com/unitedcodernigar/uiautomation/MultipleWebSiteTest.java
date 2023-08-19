package com.unitedcodernigar.uiautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWebSiteTest {
    public static void main(String[] args) throws InterruptedException {


        Map<String,String> webSites = new HashMap<>();
        webSites.put("Google","https://www.google.com");
        webSites.put("YouTube","https://www.YouTube.com");
        webSites.put("Amazon","https://www.amazon.com");

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver = new ChromeDriver(options);
        Set<String> keys=webSites.keySet();
        for (String k:keys) {
            StopWatch watch = new StopWatch();
            watch.start();
            driver.get(webSites.get(k));
            if(driver.getTitle().contains(k)) {
                System.out.println(k+" Opened Successfully, Tst Pass");
                 watch.stop();
                System.out.println(k+" Opened within "+watch.getTime(TimeUnit.MILLISECONDS));
            }
        }

        driver.close();
        driver.quit();





    }
}
