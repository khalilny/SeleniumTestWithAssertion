package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestJobSearch {

	// driver declaration outside of setup method because we want to use that
	// all over the class
	WebDriver driver;

	@BeforeClass
	public void setup() {
		// Initiate driver
		driver = new FirefoxDriver();
		// maximize window
		driver.manage().window().maximize();

		// open google page
		driver.get("http://google.com/");

	}

	@Test
	public void testPageTitle() {
		String title = driver.getTitle();
		// inspect google search box and collect WebElement
		WebElement search = driver.findElement(By.className("gsfi"));
		// Write QA Jobs into google search box as send keys
		search.sendKeys("QA Jobs");
		// submit send keys
		search.submit();
		// title find out from head when we want to collect webElement
		Assert.assertEquals(title, "Google");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();

	}
	// example in a class everything included driver set something
	// assertion its google side verification

}
