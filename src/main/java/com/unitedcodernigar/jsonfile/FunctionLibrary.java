package com.unitedcodernigar.jsonfile;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FunctionLibrary {

    static WebDriver driver;
    public static void openBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://cubecartuat.unitedcoder.com/admin_tu8sml.php");
    }
    public static void login(LoginUser user){
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys(user.getName());
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(user.getPassword());
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
    }
    public static void logOut(){
        WebElement logoutLink = driver.findElement(By.xpath("//a[contains(text(),\"Log Out \")]"));
        logoutLink.click();
    }
    public static void closeBrowser(){
        driver.close();
        driver.quit();
    }
    public static void sleep(int sec){
        try {
            Thread.sleep(1000*sec);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
            //e.printStackTrace();
        }
    }
    public static void explicitlyWait(WebElement element, int timeOut){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static boolean addCustomer(Customer customer){
        WebElement customerListLink = driver.findElement(By.linkText("Customer List"));
        explicitlyWait(customerListLink,3);
        customerListLink.click();
        WebElement addCustomerLink = driver.findElement(By.linkText("Add Customer"));
        explicitlyWait(addCustomerLink,3);
        addCustomerLink.click();
        WebElement firstNameField = driver.findElement(By.id("cust-firstname"));
        firstNameField.sendKeys(customer.getFirstName()+getCurrentTimeStamp());
        WebElement lastNameField = driver.findElement(By.id("cust-lastname"));
        lastNameField.sendKeys(customer.getLastName()+getCurrentTimeStamp());
        WebElement emailField = driver.findElement(By.id("cust-email"));
        emailField.sendKeys("Test "+getCurrentTimeStamp()+customer.getEmail());
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
    public static boolean addProduct(Product product){
        WebElement productsLink = driver.findElement(By.id("nav_products"));
        explicitlyWait(productsLink,3);
        productsLink.click();
        WebElement addProductLink = driver.findElement(By.linkText("Add Product"));
        explicitlyWait(addProductLink,3);
        addProductLink.click();
        WebElement productNameInputField = driver.findElement(By.id("name"));
        productNameInputField.sendKeys(product.getProductName()+getCurrentTimeStamp());
        WebElement productCodeInputField = driver.findElement(By.id("product_code"));
        productCodeInputField.sendKeys(product.getProductCode()+getCurrentTimeStamp());

        WebElement categoryTab = driver.findElement(By.id("tab_category"));
        categoryTab.click();
        WebElement saveButton = driver.findElement(By.cssSelector("input[value='Save']"));
        saveButton.click();
        WebElement confirmationMassage = driver.findElement(By.cssSelector("div.success"));
        System.out.println("Confirmation massage for add product"+confirmationMassage.getText());
        if (confirmationMassage.isDisplayed()){
            System.out.println("Product added successfully !! ");
            return true;
        }else{
            System.out.println("Product added failed !! ");
            return false;
        }

    }

    public static String getCurrentTimeStamp(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss-SSS");
        return now.format(formatter);
    }
}
