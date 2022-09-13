package properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {

    protected static WebDriver driver;

    @Before
        public void setUp() {
        driver = getConfiguredDriver();
        driver.get("https://avic.ua/ua");
    }

    public static WebDriver getDriver() {
        return driver;
    }

    private static WebDriver getConfiguredDriver() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
       // System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.close();
        }
    }
}
