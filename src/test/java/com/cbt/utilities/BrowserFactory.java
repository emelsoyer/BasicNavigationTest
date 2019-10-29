package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//
public class BrowserFactory {
    public static void main(String[] args) {

    }


    public static WebDriver getDriver(String browser) {
        if ("safari".equals(browser)) {
            return null;
        }
        if ("edge".equals(browser)) {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        }
        if ("chrome".equals(browser)) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
        if ("firefox".equals(browser)) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
      return null;
    }
}











