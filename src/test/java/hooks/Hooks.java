package hooks;

//utility class used to define setup and cleanup code that runs before and after each scenario.

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static WebDriver driver;

    @Before
    public void setUp() {
        if (driver == null) {
            driver = new ChromeDriver(); // uses default chromedriver on PATH
            driver.manage().window().maximize();
        }
    }

    @After
    public void tearDown() throws InterruptedException {
        if (driver != null) {
            Thread.sleep(6000);  // pause for 6 seconds so you can see the browser
            driver.quit();
            driver = null;
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
