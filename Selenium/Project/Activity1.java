package activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {

	// Declare the WebDriver object
	WebDriver driver;

	@BeforeClass
	public void beforeMethod() {
		driver = new FirefoxDriver();

		// Open browser
		driver.get("http://alchemy.hguy.co/crm");

	}

	@Test
	public void verifyTitle() {
		// get the title of the page
		String title = driver.getTitle();
		System.out.println("Title is: " + title);
		Assert.assertEquals(title, "SuiteCRM");
	}

	@AfterClass
	public void afterMethod() {
		// Close the browser
		driver.quit();
	}

}
