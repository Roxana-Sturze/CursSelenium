package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWrappers extends BaseTest{
	
	public SeleniumWrappers (WebDriver driver) {
		
		this.driver = driver;
	}

	public void click(By locator) {
		
		returnWebElement(locator).click();
		
	}
	
	public WebElement returnWebElement (By locator) {
		
		waitForElementToBeVisible(locator);
		return driver.findElement(locator);
	
	}

	
	public void waitForElementToBeVisible(By locator) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
}
