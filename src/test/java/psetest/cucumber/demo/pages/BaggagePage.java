package psetest.cucumber.demo.pages;

import static psetest.cucumber.demo.page.constants.BaggagePageConstants.ADD_BAGGAGE_DESCRIPTION_BUTTON;
import static psetest.cucumber.demo.page.constants.BaggagePageConstants.ADD_DESCRIPTION_BUTTON;
import static psetest.cucumber.demo.page.constants.BaggagePageConstants.COLOR_IMAGE;
import static psetest.cucumber.demo.page.constants.BaggagePageConstants.CONTINUE_BAG_BUTTON;
import static psetest.cucumber.demo.page.constants.BaggagePageConstants.CONTINUE_BUTTON;
import static psetest.cucumber.demo.page.constants.BaggagePageConstants.LEATHER_IMAGE;
import static psetest.cucumber.demo.page.constants.BaggagePageConstants.LUGGAGE_BAGS_IMAGE;
import static psetest.cucumber.demo.page.constants.BaggagePageConstants.THANKS_BUTTON;
import static psetest.cucumber.demo.page.constants.BaggagePageConstants.UPRIGHT_IMAGE;
import static psetest.cucumber.demo.page.constants.BaggagePageConstants.ZIPPER_IMAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BaggagePage {
	protected WebDriver driver;

	public BaggagePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = CONTINUE_BUTTON)
	private WebElement btnContinue;

	@FindBy(id = THANKS_BUTTON)
	private WebElement btnThanks;

	@FindBy(id = ADD_DESCRIPTION_BUTTON)
	private WebElement btnAddDescription;

	@FindBy(id = LUGGAGE_BAGS_IMAGE)
	private WebElement imgLuggageBags;

	@FindBy(id = ZIPPER_IMAGE)
	private WebElement imgZipperBags;

	@FindBy(id = UPRIGHT_IMAGE)
	private WebElement imgUprightBags;

	@FindBy(id = COLOR_IMAGE)
	private WebElement imgColorGrey;

	@FindBy(id = LEATHER_IMAGE)
	private WebElement imgLeather;

	@FindBy(id = ADD_BAGGAGE_DESCRIPTION_BUTTON)
	private WebElement btnAddBaggageDescription;

	@FindBy(id = CONTINUE_BAG_BUTTON)
	private WebElement btnContinueBag;

	public BaggagePage clickContinueButton() {
		btnContinue.click();
		return this;
	}

	public BaggagePage clickThanksButton() {
		btnThanks.click();
		return this;
	}

	public BaggagePage clickAddDescription() {
		btnAddDescription.click();
		return this;
	}

	public BaggagePage clickLuggageBagsImage() {
		imgLuggageBags.click();
		return this;
	}

	public BaggagePage clickZipperBagsImage() {
		imgZipperBags.click();
		return this;
	}

	public BaggagePage clickUprightBagsImage() {
		imgUprightBags.click();
		return this;
	}

	public BaggagePage clickColorGreyImage() {
		imgColorGrey.click();
		return this;
	}

	public BaggagePage clickLeatherImage() {
		imgLeather.click();
		return this;
	}

	public BaggagePage clickAddBaggageDescriptionButton() {
		btnAddBaggageDescription.click();
		return this;
	}

	public BaggagePage clickContinueBagButton() {
		btnContinueBag.click();
		return this;
	}
}
