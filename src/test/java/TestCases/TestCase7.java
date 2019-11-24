package TestCases;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase7 {
    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement form = driver.findElement(By.linkText("Registration Form"));
        form.click();
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("testers@email");
        email.click();
      WebElement message1=driver.findElement(By.xpath("//small[@style='display: block;']"));
        WebElement message2=driver.findElement(By.xpath("//small[@style='display: block;']"));
       String actualMessage1=message1.getText();
       String actualMessage2=message1.getText();
        System.out.println(actualMessage1+" "+actualMessage2);


        /** if (actualMessage.equals(expectedMessage)){
         System.out.println("Test passed");
         }else {
         System.out.println("Test failed");

         }

         driver.close();*/

    }
}