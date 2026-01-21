package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WikiPage {
    
    WebDriver driver;

    // 1. Locators (The addresses)
    private By searchBox = By.cssSelector("#searchInput");
    private By searchBtn = By.cssSelector("#search-form > fieldset > button"); 
    private By heading   = By.className("mw-page-title-main");

    // 2. Constructor (The "Handshake")
    public WikiPage(WebDriver driver) {
        this.driver = driver;
    }

    // 3. Actions
    public void enterSearchTerm(String keyword) {
    	driver.findElement(searchBox).sendKeys(keyword);
    }

    public void clickSearch() {
        driver.findElement(searchBtn).sendKeys(Keys.RETURN);
    }
    
    public String getHeadingText() {
    	WebElement headingMessage = driver.findElement(heading);
    	String actualTextOnScreen = headingMessage.getText();
        return actualTextOnScreen;
    }
}