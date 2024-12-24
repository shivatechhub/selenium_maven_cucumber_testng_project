package app.seleniumautomation.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormAuthenticationSteps {

    // Assuming you are using WebDriver for browser automation
    WebDriver driver = null;

    // Given I navigate to the <url>
    //(.*) - test data
    //^ is the starting point
    //$ is the ending point
    @Given("^I navigate to the (.*)$")
    public void i_navigate_to_the_url(String website) {
        // Initialize WebDriver and navigate to the URL
        driver = new ChromeDriver();  // Or any driver you're using
        driver.get(website);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    // When I click on form authentication and enter <username> and <password>
    @When("^I click on form authentication and enter (.*) and (.*)$")
    public void i_click_on_form_authentication_and_enter_credentials(String username, String password) {
        // Locate and click the form authentication link (you might need to adjust the locator)
        driver.findElement(By.linkText("Form Authentication")).click();
        // Enter the username and password in the login form (adjust locators as needed)
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();  // Adjust if needed
    }

    // Then validate login successful
    @Then("^validate login successful$")
    public void validate_login_successful() {
        // Validate if login was successful by checking the presence of an element that is visible after login
        // For example, check if the logout button is visible after successful login
        boolean loginSuccessful = driver.findElement(By.linkText("Logout")).isDisplayed();
        // Assert login success
        assertTrue("Login was successful", loginSuccessful);
        // Close the browser after the test
        driver.quit();
    }
}
