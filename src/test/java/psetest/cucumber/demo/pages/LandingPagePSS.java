package psetest.cucumber.demo.pages;

import static psetest.cucumber.demo.page.constants.LandingPageConstants.CONTINUE_BUTTON;
import static psetest.cucumber.demo.page.constants.LandingPageConstants.GOT_IT_CONTINUE_BUTTON;
import static psetest.cucumber.demo.page.constants.LandingPageConstants.REPORT_DELAYED_BAG_IMAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPagePSS {

	protected WebDriver driver;

	public LandingPagePSS(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = REPORT_DELAYED_BAG_IMAGE)
	private WebElement imgDelayedBag;

	@FindBy(id = CONTINUE_BUTTON)
	private WebElement btnContinue;

	@FindBy(xpath = GOT_IT_CONTINUE_BUTTON)
	private WebElement btnGotItContinue;

	public LandingPagePSS clickReportDelayedBagImage() {
		imgDelayedBag.click();
		return this;
	}

	public LandingPagePSS clickSubmit() {
		btnContinue.click();
		return this;
	}

	public LandingPagePSS clickGotItContinue() {
		btnGotItContinue.click();
		return this;
	}

}
