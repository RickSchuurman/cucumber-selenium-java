package nl.joyoftesting.cucumber.driver;

import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Setup {

    public static WebDriver driver;
    private static boolean onlyOnce = false;

    @Before
    public void downloadWebdriver() {
        if (!onlyOnce) {
            WebDriverManager.chromedriver().setup();
            onlyOnce = true;
        }
    }

    @Before
    public void setWebDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);
    }
}
