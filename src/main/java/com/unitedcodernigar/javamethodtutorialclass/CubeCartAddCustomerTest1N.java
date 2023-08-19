package com.unitedcodernigar.javamethodtutorialclass;

import com.unitedcodernigar.cubecartautomation.CustomerInfo1NClass;
import com.unitedcodernigar.cubecartautomation.LoginUser1NClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CubeCartAddCustomerTest1N {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        ChromeDriver driver = new ChromeDriver(chromeOptions);
        CustomerObjectMethods objectMethods = new CustomerObjectMethods(driver);

        driver.manage().window().maximize();
        driver.get("http://cubecartuat.unitedcoder.com/admin_tu8sml.php");
        LoginUser1NClass loginUser = new LoginUser1NClass("testautomation1","automation123!");
        CustomerInfo1NClass customerInfo = new CustomerInfo1NClass("United","coder",
                "SDEAT","united@gmail.com");
        //objectMethods.login("testautomation1","automation123!");   // you can use this way, !!
        objectMethods.addCustomer(customerInfo);
        objectMethods.verifyCustomerAddedSuccessfully();
        objectMethods.logout();



    }
}
