package nl.joyoftesting.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"pretty",
        "json:target/cucumber-report/cucumber.json"},
    features = "classpath:features",
    glue = {"nl.joyoftesting.cucumber"})
public class RunCucumberTest {

}
