package psetest.cucumber.demo.test.base;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class TestBase {

	public WebDriver driver;

	public  ExtentReports extentReports;

	public  ExtentTest extentFeature;

	public  ExtentTest extentScenario;

	/*
	 * public WebDriver getDriver() { return driver; }
	 * 
	 * public void setDriver(WebDriver driver) { this.driver = driver; }
	 */

}
