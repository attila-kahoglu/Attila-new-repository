package regressionsuit.pageobjectpattern;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FunctionPage {
    WebDriver driver;

    public FunctionPage(WebDriver driver){
        this.driver = driver;
    }

    public void sleep(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void waitUnitElementPresent(WebElement webElement, int timeout){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitAlertPresent(int timeout){    // alert = pop-pop  we can use for pop-pop this wait function
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public String generateFakeName(){
        String faker = Faker.instance().name().firstName();
        return faker;
    }




}
