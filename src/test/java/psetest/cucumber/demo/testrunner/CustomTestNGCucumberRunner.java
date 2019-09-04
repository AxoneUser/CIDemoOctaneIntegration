package psetest.cucumber.demo.testrunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

public class CustomTestNGCucumberRunner {
private TestNGCucumberRunner testNGCucumberRunner;
	
	

	@BeforeTest
	public void setUp() {
		System.out.println("I am in before Test");
		
	}


	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
	public void runScenario(PickleEventWrapper pickleWrapper, CucumberFeatureWrapper featureWrapper) throws Throwable {
		// the 'featureWrapper' parameter solely exists to display the feature file in a
		// test report
		testNGCucumberRunner.runScenario(pickleWrapper.getPickleEvent());
	}

	/**
	 * Returns two dimensional array of PickleEventWrapper scenarios with their
	 * associated CucumberFeatureWrapper feature.
	 *
	 * @return a two dimensional array of scenarios features.
	 */
	@DataProvider
	public Object[][] scenarios() {
		if (testNGCucumberRunner == null) {
			return new Object[0][0];
		}
		return testNGCucumberRunner.provideScenarios();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {
		if (testNGCucumberRunner == null) {
			return;
		}
		testNGCucumberRunner.finish();
	}

}
