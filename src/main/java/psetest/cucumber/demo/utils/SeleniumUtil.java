package psetest.cucumber.demo.utils;

import java.io.File;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public final class SeleniumUtil {

	private static final Logger LOG = LogManager.getLogger(SeleniumUtil.class);

	/**
	 * takeFullScreenShot - this method takes the full page screenshots and saves
	 * under "screenshots" folder under the current directory of test.
	 *
	 * 
	 * @param fileName is the name of the screenshot file
	 **/
	public static void takeFullScreenShot(final WebDriver driver, final ExtentTest test) {
		Date d = new Date();
		String fileName = d.toString().replace(" ", "_").replace(":", "_");
		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\screenshots\\" + fileName + ".png";

		try {
			Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
					.takeScreenshot(driver);
			ImageIO.write(screenshot.getImage(), "PNG", new File(filePath));
		} catch (Exception e) {
			LOG.error("Test failed due to IOException");
			LOG.error("IOException " + e.getMessage());
		}
		test.log(LogStatus.INFO, test.addScreenCapture(filePath));
	}

	/**
	 * Method to get the attribute value from web element.
	 * 
	 * @param element is the webelement
	 * @param param   is the html attribute
	 * @return {@link String}
	 * @author M1030082
	 */
	public static String getAttributeValue(final WebElement element,final String param) {
		return element.getAttribute(param);
	}

	/**
	 * Method to select the option from the list.
	 * 
	 * @param selectElement  is the select webelement
	 * @param optionToSelect is the option to select
	 * @author M1030082
	 */
	public static void selectOptionFromList(final WebElement selectElement, final String optionToSelect) {
		Select select = new Select(selectElement);
		select.getOptions().stream().filter(item -> item.getText().equals(optionToSelect))
				.forEach(element -> element.click());

		/*
		 * select.getOptions().stream().map(WebElement::getText).forEach(x->{
		 * if(x.equalsIgnoreCase("abc")) {
		 * 
		 * } });
		 */

	}

	/**
	 * Method to enter the data in a textbox.
	 * 
	 * @param element      is the webelement
	 * @param valueToEnter is the value to enter in the textbox
	 * 
	 * @author M1030082
	 */
	public static void enterDataToTextBox(final WebElement element, final String valueToEnter) {
		element.clear();
		element.sendKeys(valueToEnter);
	}

	/**
	 * Method to click the webelement on the UI.
	 * 
	 * @param element is the webelement
	 * @author M1030082
	 */
	public static void clickElement(final WebElement element) {
		if (element.isEnabled()) {
			element.click();
		}
	}

	/**
	 * Method to wait for a specific time on the UI.
	 * 
	 * @param miliSeconds is the milliseconds you want to wait
	 * @author M1030082
	 */
	public static void waitForSpecificTime(final long milliSeconds) {
		try {
			Thread.sleep(milliSeconds);
		} catch (InterruptedException e) {
			LOG.error("Getting the exception :" + e);
		}
	}
}
