package nl.joyoftesting.cucumber.support;

import nl.joyoftesting.cucumber.pageObjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helpers extends BasePage {

    public void waitForElement(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
}
