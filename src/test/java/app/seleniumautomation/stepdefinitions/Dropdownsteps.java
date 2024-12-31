package app.seleniumautomation.stepdefinitions;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dropdownsteps {
	 WebDriver driver = null;

	    // Given I navigate to the <url>
	    //(.*) - test data
	    //^ is the starting point
	    //$ is the ending point
	    @Given("^I navigate to only testing (.*)$")
	    public void i_navigate_to_only_testing_url(String website) {
	        // Initialize WebDriver and navigate to the URL
	        driver = new ChromeDriver();  // Or any driver you're using
	        driver.get(website);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	    }

	    // When I click on form authentication and enter <username> and <password>
	    @When("^I select a (.*) from the dropdown$")
	    public void i_select_a_vale_from_the_dropdown(String value) throws InterruptedException {
	        WebElement dropdown=driver.findElement(By.xpath("(//select)"));
		      //WebElement dropdown= driver.findElement(By.xpath("//select[@id='Carlist']"));
		      Select selectdropdownvalue=new Select(dropdown);
		      selectdropdownvalue.selectByValue("Singapore");
		      System.out.println(selectdropdownvalue.getFirstSelectedOption().getText());
		      Thread.sleep(5000);

	        // Locate and click the form authentication link (you might need to adjust the locator)
	    }

	    // Then validate login successful
	    @Then("^I validate if the selected value is populated$")
	    public void validate_if_the_selected_value_is_populated() {
	        // Validate if login was successful by checking the presence of an element that is visible after login
	        // For example, check if the logout button is visible after successful login
	    	WebElement dropdown=driver.findElement(By.xpath("(//select)")); 
	    	Select selectdropdownvalue=new Select(dropdown);
	    	System.out.println(selectdropdownvalue.getFirstSelectedOption().getText());
	        driver.quit();
	    }
	

}
