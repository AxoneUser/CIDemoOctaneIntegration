package psetest.cucumber.demo.testcases;

import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.gherkin.model.Feature;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import psetest.cucumber.demo.report.ReportManager;
import psetest.cucumber.demo.test.base.TestBase;

public class Hooks {

	private TestBase testBase;

	ReportManager reportManager;

	public Hooks(TestBase tBase) {
		testBase = tBase;
	}

	@Before
	public void setUpDriver(Scenario scenario) {
		reportManager = new ReportManager();
		reportManager.extentReportsGeneration();
		testBase.extentFeature = reportManager.extentReports.createTest(Feature.class,
				scenario.getName() + scenario.getClass().toGenericString());
		testBase.extentScenario = testBase.extentFeature.createNode(scenario.getName());
		WebDriverManager.chromedriver().setup();
		testBase.driver = new ChromeDriver();
	}

	@After
	public void flushReports(Scenario scenario) {
		reportManager.extentReports.flush();
		if (this.testBase.driver != null) {
			this.testBase.driver.quit();
		}

		if (scenario.isFailed()) {

		}
	}
}
