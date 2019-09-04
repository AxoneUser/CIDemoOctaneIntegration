package psetest.cucumber.demo.pages;

import static psetest.cucumber.demo.page.constants.LoginPageConstants.AIRLINE_DROPDOWN;
import static psetest.cucumber.demo.page.constants.LoginPageConstants.CONTINUE_BUTTON;
import static psetest.cucumber.demo.page.constants.LoginPageConstants.GET_STARTED_BUTTON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPagePSS {
	protected WebDriver driver;

	public LoginPagePSS(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = CONTINUE_BUTTON)
	private WebElement btnContinue;

	@FindBy(id = AIRLINE_DROPDOWN)
	private WebElement ddlSelectAirline;

	@FindBy(id = GET_STARTED_BUTTON)
	private WebElement btnGetStarted;

	public LoginPagePSS clickLoginButton() {
		btnContinue.click();
		return this;
	}

	public LoginPagePSS clickGetStarted() {
		btnGetStarted.click();
		return this;
	}

	public LoginPagePSS SelectAirline(String airline) {
		Select select = new Select(ddlSelectAirline);
		select.selectByValue(airline);
		return this;
	}

}
