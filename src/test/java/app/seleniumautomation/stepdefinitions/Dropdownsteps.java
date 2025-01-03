package app.seleniumautomation.stepdefinitions;
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
	public WebDriver driver = null;
  
	@Given("^I navigate to the dropdown functionality in the (.*)$")
	public void navigate_to_dropdown(String website) {
		driver = new ChromeDriver();
		driver.get(website);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@When("^I click on dropdown and I select a (.*) from the dropdown$")
	public void i_select_a_vale_from_the_dropdown(String value) throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Dropdown']")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select selectdropdownvalue = new Select(dropdown);
		selectdropdownvalue.selectByValue(value);
		System.out.println(selectdropdownvalue.getFirstSelectedOption().getText());
		Thread.sleep(5000);
	}
	@Then("^I validate if the selected value is populated$")
	public void validate_if_the_selected_value_is_populated() {
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
		dropdown.click();
		Select selectdropdownvalue = new Select(dropdown);
		System.out.println(selectdropdownvalue.getFirstSelectedOption().getText());
		driver.quit();
	}
}

