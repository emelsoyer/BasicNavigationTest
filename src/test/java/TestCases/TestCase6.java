package TestCases;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase6 {
    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement form = driver.findElement(By.linkText("Registration Form"));
        form.click();
        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("user");
        userName.click();
        WebElement message=driver.findElement(By.xpath("//small[@style='display: block;']"));
        String actualMessage=message.getText();
        System.out.println(actualMessage);
        String expectedMessage="The username must be more than 6 and less than 30 characters long";
        if (actualMessage.equals(expectedMessage)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");

        }

        driver.close();
    }
}