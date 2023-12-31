package com.unitedcodernigar.configutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UiUtility {
    private WebDriver driver;
    public UiUtility(WebDriver driver){
        this.driver = driver;
    }
    private int timeout = Integer.parseInt(ApplicationConfig
            .readConfigProperties("config.properties","timeout"));

    public void waitForElementPresent(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
