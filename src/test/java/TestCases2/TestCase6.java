package TestCases2;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase6 {



    private WebDriver driver;

    @Test
    public void setUp() {
        driver = BrowserFactory.getDriver("chrome");
        driver.get("https://www.tempmailaddress.com/");
        String email=driver.findElement(By.id("email")).getText();
        driver.get("http://practice.cybertekschool.com/");

        driver.findElement(By.linkText("Sign Up For Mailing List")).click();
        driver.findElement(By.name("full_name")).sendKeys("Melek Ersoy");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("wooden_spoon")).click();
        String actualMessage=driver.findElement(By.name("signup_message")).getText();
        System.out.println(actualMessage);
        String expectedMessage="Thank you for signing up. Click the button below to return to the home page.";

        Assert.assertEquals(actualMessage, expectedMessage, "Sign up message is wrong");

        driver.get("https://www.tempmailaddress.com/");
        driver.findElement(By.xpath("//*[@id=\"schranka\"]/tr[3]/td[1]/span[2]")).click();
        String receivedMessage=driver.findElement(By.xpath("//*[@id=\"schranka\"]/tr[3]/td[1]/span[2]")).getText();
        System.out.println(receivedMessage);
        String expectedReceivedMessage="do-not-reply@practice.cybertekschool.com";
        Assert.assertEquals(receivedMessage,expectedReceivedMessage,"Received message is wrong");



    }
}
