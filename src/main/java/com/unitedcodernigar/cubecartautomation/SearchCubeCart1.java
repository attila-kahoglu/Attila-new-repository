package com.unitedcodernigar.cubecartautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SearchCubeCart1 {
    public static void main(String[] args) throws InterruptedException {

        String username = "testautomation1";
        String password = "automation123!";
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);


        ChromeDriver driver = new ChromeDriver(options);

        driver.get("http://cubecartuat.unitedcoderschool.com/admin_wehelc.php?");
        Thread.sleep(3000);
        Dimension dimension = new Dimension(500,700);
        driver.manage().window().setSize(dimension);


    }
}
