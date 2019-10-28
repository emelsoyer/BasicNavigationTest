package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class TitleVerification {

    public static void main(String[] args) {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();


        driver.get("http://practice.cybertekschool.com/");
        String title1 = driver.getTitle();
        driver.get("http://practice.cybertekschool.com/dropdown");
        String title2 = driver.getTitle();
        driver.get("http://practice.cybertekschool.com/login");
        String title3 = driver.getTitle();
        if (title1.equals(title2) && title1.equals(title3) && title2.equals(title3)) {
            System.out.println("pass");
        } else {
            System.out.println("failed");
        }

        driver.close();


        //OR Using keyword

/*
        String title = null;
        boolean passed = true;

        for (String url : urls) {
            driver.get(url);
            if (title == null)
                title = driver.getTitle();
            else {
                if (!title.equals(driver.getTitle())) {
                    System.out.println("Failed !");
                    passed = false;
                    break;
                }
            }

        }

        if (passed) {
            System.out.println("Passed");
        }
*/

    }


}
