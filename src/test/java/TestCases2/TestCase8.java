package TestCases2;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase8 {

    @Test
    public void test(){
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Autocomplete")).click();
        driver.findElement(By.id("myCountry")).sendKeys("United States of America");
        driver.findElement(By.cssSelector("input[type='button'")).click();
        String actualMessage=driver.findElement(By.id("result")).getText();
        System.out.println(actualMessage);
        String expectedMessage="You selected: United States of America";

        Assert.assertEquals(actualMessage, expectedMessage,"Displayed message is wrong");

        driver.quit();



    }

}
