package com.unitedcodernigar.dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectClassDeo1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement currencyDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select select = new Select(currencyDropDown);
        select.selectByVisibleText("AED");
        select.selectByValue("USD");
        Thread.sleep(2000);
        select.selectByIndex(0);
        List<WebElement> option = select.getOptions();
        option.size();
        /*
        for (int i=0;i<option.size();i++) {
            String currencyValue = option.get(i).getText();
            if (currencyValue.equalsIgnoreCase("usd")) {
                option.get(i).click();
                break;
            }
        }
         */

        for (WebElement element : option) {
            System.out.println(element.getText());
            if (element.getText().equalsIgnoreCase("usd")) {
                element.click();
                break;
            }
        }


    }
}
