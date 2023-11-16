package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPage {

	public WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		this.driver =driver;
		
	}
	
	public By loginLink = By.cssSelector("li>a[href='#popup_login']");
	
	public By contactsLink = By.linkText("CONTACTS");
	
	public By singleAuthorLink = By.cssSelector("a[href='/margaret-robins/']");
	
	public By lifeInTheGardenBookLink = By.cssSelector("a[href='life-in-the-garden']");
	
	public By shopLink = By.linkText("BOOKS");
	
	public By eventsLink = By.linkText("EVENTS");
	
	public By blogLink = By.linkText("BLOG");
	public By classicBlogLink = By.xpath("(//a[contains(@href, 'classic')])[1]");
	
	public By aboutLink = By.linkText("ABOUT");
	
	public By signUpButton = By.cssSelector("input[value='Sign up']");

	public By searchIcon = By.xpath("(//button[contains(@class, 'icon-search')])[1]");
	
	public By searchInput =By.xpath("(//input[contains(@class,'search_field')])[1]");
	
	public By userLink =By.cssSelector("span[class='user_name']");
	
	public By userSettingsLink = By.xpath("//a[contains(@class, 'icon-cog')]");
	
	public By facebookIcon = By.xpath("(//a[contains(@href, 'facebook')])[1]");
	public By twitterIcon = By.xpath("(//a[contains(@href, 'twitter')])[1]");
	public By instagramIcon = By.xpath("(//a[contains(@href, 'instagram')])[1]");
	
	
	
	public void navigateTo(By locator) {
		
		driver.findElement(locator).click();
		
	}
	
	public WebElement returnWebElement (By locator) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return driver.findElement(locator);
	
	}
	
	public void search(String text) {
		driver.findElement(searchIcon).click();
		driver.findElement(searchInput).clear();
		driver.findElement(searchInput).sendKeys(text);
		driver.findElement(searchIcon).click();
	}

}
