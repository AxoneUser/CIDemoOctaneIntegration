package psetest.cucumber.demo.testrunner;

import cucumber.api.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = { "psetest/cucumber/demo/testcases" }, plugin = { "pretty",
		"html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.json",
		"rerun:target/cucumber-reports/re-run.txt" }, monochrome = true, dryRun = false, tags = { "@RestApi"})


public class TestNGRunner extends CustomTestNGCucumberRunner{

	

}
