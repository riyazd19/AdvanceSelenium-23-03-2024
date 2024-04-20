package stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v121.browser.Browser;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BackGroundKeyWordPractice {
	WebDriver driver;
	@Before
	@Given("User opens a browser in chrome")
	public void user_opens_a_browser_in_chrome() {
		System.out.println("in this method only browser is initialted and window is maximized");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Then("user enters sausedemo site")
	public void user_enters_sausedemo_site() {
		System.out.println("in this site url is populated");
		driver.get("https://www.saucedemo.com/");
		
	}

	@Then("user populates {string} and {string}")
	public void user_populates_and(String string, String string2) throws InterruptedException {
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
