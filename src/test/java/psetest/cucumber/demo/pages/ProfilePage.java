package psetest.cucumber.demo.pages;

import static psetest.cucumber.demo.page.constants.ProfilePageConstants.ADDRESS_TEXTBOX;
import static psetest.cucumber.demo.page.constants.ProfilePageConstants.CITY_TEXTBOX;
import static psetest.cucumber.demo.page.constants.ProfilePageConstants.COUNTRY_DROPDOWN;
import static psetest.cucumber.demo.page.constants.ProfilePageConstants.EMAIL_TEXTBOX;
import static psetest.cucumber.demo.page.constants.ProfilePageConstants.FIRST_NAME_TEXTBOX;
import static psetest.cucumber.demo.page.constants.ProfilePageConstants.LAST_NAME_TEXTBOX;
import static psetest.cucumber.demo.page.constants.ProfilePageConstants.PHONE_TEXTBOX;
import static psetest.cucumber.demo.page.constants.ProfilePageConstants.POSTAL_CODE_TEXTBOX;
import static psetest.cucumber.demo.page.constants.ProfilePageConstants.STATE_TEXTBOX;
import static psetest.cucumber.demo.page.constants.ProfilePageConstants.SUBMIT_BUTTON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import psetest.cucumber.demo.page.base.BasePage;
import psetest.cucumber.demo.utils.SeleniumUtil;

public class ProfilePage extends BasePage {

	public ProfilePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = FIRST_NAME_TEXTBOX)
	private WebElement txtFirstName;

	@FindBy(name = LAST_NAME_TEXTBOX)
	private WebElement txtLastName;

	@FindBy(name = PHONE_TEXTBOX)
	private WebElement txtPhone;

	@FindBy(name = EMAIL_TEXTBOX)
	private WebElement txtEmail;

	@FindBy(name = ADDRESS_TEXTBOX)
	private WebElement txtAddress;

	@FindBy(name = CITY_TEXTBOX)
	private WebElement txtCity;

	@FindBy(name = STATE_TEXTBOX)
	private WebElement txtState;

	@FindBy(name = POSTAL_CODE_TEXTBOX)
	private WebElement txtPostalCode;

	@FindBy(name = COUNTRY_DROPDOWN)
	private WebElement ddlCountry;

	@FindBy(xpath = SUBMIT_BUTTON)
	private WebElement btnSubmit;

	public ProfilePage enterFirstName(final String valueToEnter) {
		SeleniumUtil.enterDataToTextBox(txtFirstName, valueToEnter);
		return this;
	}

	public ProfilePage enterLastName(final String valueToEnter) {
		SeleniumUtil.enterDataToTextBox(txtLastName, valueToEnter);
		return this;
	}

	public ProfilePage enterPhone(final String valueToEnter) {
		SeleniumUtil.enterDataToTextBox(txtPhone, valueToEnter);
		return this;
	}

	public ProfilePage enterEmail(final String valueToEnter) {
		SeleniumUtil.enterDataToTextBox(txtEmail, valueToEnter);
		return this;
	}

	public ProfilePage enterAddress(final String valueToEnter) {
		SeleniumUtil.enterDataToTextBox(txtAddress, valueToEnter);
		return this;
	}

	public ProfilePage enterCity(final String valueToEnter) {
		SeleniumUtil.enterDataToTextBox(txtCity, valueToEnter);
		return this;
	}

	public ProfilePage enterState(final String valueToEnter) {
		SeleniumUtil.enterDataToTextBox(txtState, valueToEnter);
		return this;
	}

	public ProfilePage enterPostalCode(final String valueToEnter) {
		SeleniumUtil.enterDataToTextBox(txtPostalCode, valueToEnter);
		return this;
	}

	public ProfilePage selectCountryFromDropdown(final String valueToSelect) {
		SeleniumUtil.selectOptionFromList(ddlCountry, valueToSelect);
		return this;
	}
	
	public ProfilePage clickSubmit() {
		SeleniumUtil.clickElement(btnSubmit);
		return this;
	}
}
