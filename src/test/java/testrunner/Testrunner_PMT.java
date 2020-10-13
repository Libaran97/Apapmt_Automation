package testrunner;

//"classpath:PMTlogincheck.feature",


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Featurefiles"},
		//features = "Featurefiles",
		glue = "pmttestcases.stepdefinition",
		dryRun = false,
		monochrome = true,
		//format = {"pretty", "html: test-output"},
				plugin = {"junit:target/cucumber-results.xml"},
			//	plugin = {"com.cucumber.listener.ExtentCucumx`berFormatter:target/html/ExtentReport.html"},
				//plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		strict = false,
				
			
				//tags = {"@sanity"}
		
		tags = {"@sanity1"}
		)

public class Testrunner_PMT {

}
