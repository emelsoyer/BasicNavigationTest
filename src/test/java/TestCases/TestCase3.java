package TestCases;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase3 {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement Mbuttons=driver.findElement(By.linkText("Multiple Buttons"));
        Mbuttons.click();
        //WebElement button1=driver.findElement(By.xpath("//button[text()=\"Button 1\"]"));
        WebElement button1=driver.findElement(By.xpath("//button[@onclick=\"button1()\"]"));
        button1.click();
        String Button1=button1.getText();

        WebElement message=driver.findElement(By.id("result"));
        String actualMessage=message.getText();
        System.out.println(actualMessage);
        String expectedMessage="Clicked on button one!";

        if (actualMessage.equals(expectedMessage)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }







       // driver.close();
    }
}
