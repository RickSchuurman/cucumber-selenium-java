package nl.joyoftesting.cucumber.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends BasePage {

    @FindBy(css = "#ires h3")
    private List<WebElement> results;

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    public String getResult(int number) {
        return results.get(number - 1).getText();
    }
}
