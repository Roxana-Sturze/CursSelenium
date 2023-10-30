package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.SeleniumWrappers;

public class ContactsPage extends SeleniumWrappers{
	
	//public WebDriver driver;
	
	public ContactsPage(WebDriver driver) {
		
		super(driver);
		
	}
	
	public By nameField = By.cssSelector("input[name='your-name']");
	public By emailField = By.cssSelector("input[name='your-email']");
	public By subjectField = By.cssSelector("input[name='your-s']");
	public By messageField = By.cssSelector("textarea[name='your-message']");
	public By sendMessageButton = By.cssSelector("input[value='Send Message']");
	public By confirmationMessage = By.cssSelector("div[class='wpcf7-response-output']");
	public By zoomInButton = By.cssSelector("button[title='Zoom in']");
	public By zoomOutButton = By.cssSelector("button[title='Zoom out']");
	public By iframe = By.tagName("iframe");
	
	
	public void sendMessage(String name, String email, String subject, String message) {
		driver.findElement(nameField).sendKeys(name);
		driver.findElement(emailField).sendKeys(email);
		driver.findElement(subjectField).sendKeys(subject);
		driver.findElement(messageField).sendKeys(message);
		driver.findElement(sendMessageButton).click();
	}
	
	public String confirmationMessage() {
		
		WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(confirmationMessage));  

		return driver.findElement(confirmationMessage).getText();
		
	}
	
	public void zoomMap(By locator) {
		driver.switchTo().frame(returnWebElement(iframe));
		click(locator);
	}
	
	

}
