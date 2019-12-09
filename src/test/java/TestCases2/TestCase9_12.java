package TestCases2;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase9_12 {

    private WebDriver driver;

    @DataProvider(name="Status Code")
    public Object[] Data(){
        return  new Object[]{"200", "301", "404", "500"};

        }

    @Test(dataProvider = "Status Code")
    public void Test9_12(String error){
        driver= BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Status Codes")).click();
        BrowserUtils.wait(2);

        WebElement Button=driver.findElement(By.linkText(error));
        BrowserUtils.wait(2);
        Button.click();

        WebElement Result=driver.findElement(By.xpath("//p"));
         String ExpectedResult=Result.getText();

        System.out.println(ExpectedResult);
        Assert.assertTrue(ExpectedResult.contains(error),"Wrong error message");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
