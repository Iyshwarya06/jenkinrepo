package overviewOfCucumber.Scenario2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="/Users/IY20463954/Documents/Assignments/overviewOfCucumber/src/main/java/overviewOfCucumber/Scenario2/Feature2.feature"
		,glue={"overviewOfCucumber.Scenario2"}
		)
public class Runner2 extends AbstractTestNGCucumberTests {
	

}
