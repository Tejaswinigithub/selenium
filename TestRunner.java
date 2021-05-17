package stepdef;

import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = {"Feature Files"},
		glue={"stepdef"},
		//plugin = {"html:target/Report.html" }
		//dryRun = true,
		plugin = { "de.monochromata.cucumber.report.PrettyReports:target/cucumber" },
		// plugin = { "de.monochromata.cucumber.report.PrettyReports:target/cucumber", "json:target/cucumber.json" },
		
	    tags= "@Regression"

		)
 
public class TestRunner 
{
	
 
}

