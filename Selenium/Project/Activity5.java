package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {

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
		// Get the color of navigationmenu
		WebElement menuItem = driver.findElement(By.className("container-fluid"));
		String textColor = menuItem.getCssValue("color");
		System.out.println("Menu Item Text Color: " + textColor);

	}

	@AfterClass
	public void afterMethod() {
		// Close the browser
		driver.quit();
	}

}
