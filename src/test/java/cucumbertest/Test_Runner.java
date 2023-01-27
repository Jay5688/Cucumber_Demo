package cucumbertest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features",
		glue= {"stepDefinition"},
		tags="(@SmokeTest or @RegressionTest) and (not @E2ETest)"
		
		)


public class Test_Runner {

}


/*
 features = "Features",
		glue= {"stepDefinition"},
		tags="@SmokeTest And @RegressionTest" ----And tests tagged with both
		tags="@SmokeTest or @RegressionTest" ----OR tests tagged with any one of the tags
		tags="not @E2ETest"-------------------- not  tagged with that tag
		tags="(@SmokeTest or @RegressionTest) and (not @E2ETest)"
 */
