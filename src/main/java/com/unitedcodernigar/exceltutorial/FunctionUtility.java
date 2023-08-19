package com.unitedcodernigar.exceltutorial;

import com.unitedcodernigar.configutility.ApplicationConfig;
import com.unitedcodernigar.io.FileWriteDemo1;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class FunctionUtility {
    private WebDriver driver;
    public FunctionUtility() {
    }
    public FunctionUtility(WebDriver driver) {
        this.driver = driver;
    }

    public void takeScreenShot(String imageName) {
        TakesScreenshot screenshot = (TakesScreenshot)driver;
        File screenShotFile = screenshot.getScreenshotAs(OutputType.FILE);
        String folder = ApplicationConfig.readConfigProperties("config.properties","screenshot");
        File file = new File(folder+ File.separator+FileWriteDemo1.gerCurrentDatetime()+imageName);
        try {
            FileUtils.copyFile(screenShotFile,file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
