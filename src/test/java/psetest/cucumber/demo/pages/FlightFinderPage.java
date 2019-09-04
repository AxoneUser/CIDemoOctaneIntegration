package psetest.cucumber.demo.pages;

import static psetest.cucumber.demo.page.constants.FlightFinderPageConstants.AIRLINE_DROPDOWN;
import static psetest.cucumber.demo.page.constants.FlightFinderPageConstants.ARRIVING_IN_DROPDOWN;
import static psetest.cucumber.demo.page.constants.FlightFinderPageConstants.CONTINUE_BUTTON;
import static psetest.cucumber.demo.page.constants.FlightFinderPageConstants.DAY_DROPDOWN;
import static psetest.cucumber.demo.page.constants.FlightFinderPageConstants.DEPARTING_FROM_DROPDOWN;
import static psetest.cucumber.demo.page.constants.FlightFinderPageConstants.MONTH_DROPDOWN;
import static psetest.cucumber.demo.page.constants.FlightFinderPageConstants.PROFILE_LINK;
import static psetest.cucumber.demo.page.constants.FlightFinderPageConstants.RETURNING_DAY_DROPDOWN;
import static psetest.cucumber.demo.page.constants.FlightFinderPageConstants.RETURNING_MONTH_DROPDOWN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import psetest.cucumber.demo.page.base.BasePage;
import psetest.cucumber.demo.utils.SeleniumUtil;

public class FlightFinderPage extends BasePage {

	public FlightFinderPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = DEPARTING_FROM_DROPDOWN)
	private WebElement ddlDepartingFrom;

	@FindBy(name = MONTH_DROPDOWN)
	private WebElement ddlMonth;

	@FindBy(name = DAY_DROPDOWN)
	private WebElement ddlDay;

	@FindBy(name = ARRIVING_IN_DROPDOWN)
	private WebElement ddlArrivingIn;

	@FindBy(name = RETURNING_MONTH_DROPDOWN)
	private WebElement ddlReturningMonth;

	@FindBy(name = RETURNING_DAY_DROPDOWN)
	private WebElement ddlReturningDay;

	@FindBy(name = AIRLINE_DROPDOWN)
	private WebElement ddlAirline;

	@FindBy(name = CONTINUE_BUTTON)
	private WebElement btnContinue;

	@FindBy(xpath = PROFILE_LINK)
	private WebElement lnkProfile;

	public FlightFinderPage selectDepartingFrom(final String departingStation) {
		SeleniumUtil.selectOptionFromList(ddlDepartingFrom, departingStation);
		return this;
	}

	public FlightFinderPage selectDepartingMonth(final String departingMonth) {
		SeleniumUtil.selectOptionFromList(ddlMonth, departingMonth);
		return this;
	}

	public FlightFinderPage selectDepartingDay(final String departingDay) {
		SeleniumUtil.selectOptionFromList(ddlDay, departingDay);
		return this;
	}

	public FlightFinderPage selectArrivingIn(final String arrivingStation) {
		SeleniumUtil.selectOptionFromList(ddlArrivingIn, arrivingStation);
		return this;
	}

	public FlightFinderPage selectReturningMonth(final String returningMonth) {
		SeleniumUtil.selectOptionFromList(ddlReturningMonth, returningMonth);
		return this;
	}

	public FlightFinderPage selectReturningDay(final String returningDay) {
		SeleniumUtil.selectOptionFromList(ddlReturningDay, returningDay);
		return this;
	}

	public FlightFinderPage selectAirline(final String airline) {
		SeleniumUtil.selectOptionFromList(ddlAirline, airline);
		return this;
	}

	public FlightFinderPage clickContinueButton() {
		SeleniumUtil.clickElement(btnContinue);
		return this;
	}

	public FlightFinderPage clickProfileLink() {
		SeleniumUtil.clickElement(lnkProfile);
		return this;
	}
}
