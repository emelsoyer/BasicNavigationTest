package TestCases2;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1_5 {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");

        driver.findElement(By.linkText("Registration Form")).click();

    }
    @Test(description = "Verify that DOB error message is displayed")
    public void test1(){
        driver.findElement(By.name("birthday")).sendKeys("wrong_dob");
        WebElement DOB=driver.findElement(By.cssSelector("small[data-bv-result='INVALID']"));
        String actualResult=DOB.getText();
        System.out.println(actualResult);
        String expectedResult="The date of birth is not valid";

        Assert.assertEquals(actualResult, expectedResult, "Warning message is wrong");
        Assert.assertTrue(DOB.isDisplayed());
    }

    @Test(description = "Verify that c++. java and Javascript is displayed")
    public void test2(){
        WebElement Cplus=driver.findElement(By.cssSelector("label[for='inlineCheckbox1']"));
        WebElement Java=driver.findElement(By.cssSelector("label[for='inlineCheckbox2']"));
        WebElement JavaScript=driver.findElement(By.cssSelector("label[for='inlineCheckbox3']"));
        Assert.assertTrue(Cplus.isDisplayed());
        Assert.assertTrue(Java.isDisplayed());
        Assert.assertTrue(JavaScript.isDisplayed());
    }



    @Test(description ="Verify that invalid input to first name box gives error message" )
    public void test3(){
        driver.findElement(By.name("firstname")).sendKeys("a");
        String actualMessage=driver.findElement(By.xpath("//small[text()='first name must be more than 2 and less than 64 characters long']")).getText();
        System.out.println(actualMessage);
        String expectedMessage="first name must be more than 2 and less than 64 characters long";
        Assert.assertEquals(actualMessage,expectedMessage,"Error message is wrong");
    }

    @Test(description ="Verify that invalid input to last name box gives error message" )
    public void test4(){
        driver.findElement(By.name("lastname")).sendKeys("a");
        String actualMessage=driver.findElement(By.xpath("//small[text()='The last name must be more than 2 and less than 64 characters long']")).getText();
        System.out.println(actualMessage);
        String expectedMessage="The last name must be more than 2 and less than 64 characters long";
        Assert.assertEquals(actualMessage,expectedMessage,"Error message is wrong");
    }

    @Test(description ="Verify that after successful sign up verification message is displayed")
    public void test5(){
        driver.findElement(By.name("firstname")).sendKeys("Melek");
        driver.findElement(By.name("lastname")).sendKeys("Ersoy");
        driver.findElement(By.name("username")).sendKeys("mersoy");
        driver.findElement(By.name("email")).sendKeys("mersoy@gmail.com");
        driver.findElement(By.name("password")).sendKeys("12345678");
        driver.findElement(By.name("phone")).sendKeys("123-123-1234");
        driver.findElement(By.cssSelector("input[value='female']")).click();
        driver.findElement(By.name("birthday")).sendKeys("06/04/1991");
        Select department = new Select(driver.findElement(By.name("department")));
        department.selectByVisibleText("Department of Engineering");
        Select jobTitle=new Select(driver.findElement(By.name("job_title")));
        jobTitle.selectByVisibleText("SDET");
        WebElement Java=driver.findElement(By.cssSelector("label[for='inlineCheckbox2']"));
        driver.findElement(By.id("wooden_spoon")).click();
        String actualMessage=driver.findElement(By.xpath("//p")).getText();
        System.out.println(actualMessage);
        String expectedMessage="You've successfully completed registration!";
        Assert.assertEquals(actualMessage,expectedMessage,"Successful sign up verification message is wrong");
        Assert.assertTrue(driver.findElement(By.xpath("//p")).isDisplayed());


}







 /*   @AfterMethod
    public void teardown() {
        driver.quit();
    }*/
}