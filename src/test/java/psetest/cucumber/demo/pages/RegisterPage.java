
package psetest.cucumber.demo.pages;

import static psetest.cucumber.demo.page.constants.RegisterPageConstants.ADDRESS_TEXTBOX;
import static psetest.cucumber.demo.page.constants.RegisterPageConstants.CITY_TEXTBOX;
import static psetest.cucumber.demo.page.constants.RegisterPageConstants.CONFIRMATION_LABEL;
import static psetest.cucumber.demo.page.constants.RegisterPageConstants.CONFIRM_PASSWORD_TEXTBOX;
import static psetest.cucumber.demo.page.constants.RegisterPageConstants.COUNTRY_DROPDOWN;
import static psetest.cucumber.demo.page.constants.RegisterPageConstants.EMAIL_TEXTBOX;
import static psetest.cucumber.demo.page.constants.RegisterPageConstants.FIRST_NAME_TEXTBOX;
import static psetest.cucumber.demo.page.constants.RegisterPageConstants.LAST_NAME_TEXTBOX;
import static psetest.cucumber.demo.page.constants.RegisterPageConstants.PASSWORD_TEXTBOX;
import static psetest.cucumber.demo.page.constants.RegisterPageConstants.PHONE_TEXTBOX;
import static psetest.cucumber.demo.page.constants.RegisterPageConstants.POSTAL_CODE_TEXTBOX;
import static psetest.cucumber.demo.page.constants.RegisterPageConstants.STATE_TEXTBOX;
import static psetest.cucumber.demo.page.constants.RegisterPageConstants.SUBMIT_BUTTON;
import static psetest.cucumber.demo.page.constants.RegisterPageConstants.USERNAME_TEXTBOX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import psetest.cucumber.demo.page.base.BasePage;
import psetest.cucumber.demo.utils.SeleniumUtil;

public class RegisterPage extends BasePage {

	public RegisterPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = FIRST_NAME_TEXTBOX)
	private WebElement txtFirstName;

	@FindBy(name = LAST_NAME_TEXTBOX)
	private WebElement txtLastName;

	@FindBy(name = PHONE_TEXTBOX)
	private WebElement txtPhone;

	@FindBy(id = EMAIL_TEXTBOX)
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

	@FindBy(id = USERNAME_TEXTBOX)
	private WebElement txtUserName;

	@FindBy(name = PASSWORD_TEXTBOX)
	private WebElement txtPassword;

	@FindBy(name = CONFIRM_PASSWORD_TEXTBOX)
	private WebElement txtConfirmPassword;

	@FindBy(name = SUBMIT_BUTTON)
	private WebElement btnSubmit;

	@FindBy(xpath = CONFIRMATION_LABEL)
	private WebElement lblConfirmationText;

	public RegisterPage enterFirstName(final String valueToEnter) {
		SeleniumUtil.enterDataToTextBox(txtFirstName, valueToEnter);
		return this;
	}

	public RegisterPage enterLastName(final String valueToEnter) {
		SeleniumUtil.enterDataToTextBox(txtLastName, valueToEnter);
		return this;
	}
	
	public RegisterPage enterPhone(final String valueToEnter) {
		SeleniumUtil.enterDataToTextBox(txtPhone, valueToEnter);
		return this;
	}

	public RegisterPage enterEmail(final String valueToEnter) {
		SeleniumUtil.enterDataToTextBox(txtEmail, valueToEnter);
		return this;
	}

	public RegisterPage enterAddress(final String valueToEnter) {
		SeleniumUtil.enterDataToTextBox(txtAddress, valueToEnter);
		return this;
	}

	public RegisterPage enterCity(final String valueToEnter) {
		SeleniumUtil.enterDataToTextBox(txtCity, valueToEnter);
		return this;
	}

	public RegisterPage enterState(final String valueToEnter) {
		SeleniumUtil.enterDataToTextBox(txtState, valueToEnter);
		return this;
	}

	public RegisterPage enterPostalCode(final String valueToEnter) {
		SeleniumUtil.enterDataToTextBox(txtPostalCode, valueToEnter);
		return this;
	}

	public RegisterPage selectCountryFromDropdown(final String valueToSelect) {
		SeleniumUtil.selectOptionFromList(ddlCountry, valueToSelect);
		return this;
	}

	public RegisterPage enterUserName(final String valueToEnter) {
		SeleniumUtil.enterDataToTextBox(txtUserName, valueToEnter);
		return this;
	}

	public RegisterPage enterPassword(final String valueToEnter) {
		SeleniumUtil.enterDataToTextBox(txtPassword, valueToEnter);
		return this;
	}

	public RegisterPage enterConfirmPassword(final String valueToEnter) {
		SeleniumUtil.enterDataToTextBox(txtConfirmPassword, valueToEnter);
		return this;
	}

	public RegisterPage clickSubmit() {
		SeleniumUtil.clickElement(btnSubmit);
		return this;
	}

	public String getConfirmationLabel() {
		return SeleniumUtil.getAttributeValue(lblConfirmationText, "innerText");

	}
}
