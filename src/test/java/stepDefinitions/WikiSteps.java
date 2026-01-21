package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WikiPage;

public class WikiSteps {
	WebDriver driver;
	WikiPage wikiPage;
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		wikiPage = new WikiPage(driver);
	}
	
	@Given("I am on Wikipedia homepage")
	public void i_am_on_wikipedia_homepage() {
		driver.get("https://www.wikipedia.org/");
	}
	
	@When("I search for {string}")
	public void i_search_for(String keyword) {
		wikiPage.enterSearchTerm(keyword);
		wikiPage.clickSearch();
	}
	
	
	@Then("I should see a heading that says {string}")
	public void i_should_see_a_heading_that_says(String expectedMsg) {
		String actualText = wikiPage.getHeadingText();
		Assert.assertEquals(actualText, expectedMsg);
	}
	
	@After
	public void tearDown() {
		if(driver != null) {
			driver.quit();
		}
	}
}
