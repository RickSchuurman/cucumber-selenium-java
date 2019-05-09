package nl.joyoftesting.cucumber.stepDefs;

import java.util.List;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import nl.joyoftesting.cucumber.pageObjects.InstitutionPage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class InstitutionDefs {

    InstitutionPage institutionPage = new InstitutionPage();

    @When("^user entered the institution page$")
    public void userEnteredTheInstitutionPage() {
        assertThat(institutionPage.getTitle(), is("Institutions"));
    }

    @Then("^I should see the following institutions$")
    public void iShouldSeeTheFollowingInstitutions(DataTable dataTable) {
        List<String> collection = dataTable.asList(String.class);
        System.out.println("expect" + collection);

        System.out.println("actual"  + institutionPage.getTableRows());
        assertThat(collection, is(institutionPage.getTableRows()));


    }
}
