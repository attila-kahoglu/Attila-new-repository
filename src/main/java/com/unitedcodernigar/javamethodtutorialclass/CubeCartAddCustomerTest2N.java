package com.unitedcodernigar.javamethodtutorialclass;

import com.unitedcodernigar.cubecartautomation.CustomerInfo1NClass;
import com.unitedcodernigar.cubecartautomation.LoginUser1NClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CubeCartAddCustomerTest2N {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        WebDriver driver = new ChromeDriver(chromeOptions);
        CustomerObjectMethods objectMethods = new CustomerObjectMethods(driver);

        driver.manage().window().maximize();
        driver.get("http://cubecartuat.unitedcoder.com/admin_tu8sml.php");
        LoginUser1NClass loginUser = new LoginUser1NClass("testautomation1","automation123!");
        CustomerInfo1NClass customerInfo = new CustomerInfo1NClass("bilal","samet",
                "SDEAT","bilal@gmail.com");
        CustomerInfo1NClass customerInfo1 = new CustomerInfo1NClass("aliye","alim",
                "IT","aliye@gmail.com");
        CustomerInfo1NClass customerInfo2 = new CustomerInfo1NClass("nuriye","mahmut",
                "QA","nuriye@gamil.com");
        CustomerInfo1NClass customerInfo3 = new CustomerInfo1NClass("adil","alim",
                "BO","adil@gmail.com");
        objectMethods.login(loginUser);
        objectMethods.addCustomer(customerInfo);
        objectMethods.addCustomer(customerInfo1);
        objectMethods.addCustomer(customerInfo2);
        objectMethods.addCustomer(customerInfo3);
        objectMethods.verifyCustomerAddedSuccessfully();
        objectMethods.logout();



    }
}
