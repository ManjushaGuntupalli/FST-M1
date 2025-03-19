package stepDefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass{

	@Given("the user is on the login page")
	public void openPage() {
		
		driver.get("https://training-support.net/webelements/login-form");
		Assertions.assertEquals("Selenium: Login Form", driver.getTitle());
		
	}
	
	@When("the user enters username and password")
	public void enterCreds() {
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		
		//to get the entered values
		String enteredUN = driver.findElement(By.id("username")).getAttribute("value");
		System.out.println("UserName field has " + enteredUN);
	}
	
	@When("the user enters {string} and {string}")
	public void enterCredsWithParam(String username, String password) {
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
		//to get the entered values
		String enteredUN = driver.findElement(By.id("username")).getAttribute("value");
		assertEquals("admin", enteredUN);
	}
	
	
	@And("clicks the submit button")

	public void clickSubmit() {
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
	}
	
	@Then("get the confirmation message and verify it")
	public void verifyMessage() {
		
		String msg = driver.findElement(By.xpath("//h2[contains(text(),'Admin')]")).getText();
		Assertions.assertEquals("Welcome Back, Admin!", msg);
	}
	
	@Then("get the confirmation message and verify message as {string}")
	public void verifyMessagewithParam(String expectedMsg) {
		
		String msg = "NOT FOUND";
		if (expectedMsg.contains("Invalid")){
			msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2#subheading"))).getText();
		}
		else {
			msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2.text-center"))).getText();
		}
		Assertions.assertEquals(expectedMsg, msg);
	}
	
	
	
}



//wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h2[contains(text(),'Admin')]"), "Admin"));

