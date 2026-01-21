package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features", // Where is the cucumber file? (gherkin)
		glue = "stepDefinitions", // Where is the Java code?
		plugin = {"pretty", "html:target/cucumber-reports.html"},
	    monochrome = true
		)

public class TestRunner extends AbstractTestNGCucumberTests {
	//leave this empty, annotations will do the work.
}
