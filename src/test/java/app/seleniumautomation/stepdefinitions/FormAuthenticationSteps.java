package app.seleniumautomation.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormAuthenticationSteps {
	public WebDriver driver;	
	@Given("^I navigate to the form authentication link in the (.*)$")
	public void navigate_to_form_authentication(String website) {
		driver = new ChromeDriver();
		driver.get(website);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@When("^I click on form authentication and enter (.*) and (.*)$")
	public void i_click_on_form_authentication_and_enter_credentials(String username, String password) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Form Authentication']")).click();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click(); 
	}
	@Then("^validate login successful$")
	public void validate_login_successful() {
		boolean loginSuccessful = driver.findElement(By.linkText("Logout")).isDisplayed();
		assertTrue("Login was successful", loginSuccessful);
		driver.quit();
	}
}
