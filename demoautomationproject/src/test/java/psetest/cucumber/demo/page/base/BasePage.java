package psetest.cucumber.demo.page.base;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * BasePage handles all the commonalities required to deal a Web Page.
 * 
 * All page classes should extend the BasePage
 * 
 * @author M1030082
 */
public class BasePage {

	/** Log4j Logger. */
	private static final Logger log = LogManager.getLogger(BasePage.class);

	/** TIMEOUT. */
	private static final int TIMEOUT = 5;

	/** POLLING FREQUENCY. */
	private static final int POLLING = 100;

	/** WebDriver reference. */
	protected WebDriver driver;

	/** WebDriver Wait **/
	protected WebDriverWait wait;

	/**
	 * Constructor to set the web driver
	 * 
	 * @param driver is teh reference to the WebDriver
	 */
	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, TIMEOUT, POLLING);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
	}

	public void navigateToUrl(String urlToNavigate) {
		log.info("Navigating to the URL :" + urlToNavigate);
		this.driver.get(urlToNavigate);
	}

	public void closeApplication() {
		log.info("Closing the application");
		this.driver.close();
	}

}
