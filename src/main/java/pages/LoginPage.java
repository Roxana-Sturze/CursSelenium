package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver =driver;
		
	}
	
	//locatori sau webElemente
	
	public By usernameField = By.id("log");
	public By passwordField = By.id("password");
	public By submitButton = By.className("submit_button");
	public By successLoginMsg = By.cssSelector("div[class*='sc_infobox_style_success']");
	public By errorLoginMsg = By.cssSelector("div[class*='sc_infobox_style_error']");
	public By rememberMeCheckbox = By.cssSelector("li input[type='checkbox']");
	
	public By closeLoginPopup = By.cssSelector("a[class='popup_close']");
	public By logoutButton = By.linkText("Logout");
	
	
	//metode specifice paginii sau functionalitatii pe care o reprezinta
	
	public void loginInApp(String user, String pass) {
		driver.findElement(usernameField).clear();
		driver.findElement(passwordField).clear();
		
		driver.findElement(usernameField).sendKeys(user);		
		driver.findElement(passwordField).sendKeys(pass);
		driver.findElement(submitButton).click();
	}
	
	public boolean checkLoginMsgIsDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
		
	}
}
