package amazon.co.uk;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sairam on 25/10/2014.
 */
public class BaseTest extends BasePage{

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.get("http://www.amazon.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @After
    public void tearDown() throws Exception {

        driver.quit();

    }
}
