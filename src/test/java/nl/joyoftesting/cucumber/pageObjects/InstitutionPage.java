package nl.joyoftesting.cucumber.pageObjects;

import java.util.ArrayList;
import java.util.List;

import nl.joyoftesting.cucumber.support.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InstitutionPage extends BasePage {

    Helpers helpers = new Helpers();

    private By title = By.className("text-title");

    public String getTitle() {
        helpers.waitForElement(title);
        return driver.findElement(title).getText();
    }

    public List<String> getTableRows() {

        List<String> liststr = new ArrayList<>();

        // Grab the table
        WebElement table = driver.findElement(By.className("result-table"));

        // Get all rows from table
        List<WebElement> allRows = table.findElements(By.className("result-table-cell"));
        for (WebElement row : allRows) {

            liststr.add(row.getText());
        }

        return liststr;
    }
}