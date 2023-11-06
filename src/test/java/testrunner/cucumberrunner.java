package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/java/featurefiles",
        glue = "stepdefinitions",
        plugin = {"pretty", "json:target/cucumber-reports"}
)
public class cucumberrunner extends AbstractTestNGCucumberTests {


}
