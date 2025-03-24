package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 {

	// Declare the WebDriver object
	WebDriver driver;
	

	@BeforeClass
	public void beforeMethod() {
		driver = new FirefoxDriver();

		// Open browser
		driver.get("http://alchemy.hguy.co/crm");

	}

	@Test
	public void loginSite() {
		// Login to the page
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		// Verify by page title.
		String expectedHomepageTitle = "SuiteCRM";
		String actualTitle = driver.getTitle();
		if (actualTitle.equals(expectedHomepageTitle)) {
			System.out.println("Homepage title verification successful!");
		} else {
			System.out.println("Homepage title verification failed. Actual title: " + actualTitle);
		}

	}

	@AfterClass
	public void afterMethod() {
		// Close the browser
		driver.quit();
	}

}
