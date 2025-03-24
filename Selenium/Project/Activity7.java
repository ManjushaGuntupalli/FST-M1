package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity7 {

	// Declare the WebDriver object
	WebDriver driver;
	WebDriverWait wait;
	Actions actions;

	@BeforeClass
	public void beforeMethod() {
		driver = new FirefoxDriver();

		// Open browser
		driver.get("https://alchemy.hguy.co/crm/");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		actions = new Actions(driver);

	}

	@Test
	public void additionalInfo() throws InterruptedException {
		// Login to the page
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		// Navigate to salesmenu

		WebElement sales = driver.findElement(By.id("grouptab_0"));
		actions.moveToElement(sales).perform();

		driver.findElement(By.linkText("Leads")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='MassUpdate']/descendant::span[@title='Additional Details'][1]"))).click();
		
		String popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"phone\"]"))).getText();
		System.out.println("phone number : " +popup);
		
	}

	@AfterClass
	public void afterMethod() {
		// Close the browser
		driver.quit();
	}

}
