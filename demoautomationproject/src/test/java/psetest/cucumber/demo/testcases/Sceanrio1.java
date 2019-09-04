package psetest.cucumber.demo.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cucumber.api.java.en.Given;

public class Sceanrio1 {
	/** Log4j Logger. */
	private static final Logger LOG = LogManager.getLogger(Sceanrio1.class);
	
	@Given("Step from {string} in {string} feature file")
	public void navigateToURL(String str1,String str2) throws ClassNotFoundException {
		LOG.info("I navigate to easyJet URL and accept the cookies");
	}
}
