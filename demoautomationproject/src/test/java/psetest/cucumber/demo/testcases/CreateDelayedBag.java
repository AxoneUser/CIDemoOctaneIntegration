package psetest.cucumber.demo.testcases;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.Status;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import psetest.cucumber.demo.page.base.BasePage;
import psetest.cucumber.demo.pages.BaggagePage;
import psetest.cucumber.demo.pages.FlightPage;
import psetest.cucumber.demo.pages.LandingPagePSS;
import psetest.cucumber.demo.pages.PassengerPage;
import psetest.cucumber.demo.pages.ReviewPage;
import psetest.cucumber.demo.test.base.TestBase;

public class CreateDelayedBag {

	/** Log4j Logger. */
	private static final Logger LOG = LogManager.getLogger(CreateDelayedBag.class);

	/** TestBase reference **/
	private TestBase testBase;

	/**
	 * Adding the picco container cucumber dependency injection so that i can access
	 * the test base object and reference variables.
	 * 
	 * @param <strong>TestBase</strong>
	 */
	public CreateDelayedBag(TestBase testBase) {
		this.testBase = testBase;
	}

	/** BasePage reference **/
	private BasePage basePage;

	/** LandingPagePSS reference **/
	private LandingPagePSS landingPage;

	/** FlightConfirmationPage reference **/
	private FlightPage flightPage;

	/** BaggagePage reference **/
	private BaggagePage baggagePage;

	/** PassengerPage reference **/
	private PassengerPage passengerPage;

	/** ReviewPage reference **/
	private ReviewPage reviewPage;

	@Given("I navigate to easyJet URL and accept the cookies")
	public void navigateToURL() throws ClassNotFoundException {
		LOG.info("I navigate to easyJet URL and accept the cookies");
		this.testBase.extentScenario.createNode(new GherkinKeyword("Then"),
				"I navigate to easyJet URL and accept the cookies");
		basePage = new BasePage(this.testBase.driver);
		this.testBase.extentScenario.log(Status.INFO, "Navigating to the URL");
		basePage.navigateToUrl("https://mybag-qa.aero/baggage/#/easyJet/en-gb/main-menu");
		this.testBase.driver.manage().window().maximize();
		this.testBase.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		this.testBase.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		landingPage = new LandingPagePSS(this.testBase.driver);
		this.testBase.extentScenario.log(Status.INFO, "Clicking Got IT continue");
		LOG.info("Clicking Got IT continue");
		landingPage.clickGotItContinue();
	}

	@When("I Click on Report a delayed Bag Image and click on continue button in popup")
	public void clickReportDelayedBagImage() throws ClassNotFoundException {
		this.testBase.extentScenario.createNode(new GherkinKeyword("When"),
				"Click on Report a delayed Bag Image and click on continue button in popup");
		this.testBase.extentScenario.log(Status.INFO, "Clicking On Delayed Bag Image");
		LOG.info("Clicking On Delayed Bag Image");
		landingPage.clickReportDelayedBagImage();

	}

	@Then("I will land on flight page")
	public void navigateToFlightPage() throws ClassNotFoundException {
		this.testBase.extentScenario.createNode(new GherkinKeyword("Then"), "I will land on flight page");
		this.testBase.extentScenario.log(Status.INFO, "Clicking On Continue Button");
		LOG.info("Clicking On Continue Button");
		landingPage.clickSubmit();
	}

	@When("I will Enter the flight details page data and click on Continue button")
	public void enterFlightDetailsData(DataTable dataTable) throws InterruptedException, ClassNotFoundException {
		this.testBase.extentScenario.createNode(new GherkinKeyword("When"),
				"I will Enter the flight details page data and click on Continue button");
		this.testBase.extentScenario.log(Status.INFO, "Navigating to the flight page");
		LOG.info("Navigating to the flight page");
		Map<String, String> mData = dataTable.asMap(String.class, String.class);
		Thread.sleep(4000);
		flightPage = new FlightPage(this.testBase.driver);
		this.testBase.extentScenario.log(Status.INFO, "Entering the flight information");
		flightPage.clickAddFlightsLink().clickSingleFlight().enterFlightNumber(mData.get("flightNumber"))
				.clickAddFlights();
		Thread.sleep(4000);
		this.testBase.extentScenario.log(Status.INFO, "Click Continue button");
		LOG.info("Click Continue button");
		flightPage.clickContinue();
		Thread.sleep(4000);
		this.testBase.extentScenario.log(Status.INFO, "Navigating to the baggage details page");
		LOG.info("Navigating to the baggage details page");
	}

	@Then("I will land on Baggage Details page data and enter the required information on the page")
	public void enterBaggageDetailsData() throws InterruptedException, ClassNotFoundException {
		this.testBase.extentScenario.createNode(new GherkinKeyword("Then"),
				"I will Enter the flight details page data and click on Continue button");
		this.testBase.extentScenario.log(Status.INFO, "Clicking the bag information on the bag details page");
		LOG.info("Clicking the bag information on the bag details page");
		baggagePage = new BaggagePage(this.testBase.driver);
		Thread.sleep(4000);
		baggagePage.clickContinueButton().clickThanksButton().clickAddDescription().clickLuggageBagsImage()
				.clickZipperBagsImage();
		Thread.sleep(2000);
		baggagePage.clickUprightBagsImage();
		Thread.sleep(2000);
		baggagePage.clickColorGreyImage();
		Thread.sleep(3000);
		baggagePage.clickLeatherImage();
		Thread.sleep(2000);
		baggagePage.clickAddBaggageDescriptionButton();
		Thread.sleep(3000);

	}

