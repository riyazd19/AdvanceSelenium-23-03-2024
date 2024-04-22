package stepdefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RandomGoogleAndOtherSites {
	WebDriver driver;

	@Given("user fires up the laptop and browser is open")
	public void user_fires_up_the_laptop_and_browser_is_open() {
		WebDriverManager.chromedriver().setup();		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		// Get the handle of the main window
        String mainWindowHandle = driver.getWindowHandle();

        // Get all window handles
        Set<String> allWindowHandles = driver.getWindowHandles();

        // If there are more than one window, close the extra ones
        if (allWindowHandles.size() > 1) {
            for (String handle : allWindowHandles) {
                if (!handle.equals(mainWindowHandle)) {
                    driver.switchTo().window(handle);
                    driver.close(); // Close extra window
                }
            }
            // Switch back to the main window
            driver.switchTo().window(mainWindowHandle);
        }

	}

	@When("user enters {string} as url")
	public void user_enters_as_url(String string) {
		String url= string;
		String mainWindowHandle = driver.getWindowHandle();

        // Get all window handles
        Set<String> allWindowHandles = driver.getWindowHandles();

        // If there are more than one window, close the extra ones
        if (allWindowHandles.size() > 1) {
            for (String handle : allWindowHandles) {
                if (!handle.equals(mainWindowHandle)) {
                    driver.switchTo().window(handle);
                    driver.close(); // Close extra window
                }
            }
            // Switch back to the main window
            driver.switchTo().window(mainWindowHandle);
        }
		driver.get(url);
		System.out.printf(driver.getCurrentUrl(),driver.getTitle());

	}

	@Then("user is navigated to google page user needs to check the title of page to verify")
	public void user_is_navigated_to_google_page_user_needs_to_check_the_title_of_page_to_verify() {

	}

	@Given("user enters facebook keyword in google page")
	public void user_enters_facebook_keyword_in_google_page() {

	}

	@Then("facebook login page is displayed and user is have to verify the page is correct")
	public void facebook_login_page_is_displayed_and_user_is_have_to_verify_the_page_is_correct() {

	}

	@Then("user clicks on signIn option and verify the page")
	public void user_clicks_on_sign_in_option_and_verify_the_page() {

	}

	@Given("user enters the sausedemo site in browser")
	public void user_enters_the_sausedemo_site_in_browser() {

	}

	@Then("user verifies sausedemo  page is dispalyed")
	public void user_verifies_sausedemo_page_is_dispalyed() {

	}

	@When("enters {string} and {string} in respective fields")
	public void enters_and_in_respective_fields(String string, String string2) {

	}

}
