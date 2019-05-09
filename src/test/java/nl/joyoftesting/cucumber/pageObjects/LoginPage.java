package nl.joyoftesting.cucumber.pageObjects;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private String BASEURL = "http://taphost:9500";
    private String PASSWORD = "Welkom01!";

    private By setUserName = By.id("username-id");
    private By setPassWord = By.id("password-id");
//    private By submit = By.className("login-button");
    private By submit = By.cssSelector(".login-button #btn-login");
//    private By submit = By.xpath("/html/body/teas-root/div/div[2]/div/div/div/div/form/div[2]/div");


    public void openLoginPage() {
        driver.get(BASEURL + "/login");
    }

    public void setUsername(String userName) {
        driver.findElement(setUserName).sendKeys(userName);
    }

    public void setPassword() {
        driver.findElement(setPassWord).sendKeys(PASSWORD);
    }

    public void clickSubmit() {
        driver.findElement(submit).click();
    }
}
