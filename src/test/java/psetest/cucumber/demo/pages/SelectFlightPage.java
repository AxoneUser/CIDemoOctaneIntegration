package psetest.cucumber.demo.pages;

import static psetest.cucumber.demo.page.constants.SelectFlightPageConstants.CONTINUE_BUTTON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import psetest.cucumber.demo.page.base.BasePage;

public class SelectFlightPage extends BasePage {

	public SelectFlightPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = CONTINUE_BUTTON)
	private WebElement btnContinue;

	public SelectFlightPage clickContinueButton() {
		if (btnContinue.isEnabled()) {
			btnContinue.click();
		}
		return this;
	}
}