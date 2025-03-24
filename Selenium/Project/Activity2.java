package activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	// Declare the WebDriver object
	WebDriver driver;

	@BeforeClass
	public void beforeMethod() {
		driver = new FirefoxDriver();

		// Open browser
		driver.get("http://alchemy.hguy.co/crm");

	}

	@Test
	public void headerUrl() {
		// get the URL of the page
		String url = driver.getCurrentUrl();
		System.out.println("Current URL is : " + url);

	}

	@AfterClass
	public void afterMethod() {
		// Close the browser
		driver.quit();
	}

}
