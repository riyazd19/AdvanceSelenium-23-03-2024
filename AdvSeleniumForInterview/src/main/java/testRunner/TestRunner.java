package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "Feature",
		glue= {"stepdefinition"},
		plugin = {"pretty", "html:target/cucumber-reports"}
		)


public class TestRunner {

}
