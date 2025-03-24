package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity6 {

	// Declare the WebDriver object
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void beforeMethod() {
		driver = new FirefoxDriver();

		// Open browser
		driver.get("http://alchemy.hguy.co/crm");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	@Test
	public void loginSite() {
		// Login to the page
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		// Get the color of navigationmenu
		// WebElement menu = driver.findElement(By.className("container-fluid"));
		// WebElement manu = driver.findElement(By.id("grouptab_3"));
		// Assert.assertEquals(manu, menu);
		// System.out.println("Activities tab is Present");
		try {
			WebElement activitiesTab = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("grouptab_3")));
			Assert.assertTrue(activitiesTab.isDisplayed());
			System.out.println("Activities tab is Present");
		} catch (org.openqa.selenium.TimeoutException e) {
			Assert.fail("Activities tab is not present within the timeout.");
		}
	}

	@AfterClass
	public void afterMethod() {
		// Close the browser
		driver.quit();
	}

}
