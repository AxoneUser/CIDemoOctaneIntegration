package psetest.cucumber.demo.pages;

import static psetest.cucumber.demo.page.constants.FlightPageConstants.ADD_FLIGHT_DETAILS_BUTTON;
import static psetest.cucumber.demo.page.constants.FlightPageConstants.ADD_FLIGHT_DETAILS_LINK;
import static psetest.cucumber.demo.page.constants.FlightPageConstants.CONTINUE_BUTTON;
import static psetest.cucumber.demo.page.constants.FlightPageConstants.FLIGHT_NUMBER_TEXTBOX;
import static psetest.cucumber.demo.page.constants.FlightPageConstants.SINGlE_FLIGHT_IMAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class FlightPage {

	protected WebDriver driver;

	public FlightPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id=ADD_FLIGHT_DETAILS_LINK)
	private WebElement lnkAddFlightDetails;
	
	@FindBy(id=SINGlE_FLIGHT_IMAGE)
	private WebElement imgSingleFlight;
	
	@FindBy(id=FLIGHT_NUMBER_TEXTBOX)
	private WebElement txtFlightNumber;
	
	@FindBy(id=ADD_FLIGHT_DETAILS_BUTTON)
	private WebElement btnAddFlightDetails;
	
	@FindBy(id=CONTINUE_BUTTON)
	private WebElement btnContinue;

	
	public FlightPage clickAddFlightsLink() {
		lnkAddFlightDetails.click();
		return this;
	}
	
	public FlightPage clickSingleFlight() {
		imgSingleFlight.click();
		return this;
	}
	
	public FlightPage enterFlightNumber(String flightNumber) {
		txtFlightNumber.sendKeys(flightNumber);
		return this;
	}
	
	public FlightPage clickAddFlights() {
		btnAddFlightDetails.click();
		return this;
	}
	
	public FlightPage clickContinue() {
		btnContinue.click();
		return this;
	}
}
