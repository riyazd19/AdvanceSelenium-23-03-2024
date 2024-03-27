package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
	    
	    throw new io.cucumber.java.PendingException();
	}
	@Then("user gives valid credentials")
	public void user_gives_valid_credentials() {
	
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("user is navigated to home page of application")
	public void user_is_navigated_to_home_page_of_application() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
