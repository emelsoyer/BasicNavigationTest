package TestCases;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestCase2 {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        List<WebElement> list=driver.findElements(By.className("list-group-item"));
        int size= list.size();

        System.out.println(size);
        if (size==48){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }

        driver.close();


    }
}
