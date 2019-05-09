package nl.joyoftesting.cucumber.stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.ast.DataTable;
import nl.joyoftesting.cucumber.pageObjects.IsItFriday;
import static org.junit.Assert.assertEquals;

public class IsItFriday_StepDefs {

    private String today;
    private String actualAnswer;

    private IsItFriday isItFriday;

    public IsItFriday_StepDefs() {
        this.isItFriday = new IsItFriday();
    }

    @Given("^today is \"([^\"]*)\"$")
    public void todayIs(String day) {
        this.today = day;
    }

    @Given("^days of the week$")
    public void daysOfTheWeek(DataTable days) {

    }

    @When("^I ask whether it's Friday yet$")
    public void iAskWhetherItSFridayYet() {
        actualAnswer = isItFriday.isItFriday(today);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void iShouldBeTold(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

}

