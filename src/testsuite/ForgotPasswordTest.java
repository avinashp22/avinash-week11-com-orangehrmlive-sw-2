/**
 *4. Write down the following test into ‘ForgotPasswordTest’ class
 * 1. userShouldNavigateToForgotPasswordPageSuccessfully
 * * click on the ‘Forgot your password’ link
 * * Verify the text ‘Reset Password’
 */

package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    String baseURL = "https://opensource-demo.orangehrmlive.com/"; // set base url

    @Before
    public void setUp(){openBrowser(baseURL);}

    @Test

    public void userShouldNavigateToForgotPasswordPageSuccessfully(){

        driver.findElement(By.xpath("//p[text() = 'Forgot your password? ']")).click();
        String expected = "Reset Password";
        String actual = driver.findElement(By.xpath("//h6[text() = 'Reset Password']")).getText();
        Assert.assertEquals("Correct Message not Displayed",expected,actual);

    }

    @After
    public void tearDown(){closeBrowser();}

}
