package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumWrappers extends BaseTest{
	
	public SeleniumWrappers (WebDriver driver) {
		this.driver = driver;
	}

	
	public WebElement returnWebElement (By locator) {
		return driver.findElement(locator);
	}

	
}
