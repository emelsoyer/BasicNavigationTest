package TestCases2;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase7 {

    private WebDriver driver;

    @Test(description = "verifying File Upload")
    public void setUp() {
        driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.linkText("File Upload")).click();
        driver.findElement(By.id("file-upload")).sendKeys("C:\\temp\\abc.txt");
        driver.findElement(By.id("file-submit")).click();
        String actualMessage=driver.findElement(By.xpath("//h3")).getText();
        System.out.println(actualMessage);
        String expectedMessage="File Uploaded!";
        Assert.assertEquals(actualMessage, expectedMessage, "Message is wrong");
        String fileName=driver.findElement(By.id("uploaded-files")).getText();
        System.out.println(fileName);
        String FileName="abc.txt";
        Assert.assertEquals(fileName, FileName,"File name is wrong");

        driver.quit();
    }


    }