	@Then("click on continue button and navigate to passenger details page")
	public void navigateToPassengerDetailsPage() throws InterruptedException, ClassNotFoundException {
		this.testBase.extentScenario.createNode(new GherkinKeyword("Then"),
				"click on continue button and navigate to passenger details page");
		this.testBase.extentScenario.log(Status.INFO, "Click Continue Bag Button");
		LOG.info("Click Continue Bag Button");
		baggagePage.clickContinueBagButton();
		passengerPage = new PassengerPage(this.testBase.driver);
		Thread.sleep(4000);
	}

	@Then("I will enter the data on Passenger details page")
	public void enterPassengerDetailsData(DataTable dataTable) throws ClassNotFoundException {
		Map<String, String> mData = dataTable.asMap(String.class, String.class);
		this.testBase.extentScenario.createNode(new GherkinKeyword("Then"),
				"I will enter the data on Passenger details page");
		this.testBase.extentScenario.log(Status.INFO, "Navigating to the Passenger details page");
		this.testBase.extentScenario.log(Status.INFO, "Entering passenger details information");
		LOG.info("Entering passenger details information");
		passengerPage.enterTitle(mData.get("title")).enterGivenName(mData.get("givenName"))
				.enterFamilyName(mData.get("familyName")).selectCountry(mData.get("country"))
				.enterMobileNumber(mData.get("mobileNumber")).enterEmail(mData.get("email")).clickCollectFromAirport();
	}

	@When("I click on Add home address link")
	public void clickAddHomeAddressLink() throws ClassNotFoundException {
		this.testBase.extentScenario.createNode(new GherkinKeyword("When"), "I click on Add home address link");
		this.testBase.extentScenario.log(Status.INFO, "Click Home Address Link");
		LOG.info("Click Home Address Link");
		passengerPage.clickHomeAddressLink();
	}

	@Then("I will fill the data in Add home address pop and click on add address button")
	public void enterAddHomeAddressDetails(DataTable dataTable) throws InterruptedException, ClassNotFoundException {
		Map<String, String> mData = dataTable.asMap(String.class, String.class);
		Thread.sleep(4000);
		this.testBase.extentScenario.createNode(new GherkinKeyword("Then"),
				"I will fill the data in Add home address pop and click on add address button");
		this.testBase.extentScenario.log(Status.INFO, "Entering the home address details in the popup");
		LOG.info("Entering the home address details in the popup");
		passengerPage.enterAddress(mData.get("address")).enterCity(mData.get("city")).enterCounty(mData.get("county"))
				.selectCountryCode(mData.get("countryCode")).clickAddAddressButton();

	}

	@Then("I will click on Continue button")
	public void navigateToReviewPage() throws InterruptedException, ClassNotFoundException {
		Thread.sleep(6000);
		this.testBase.extentScenario.createNode(new GherkinKeyword("Then"), "I will click on Continue button");
		this.testBase.extentScenario.log(Status.INFO, "Clicking Check Bits 1 Button");
		LOG.info("Clicking Check Bits 1 Button");
		passengerPage.clickCheckBits1Button();
		this.testBase.extentScenario.log(Status.INFO, "Clicking Check Bits 2 Button");
		LOG.info("Clicking Check Bits 1 Button");
		passengerPage.clickCheckBits2Button();
		this.testBase.extentScenario.log(Status.INFO, "Clicking Continue Button");
		LOG.info("Clicking Check Bits 1 Button");
		passengerPage.clickContinueButton();
	}

	@Then("Navigate to review page and click on Nothing to declare and click submit button")
	public void clickSubmitButton() throws InterruptedException, ClassNotFoundException {
		this.testBase.extentScenario.createNode(new GherkinKeyword("Then"),
				"Navigate to review page and click on Nothing to declare and click submit button");
		reviewPage = new ReviewPage(this.testBase.driver);
		Thread.sleep(4000);
		this.testBase.extentScenario.log(Status.INFO, "Clicking Nothing to declare Button");
		LOG.info("Clicking Nothing to declare Button");
		reviewPage.clickNothingToDeclareButton().clickSubmitButton();
		this.testBase.extentScenario.log(Status.INFO, "Clicking Submit Button");
		LOG.info("Clicking Submit Button");
		Thread.sleep(6000);
	}

	@Then("Store the file reference number and print it")
	public void printFileReferenceNumber() throws ClassNotFoundException {
		this.testBase.extentScenario.createNode(new GherkinKeyword("Then"),
				"Store the file reference number and print it");
		this.testBase.extentScenario.log(Status.INFO,
				"Printing file reference number " + reviewPage.getConfirmationLabel());
		LOG.info("Printing file reference number " + reviewPage.getConfirmationLabel());
		System.out.println("Reference number is :" + reviewPage.getConfirmationLabel());
	}

	@Then("close the browser")
	public void closeBrowser() throws ClassNotFoundException {
		this.testBase.extentScenario.createNode(new GherkinKeyword("Then"), "close the browser");
		this.testBase.extentScenario.log(Status.INFO, "Closing the browser");
		LOG.info("Closing the browser");
		if (this.testBase.driver != null) {
			this.testBase.driver.quit();
		}

	}
}
