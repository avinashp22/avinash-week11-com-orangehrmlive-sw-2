package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginTest extends BaseTest {

    String baseURL = "https://opensource-demo.orangehrmlive.com/"; // set base url

    @Before
    public void setUp(){openBrowser(baseURL);}

    @Test


    @After
    public void tearDown(){closeBrowser();}
}
