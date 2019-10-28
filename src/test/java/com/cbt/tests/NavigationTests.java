package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class NavigationTests {



    public static void main(String[] args) {

        runTestWith("chrome");
        runTestWith("firefox");


    }

    public static void runTestWith(String browser) {
        WebDriver driver= BrowserFactory.getDriver(browser);
        driver.get("https://google.com");
        String titleGoogle=driver.getTitle();
        //System.out.println(title);

        driver.navigate().to("https://etsy.com");
        String titleEtsy=driver.getTitle();
        driver.navigate().back();
        String titleAfterBack=driver.getTitle();

        StringUtility.verifyEquals(titleAfterBack,titleGoogle);

        driver.navigate().forward();
        String titleAfterForward=driver.getTitle();

        StringUtility.verifyEquals(titleAfterForward, titleEtsy);

        driver.close();
    }


}
