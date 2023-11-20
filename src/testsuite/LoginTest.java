package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    String baseURL = "https://opensource-demo.orangehrmlive.com/"; // set base url

    @Before
    public void setUp(){openBrowser(baseURL);}

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String expected = "Dashboard";
        String actual = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
        Assert.assertEquals("Correct Message not Displayed",expected,actual);

    }

    @After
    public void tearDown(){closeBrowser();}
}
