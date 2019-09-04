package psetest.cucumber.demo.pages;

import static psetest.cucumber.demo.page.constants.BookFlightPageConstants.CARD_TYPE_DROPDOWN;
import static psetest.cucumber.demo.page.constants.BookFlightPageConstants.CREDIT_CARD_FIRST_NAME_TEXTBOX;
import static psetest.cucumber.demo.page.constants.BookFlightPageConstants.CREDIT_CARD_LAST_NAME_TEXTBOX;
import static psetest.cucumber.demo.page.constants.BookFlightPageConstants.CREDIT_CARD_MIDDLE_NAME_TEXTBOX;
import static psetest.cucumber.demo.page.constants.BookFlightPageConstants.CREDIT_CARD_NUMBER_TEXTBOX;
import static psetest.cucumber.demo.page.constants.BookFlightPageConstants.EXPIRATION_MONTH_DROPDOWN;
import static psetest.cucumber.demo.page.constants.BookFlightPageConstants.EXPIRATION_YEAR_DROPDOWN;
import static psetest.cucumber.demo.page.constants.BookFlightPageConstants.FIRST_NAME_TEXTBOX;
import static psetest.cucumber.demo.page.constants.BookFlightPageConstants.LAST_NAME_TEXTBOX;
import static psetest.cucumber.demo.page.constants.BookFlightPageConstants.MEAL_DROPDOWN;
import static psetest.cucumber.demo.page.constants.BookFlightPageConstants.SECURE_PURCHASE_BUTTON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import psetest.cucumber.demo.page.base.BasePage;
import psetest.cucumber.demo.utils.SeleniumUtil;

public class BookFlightPage extends BasePage {

	public BookFlightPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = LAST_NAME_TEXTBOX)
	private WebElement txtLastName;

	@FindBy(name = FIRST_NAME_TEXTBOX)
	private WebElement txtFirstName;

	@FindBy(name = MEAL_DROPDOWN)
	private WebElement ddlMeal;

	@FindBy(name = CARD_TYPE_DROPDOWN)
	private WebElement ddlCardType;

	@FindBy(name = CREDIT_CARD_NUMBER_TEXTBOX)
	private WebElement txtCreditCardNumber;

	@FindBy(name = EXPIRATION_MONTH_DROPDOWN)
	private WebElement ddlExpirationMonth;

	@FindBy(name = EXPIRATION_YEAR_DROPDOWN)
	private WebElement ddlExpirationYear;

	@FindBy(name = CREDIT_CARD_FIRST_NAME_TEXTBOX)
	private WebElement txtCreditCardFirstName;

	@FindBy(name = CREDIT_CARD_LAST_NAME_TEXTBOX)
	private WebElement txtCreditCardLastName;

	@FindBy(name = CREDIT_CARD_MIDDLE_NAME_TEXTBOX)
	private WebElement txtCreditCardMiddleName;

	@FindBy(name = SECURE_PURCHASE_BUTTON)
	private WebElement btnSecurePurchase;

	public BookFlightPage enterFirstName(final String firstName) {
		SeleniumUtil.enterDataToTextBox(txtFirstName, firstName);
		return this;
	}

	public BookFlightPage enterLastName(final String lastName) {
		SeleniumUtil.enterDataToTextBox(txtLastName, lastName);
		return this;
	}

	public BookFlightPage enterCreditCardNumber(final String cardNumber) {
		SeleniumUtil.enterDataToTextBox(txtCreditCardNumber, cardNumber);
		return this;
	}

	public BookFlightPage enterCreditCardFirstName(final String firstName) {
		SeleniumUtil.enterDataToTextBox(txtCreditCardFirstName, firstName);
		return this;
	}

	public BookFlightPage enterCreditCardMiddleName(final String middleName) {
		SeleniumUtil.enterDataToTextBox(txtCreditCardMiddleName, middleName);
		return this;
	}

	public BookFlightPage enterCreditCardLastName(final String lastName) {
		SeleniumUtil.enterDataToTextBox(txtCreditCardLastName, lastName);
		return this;
	}

	public BookFlightPage selectMeal(final String mealName) {
		SeleniumUtil.selectOptionFromList(ddlMeal, mealName);
		return this;
	}

	public BookFlightPage selectCardType(final String cardType) {
		SeleniumUtil.selectOptionFromList(ddlCardType, cardType);
		return this;
	}

	public BookFlightPage selectExpirationMonth(final String month) {
		SeleniumUtil.selectOptionFromList(ddlExpirationMonth, month);
		return this;
	}

	public BookFlightPage selectExpirationYear(final String year) {
		SeleniumUtil.selectOptionFromList(ddlExpirationYear, year);
		return this;
	}

	public BookFlightPage clickSecurePageButton() {
		SeleniumUtil.clickElement(btnSecurePurchase);
		return this;
	}
}
