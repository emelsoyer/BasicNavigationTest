package TestCases;

import com.cbt.utilities.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;

public class TestCase1 {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement button=driver.findElement(By.linkText("Sign Up For Mailing List"));
        button.click();
        driver.findElement(By.name("full_name")).sendKeys("Emel_Soyer");
        driver.findElement(By.name("email")).sendKeys("emel@soyer.com");
        WebElement button2=driver.findElement(By.name("wooden_spoon"));
        button2.click();
        WebElement actualMessage=driver.findElement(By.name("signup_message"));
        System.out.println(actualMessage.getText());
        String expectedMessage="Thank you for signing up. Click the button below to return to the home page.";

        if(actualMessage.getText().equals(expectedMessage)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }

        driver.close();

    }

}
