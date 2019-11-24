package TestCases;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase4 {
    public static void main(String[] args) {

        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement form=driver.findElement(By.linkText("Registration Form"));
        form.click();
        WebElement firstName=driver.findElement(By.name("firstname"));
        firstName.sendKeys("123");
        firstName.click();
        WebElement message=driver.findElement(By.xpath("//small[@style='display: block;']"));
        String actualMessage=message.getText();
        System.out.println(actualMessage);
        String expectedMessage="first name can only consist of alphabetical letters";

        if (actualMessage.equals(expectedMessage)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");

        }

        driver.close();
    }


}
