package com.unitedcodernigar.cubecartautomation;

import com.unitedcodernigar.conditions.TypeDropDownValue;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class CubeCartAddCustomerTest1N {
    public static void main(String[] args) throws InterruptedException {

        LoginUser1NClass loginUser = new LoginUser1NClass();
        String[] credentials={"testautomation1","automation123!"};

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        driver.get("http://cubecartuat.unitedcoder.com/admin_tu8sml.php");
        WebElement userNameField = driver.findElement(By.id("username"));
        loginUser.setUserName(credentials[0]);
        userNameField.sendKeys(loginUser.getUserName());
        WebElement passwordField = driver.findElement(By.id("password"));
        loginUser.setPassword(credentials[1]);
        passwordField.sendKeys(loginUser.getPassword());
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        CustomerInfo1NClass customerInfo1N = new CustomerInfo1NClass("Aynigar"+System.currentTimeMillis(),
                "Alim"+System.currentTimeMillis(),"Mrs",
                "Aynigar"+System.currentTimeMillis()+"@gmail.com");
        WebElement customerListLink = driver.findElement(By.linkText("Customer List"));
        customerListLink.click();
        WebElement addCustomerLink = driver.findElement(By.linkText("Add Customer"));
        addCustomerLink.click();
       // WebElement addCustomerLink = driver.findElement(By.xpath("//a[contains(text(),\"Add Customer\")]"));
       // addCustomerLink.click();
        WebElement titleField = driver.findElement(By.id("cust-title"));
        titleField.sendKeys(customerInfo1N.getTitle());
        WebElement firstNameField = driver.findElement(By.id("cust-firstname"));
        firstNameField.sendKeys(customerInfo1N.getFirstname());
        WebElement lastNameField = driver.findElement(By.id("cust-lastname"));
        lastNameField.sendKeys(customerInfo1N.getLastName());
        WebElement typeDropDown = driver.findElement(By.id("cust-type"));
        Select select = new Select(typeDropDown);
        select.selectByVisibleText(TypeDropDownValue.REGISTERED_CUSTOMER.getValue());
        //select.selectByValue("2");
        WebElement emailField = driver.findElement(By.id("cust-email"));
        emailField.sendKeys(customerInfo1N.getEmail());
        WebElement saveButton = driver.findElement(By.name("save"));
        saveButton.click();
        WebElement successMessage = driver.findElement(
                By.xpath("//*[contains(text(),'Customer successfully added.')]"));
        if (successMessage.isDisplayed()) {
            System.out.println("Customer added successfully!");
        }else {
            System.out.println("Failed to add customer!!");
        }
        WebElement logOutLink = driver.findElement(By.cssSelector(".fa.fa-sign-out"));
        // if you want to cssSelector you can write this way (.fa.fa-sign-out), don't forget you write dot for space !!
        logOutLink.click();
        driver.close();
        driver.quit();




    }
}
