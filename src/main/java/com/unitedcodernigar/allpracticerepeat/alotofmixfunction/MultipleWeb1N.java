package com.unitedcodernigar.allpracticerepeat.alotofmixfunction;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.channel.epoll.EpollServerChannelConfig;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWeb1N {
    public static void main(String[] args) {

        Map<String,String> webSites = new HashMap<>();
        webSites.put("Google","https://www.google.com");
        webSites.put("YouTube","https://www.youtube.com");
        webSites.put("Amazon","https://www.amazon.com");
        webSites.put("trenyol","https://www.trendyol.com");

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver = new ChromeDriver(options);
        Set<String> keys = webSites.keySet();
        for (String skin : keys ) {
            StopWatch watch = new StopWatch();
            watch.start();
            driver.get(webSites.get(skin));
            if (driver.getTitle().contains(skin)) {
                watch.stop();
                System.out.println(skin+" Open successfully , test pass");
                System.out.println(skin+" opened within "+watch.getTime(TimeUnit.MILLISECONDS));
            }
        }
        driver.close();
        driver.quit();


    }
}
