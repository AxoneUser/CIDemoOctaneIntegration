package psetest.cucumber.demo.pages;

import static psetest.cucumber.demo.page.constants.ReviewPageConstants.NOTHING_TO_DECLARE_BUTTON;
import static psetest.cucumber.demo.page.constants.ReviewPageConstants.REFERENCE_NUMBER_LABEL;
import static psetest.cucumber.demo.page.constants.ReviewPageConstants.SUBMIT_BUTTON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewPage {
	protected WebDriver driver;

	public ReviewPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = NOTHING_TO_DECLARE_BUTTON)
	private WebElement btnNothingToDeclare;

	@FindBy(id = SUBMIT_BUTTON)
	private WebElement btnSubmit;

	@FindBy(id = REFERENCE_NUMBER_LABEL)
	private WebElement lblReferenceNumber;

	public ReviewPage clickNothingToDeclareButton() {
		btnNothingToDeclare.click();
		return this;
	}

	public ReviewPage clickSubmitButton() {
		btnSubmit.click();
		return this;
	}

	public String getConfirmationLabel() {

		return lblReferenceNumber.getText();
	}
}
