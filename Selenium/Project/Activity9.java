package activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity9 {

	// Declare the WebDriver object
	WebDriver driver;
	WebDriverWait wait;
	Actions actions;

	@BeforeClass
	public void beforeMethod() {
		driver = new FirefoxDriver();

		// Open browser
		driver.get("http://alchemy.hguy.co/crm");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		actions = new Actions(driver);

	}

	@Test
	public void additionalInfo() throws TimeoutException {
		// Login to the page
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		// Navigate to salesmenu

		WebElement sales = driver.findElement(By.id("grouptab_0"));
		actions.moveToElement(sales).perform();

		driver.findElement(By.linkText("Leads")).click();

		// Locate the "Name" column cells
		List<WebElement> nameCells = wait.until(ExpectedConditions
				.presenceOfAllElementsLocatedBy(By.xpath("//*[@id=\"MassUpdate\"]/descendant::td[@type='name']")));

		// Print the first 10 names
		System.out.println("First " + 10 + " Names:");
		for (int i = 0; i < 10; i++) {
			System.out.println(nameCells.get(i).getText());
		}

		// Locate the "User" column cells. Verify the column number.
		List<WebElement> userCells = wait.until(ExpectedConditions
				.presenceOfAllElementsLocatedBy(By.xpath("//*[@id=\"MassUpdate\"]/descendant::td[@type='relate']")));

		// Print the first 10 user names
		System.out.println("First " + 10 + " User Names:");
		for (int i = 0; i < 10; i++) {
			System.out.println(userCells.get(i).getText());
		}

	}

	@AfterClass
	public void afterMethod() {
		// Close the browser
		driver.quit();
	}

}
