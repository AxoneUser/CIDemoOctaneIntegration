package automation.gitlabmaster;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {

	public WebDriver driver;
	public WebDriverWait wait;

	private static final String URL = "http://uitest.automationtester.uk/bootstrap-dual-list-box-demo.html";

	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test()
	public void testSortingDuesColumn() throws InterruptedException, IOException {
		
		driver.findElement(By.name("SearchDualList")).sendKeys("bootstrap");
        WebElement element = driver.findElement(By.xpath("//div[@class='well text-right']//ul[@class='list-group']"));
        element.click();
        driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm move-right']")).click();
        //verify the right hand side list box contains the bootstrap text
        List<WebElement> listBox = driver.findElements(By.xpath("//div[@class='well']//ul[@class='list-group']/li"));
        System.out.println("Size of elements: "+listBox.size());
        
        boolean isBootStrapPresent = false;
        for (WebElement webElement : listBox) {
            if (webElement.getText().equals("bootstrap-duallist")) {
                System.out.println("Bootstrap is present");
                isBootStrapPresent = true;
            }
        }
        Thread.sleep(5000);
        
        Assert.assertTrue(isBootStrapPresent);
		}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
