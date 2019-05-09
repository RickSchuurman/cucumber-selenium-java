package nl.joyoftesting.cucumber.stepDefs;

import cucumber.api.java.en.Given;
import nl.joyoftesting.cucumber.pageObjects.LoginPage;

public class LoginDefs {

    LoginPage loginPage = new LoginPage();

    @Given("^user \"([^\"]*)\" logs in to teas$")
    public void userLogsInToTeas(String userName) {

        loginPage.openLoginPage();
        loginPage.setUsername(userName);
        loginPage.setPassword();
        loginPage.clickSubmit();
    }
}
