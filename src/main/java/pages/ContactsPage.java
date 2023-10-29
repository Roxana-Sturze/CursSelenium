package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactsPage {
	
	public WebDriver driver;
	
	public ContactsPage(WebDriver driver) {
		
		this.driver =driver;
		
	}
	
	public By nameField = By.cssSelector("input[name='your-name']");
	public By emailField = By.cssSelector("input[name='your-email']");
	public By subjectField = By.cssSelector("input[name='your-s']");
	public By messageField = By.cssSelector("textarea[name='your-message']");
	public By sendMessageButton = By.cssSelector("input[value='Send Message']");
	public By confirmationMessage = By.cssSelector("div[class='wpcf7-response-output']");
	
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
		//System.out.println(driver.findElement(confirmationMessage).getText());
		return driver.findElement(confirmationMessage).getText();
		
		
		
	}

}
