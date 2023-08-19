package com.unitedcodernigar.javamethodtutorialclass;

import com.unitedcodernigar.cubecartautomation.CustomerInfo1NClass;
import com.unitedcodernigar.cubecartautomation.LoginUser1NClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CustomerObjectMethods {
    // add customer   delete customer   edit customer

    WebDriver driver;   // null

    public CustomerObjectMethods() {
    }

    public CustomerObjectMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void login(LoginUser1NClass user1N) {                                  // you can use a lot of time this object,!!
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys(user1N.getUserName());
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(user1N.getPassword());
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
    }

    public void login(String userName, String password) {                      // you can use this object,!!
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys(userName);
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
    }

    public void addCustomer(CustomerInfo1NClass customerInfo1N) {
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
        //select.selectByVisibleText(TypeDropDownValue.Unregistered_Customer.name());
        select.selectByValue("2");
        WebElement emailField = driver.findElement(By.id("cust-email"));
        emailField.sendKeys(customerInfo1N.getEmail());
        WebElement saveButton = driver.findElement(By.name("save"));
        saveButton.click();
    }

    // verify customer added
    public boolean verifyCustomerAddedSuccessfully() {
        WebElement successMessage = driver.findElement(
                By.xpath("//*[contains(text(),'Customer successfully added.')]"));
        if (successMessage.isDisplayed()) {
            System.out.println("Customer added successfully!");
            return true;
        }else {
            System.out.println("Failed to add customer!!");
            return false;
        }
    }

    // logout method
    public void logout() {
        WebElement logOutLink = driver.findElement(By.cssSelector(".fa.fa-sign-out"));
        // if you want to cssSelector you can write this way (.fa.fa-sign-out), don't forget you write dot for space !!
        logOutLink.click();
        driver.close();
        driver.quit();
    }




}
