package psetest.cucumber.demo.pages;

import static psetest.cucumber.demo.page.constants.PassengerPageConstants.ADDRESS_TEXTBOX;
import static psetest.cucumber.demo.page.constants.PassengerPageConstants.TITLE_TEXTBOX;
import static psetest.cucumber.demo.page.constants.PassengerPageConstants.ADD_ADDRESS_BUTTON;
import static psetest.cucumber.demo.page.constants.PassengerPageConstants.CHECK_BITS_1_CHECKBOX;
import static psetest.cucumber.demo.page.constants.PassengerPageConstants.CHECK_BITS_2_CHECKBOX;
import static psetest.cucumber.demo.page.constants.PassengerPageConstants.CITY_TEXTBOX;
import static psetest.cucumber.demo.page.constants.PassengerPageConstants.COLLECT_FROM_AIRPORT_BUTTON;
import static psetest.cucumber.demo.page.constants.PassengerPageConstants.CONTINUE_BUTTON;
import static psetest.cucumber.demo.page.constants.PassengerPageConstants.COUNTRY_DIALING_DROPDOWN;
import static psetest.cucumber.demo.page.constants.PassengerPageConstants.COUNTRY_DROPDOWN;
import static psetest.cucumber.demo.page.constants.PassengerPageConstants.COUNTY_TEXTBOX;
import static psetest.cucumber.demo.page.constants.PassengerPageConstants.EMAIL_TEXTBOX;
import static psetest.cucumber.demo.page.constants.PassengerPageConstants.FAMILY_NAME_TEXTBOX;
import static psetest.cucumber.demo.page.constants.PassengerPageConstants.HOME_ADDRESS_LINK;
import static psetest.cucumber.demo.page.constants.PassengerPageConstants.MOBILE_NUMBER_TEXTBOX;
import static psetest.cucumber.demo.page.constants.PassengerPageConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PassengerPage {
	protected WebDriver driver;

	public PassengerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = TITLE_TEXTBOX)
	private WebElement txtTitle;

	@FindBy(id = GIVEN_NAME_TEXTBOX)
	private WebElement txtGivenName;

	@FindBy(id = FAMILY_NAME_TEXTBOX)
	private WebElement txtFamilyName;

	@FindBy(id = COUNTRY_DIALING_DROPDOWN)
	private WebElement ddlCountry;

	@FindBy(id = MOBILE_NUMBER_TEXTBOX)
	private WebElement txtMobileNumber;

	@FindBy(id = EMAIL_TEXTBOX)
	private WebElement txtEmail;

	@FindBy(id = COLLECT_FROM_AIRPORT_BUTTON)
	private WebElement btnCollectFromAirport;

	@FindBy(id = HOME_ADDRESS_LINK)
	private WebElement lnkHomeAddress;

	@FindBy(id = ADDRESS_TEXTBOX)
	private WebElement txtAddress;

	@FindBy(id = CITY_TEXTBOX)
	private WebElement txtCity;

	@FindBy(id = COUNTY_TEXTBOX)
	private WebElement txtCounty;

	@FindBy(id = COUNTRY_DROPDOWN)
	private WebElement ddlCountryCode;

	@FindBy(id = ADD_ADDRESS_BUTTON)
	private WebElement btnAddAddress;

	@FindBy(xpath = CHECK_BITS_1_CHECKBOX)
	private WebElement chkCheckBits1;

	@FindBy(xpath = CHECK_BITS_2_CHECKBOX)
	private WebElement chkCheckBits2;

	@FindBy(id = CONTINUE_BUTTON)
	private WebElement btnContinue;

	public PassengerPage enterGivenName(String firstName) {
		txtGivenName.sendKeys(firstName);
		return this;
	}
	
	public PassengerPage enterTitle(String title) {
		txtTitle.sendKeys(title);
		return this;
	}

	public PassengerPage enterFamilyName(String familyName) {
		txtFamilyName.sendKeys(familyName);
		return this;
	}

	public PassengerPage selectCountry(String valuesToSelect) {
		Select select = new Select(ddlCountry);
		select.selectByValue(valuesToSelect);
		return this;
	}

	public PassengerPage enterMobileNumber(String mobileNumber) {
		txtMobileNumber.sendKeys(mobileNumber);
		return this;
	}

	public PassengerPage enterEmail(String email) {
		txtEmail.sendKeys(email);
		return this;
	}

	public PassengerPage clickCollectFromAirport() {
		btnCollectFromAirport.click();
		return this;
	}

	public PassengerPage clickHomeAddressLink() {
		lnkHomeAddress.click();
		return this;
	}

	public PassengerPage enterAddress(String address) {
		txtAddress.sendKeys(address);
		return this;
	}

	public PassengerPage enterCity(String city) {
		txtCity.sendKeys(city);
		return this;
	}

	public PassengerPage enterCounty(String county) {
		txtCounty.sendKeys(county);
		return this;
	}

	public PassengerPage selectCountryCode(String valuesToSelect) {
		Select select = new Select(ddlCountryCode);
		select.selectByValue(valuesToSelect);
		return this;
	}

	public PassengerPage clickAddAddressButton() {
		btnAddAddress.click();
		return this;
	}

	public PassengerPage clickCheckBits1Button() {
		chkCheckBits1.click();
		return this;
	}

	public PassengerPage clickCheckBits2Button() {
		chkCheckBits2.click();
		return this;
	}

	public PassengerPage clickContinueButton() {
		btnContinue.click();
		return this;
	}
}
