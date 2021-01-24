package cucumberTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
			glue = "baseMainTests"
		
		)

public class TestRunner extends AbstractTestNGCucumberTests { // Need to extend AbstractTestNGCucumberTests
	// and accept imports to run the project under test NG unit

}
