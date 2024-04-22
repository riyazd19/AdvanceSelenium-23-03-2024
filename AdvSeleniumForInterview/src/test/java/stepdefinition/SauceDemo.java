package stepdefinition;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemo {
	WebDriver driver;

	@Given("User opens up the browser")
	public void user_opens_up_the_browser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String mainWindowHandle = driver.getWindowHandle();

		Set<String> allWindowHandles = driver.getWindowHandles();

		if (allWindowHandles.size() > 1) {
			for (String handle : allWindowHandles) {
				if (!handle.equals(mainWindowHandle)) {
					driver.switchTo().window(handle);
					driver.close(); // Close extra window
				}
			}

			driver.switchTo().window(mainWindowHandle);
		}

	}

	@Then("user enters saucedemo site")
	public void user_enters_saucedemo_site() {
		String mainWindowHandle = driver.getWindowHandle();

		Set<String> allWindowHandles = driver.getWindowHandles();

		if (allWindowHandles.size() > 1) {
			for (String handle : allWindowHandles) {
				if (!handle.equals(mainWindowHandle)) {
					driver.switchTo().window(handle);
					driver.close();
				}
			}

			driver.switchTo().window(mainWindowHandle);
		}
		driver.get("https://www.saucedemo.com/");

	}

	@Then("I enter {string} and {string}")
	public void i_enter_and(String string, String string2) throws InterruptedException {
		String s1 = string, s2 = string2;
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys(s1);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(s2);
		String x = driver.getTitle();
		if (x.equals("Swag Labs")) {
			System.out.println("This is page title is correct");

		} else {
			System.out.println("wrong page titke");
		}

		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
		System.out.println(driver.getTitle());
		System.out.println("getting links from here");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement value : links) {
			System.out.println(value);

		}

	}

}
