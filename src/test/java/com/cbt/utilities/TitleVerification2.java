package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/", "https://walmart.com", "https://westelm.com/");


        String title;
        for(String url:urls){
            driver.get(url);
            title = driver.getTitle().toLowerCase().replace(" ", "");
            System.out.println(title);
            if (url.contains(title)){
                System.out.println("passed");
            }else{
                System.out.println("failed");
            }


        }driver.close();

      /*  driver.get("https://luluandgeorgia.com");
        driver.getTitle();
        System.out.println(driver.getTitle());
        if("https://luluandgeorgia.com".contains(driver.getTitle())){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

*/








    }
}
