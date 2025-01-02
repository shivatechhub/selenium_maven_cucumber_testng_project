package app.seleniumautomation.stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


	public class Checkboxsteps {
		
		    // Assuming you are using WebDriver for browser automation
		    WebDriver driver = null;

		    // Given I navigate to the <url>
		    //(.*) - test data
		    //^ is the starting point
		    //$ is the ending point
		    @Given("^I navigate to test checkbox (.*)$")
		    public void i_navigate_to_test_checkbox_url(String website) {
		        // Initialize WebDriver and navigate to the URL
		        driver = new ChromeDriver();  // Or any driver you're using
		        driver.get(website);
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        driver.manage().window().maximize();
		    }

		    // when I selected the list of checkboxs 
		    @When("^I selected the list of checkboxs$")
		    public void i_selected_the_list_of_checkboxs() {
		    	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		          WebElement checkbox1= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));  
		          WebElement checkbox2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		          WebElement checkbox4=driver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));
		          WebElement checkbox5=driver.findElement(By.xpath("(//input[@type='checkbox'])[5]"));
		        wait.until(ExpectedConditions.elementToBeClickable(checkbox1)).click();
		        wait.until(ExpectedConditions.elementToBeClickable(checkbox2)).click();
		        wait.until(ExpectedConditions.elementToBeClickable(checkbox4)).click();
		        wait.until(ExpectedConditions.elementToBeClickable(checkbox5)).click();

		    	System.out.println("checkbox1 is selected");
		        System.out.println("checkbox2 is selected");
		        System.out.println("checkbox4 is selected");
		        System.out.println("checkbox5 is selected");

		    }

		    // Then uncheck the selected checkboxs and validate the message

		    @Then("^uncheck the selected checkboxs and validate the message$")
		    public void uncheck_the_selected_checkboxs_and_validate_the_message() {
		    	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		    	 WebElement checkbox1= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));  
		          WebElement checkbox2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		          WebElement checkbox4=driver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));
		          WebElement checkbox5=driver.findElement(By.xpath("(//input[@type='checkbox'])[5]"));
		        wait.until(ExpectedConditions.elementToBeClickable(checkbox1)).click();
		        wait.until(ExpectedConditions.elementToBeClickable(checkbox2)).click();
		        wait.until(ExpectedConditions.elementToBeClickable(checkbox4)).click();
		        wait.until(ExpectedConditions.elementToBeClickable(checkbox5)).click();
		        
		        System.out.println("checkbox1 is not selected");
		        System.out.println("checkbox2 is not selected");
		        System.out.println("checkbox4 is not selected");
		        System.out.println("checkbox5 is not selected");


		    }
		}





