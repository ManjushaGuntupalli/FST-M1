package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {

	// Declare the WebDriver object
	WebDriver driver;

	@BeforeClass
	public void beforeMethod() {
		driver = new FirefoxDriver();

		// Open browser
		driver.get("http://alchemy.hguy.co/crm");

	}

	@Test
	public void coyrightText() {
		// get the First Copyright Text of the page
		String firstCopyRightText = driver.findElement(By.id("admin_options")).getText();
		System.out.println("First Copyright Text is : " + firstCopyRightText);
	}

	@AfterClass
	public void afterMethod() {
		// Close the browser
		driver.quit();
	}

}
