package nl.joyoftesting.cucumber.pageObjects;

import nl.joyoftesting.cucumber.driver.Setup;
import nl.joyoftesting.cucumber.driver.Wait;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;
    protected Wait wait;

    public BasePage() {
        this.driver = Setup.driver;
        this.wait = new Wait(this.driver);
    }
}
