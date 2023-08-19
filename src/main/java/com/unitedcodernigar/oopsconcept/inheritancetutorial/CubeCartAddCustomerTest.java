package com.unitedcodernigar.oopsconcept.inheritancetutorial;

import com.unitedcodernigar.cubecartautomation.CustomerInfo1NClass;
import com.unitedcodernigar.conditions.TypeDropDownValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CubeCartAddCustomerTest extends BaseClass{
    public static void main(String[] args) {

        openBrowser();
        loginIn("testautomation1","automation123!");
        CustomerInfo1NClass customer = new CustomerInfo1NClass("Adil"+System.currentTimeMillis(),
                "Alim"+System.currentTimeMillis(),"Ms",
                "Adil"+System.currentTimeMillis()+"@gmail.com");
        addCustomerTest(customer);
        logOut();
        closeBrowser();
    }

    public static boolean addCustomerTest(CustomerInfo1NClass customerInfo1NClass) {
        //implicitlyWait(5);
        WebElement customerListLink = driver.findElement(By.linkText("Customer List"));
        explicitlyWait(customerListLink);
        customerListLink.click();

        WebElement addCustomerLink = driver.findElement(By.linkText("Add Customer"));
        addCustomerLink.click();
        WebElement titleField = driver.findElement(By.id("cust-title"));
        titleField.sendKeys(customerInfo1NClass.getTitle());
        WebElement firstNameField = driver.findElement(By.id("cust-firstname"));
        firstNameField.sendKeys(customerInfo1NClass.getFirstname());
        WebElement lastNameField = driver.findElement(By.id("cust-lastname"));
        lastNameField.sendKeys(customerInfo1NClass.getLastName());
        WebElement typeDropDown = driver.findElement(By.id("cust-type"));
        Select select = new Select(typeDropDown);
        select.selectByVisibleText(TypeDropDownValue.REGISTERED_CUSTOMER.getValue());
        WebElement emailField = driver.findElement(By.id("cust-email"));
        emailField.sendKeys(customerInfo1NClass.getEmail());
        WebElement saveButton = driver.findElement(By.name("save"));
        saveButton.click();
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
    public static boolean addCustomerTest(String customerName, String email) {
        WebElement customerListLink = driver.findElement(By.linkText("Customer List"));
        customerListLink.click();
        WebElement addCustomerLink = driver.findElement(By.linkText("Add Customer"));
        addCustomerLink.click();
        WebElement firstNameField = driver.findElement(By.id("cust-firstname"));
        firstNameField.sendKeys(customerName);
        WebElement typeDropDown = driver.findElement(By.id("cust-type"));
        Select select = new Select(typeDropDown);
        select.selectByVisibleText(TypeDropDownValue.REGISTERED_CUSTOMER.getValue());
        WebElement emailField = driver.findElement(By.id("cust-email"));
        emailField.sendKeys(email);
        WebElement saveButton = driver.findElement(By.name("save"));
        saveButton.click();
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
}
