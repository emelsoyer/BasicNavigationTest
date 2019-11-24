package TestCases3;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class VytrackActivities {
     private WebDriver driver;

     public void setUp(){
         driver= BrowserFactory.getDriver("chrome");
         driver.get("https://qa1.vytrack.com/");


     }


}
