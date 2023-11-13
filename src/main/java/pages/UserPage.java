package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.SeleniumWrappers;

public class UserPage extends SeleniumWrappers{

	public UserPage(WebDriver driver) {
		super(driver);
	}
	
	public By addressLink = By.linkText("Addresses");
	public By addAddressButton = By.xpath("(//a[contains(@class, 'edit')])[2]");
	
	public By countryDropdown = By.xpath("//select[contains(@name, 'shipping_country')]");
	public By selectedCountry = By.xpath("(//span[contains(@class, 'select2')])[3]");
	
	public By proviceDropdown = By.xpath("//select[contains(@name, 'shipping_state')]");
	public By selectedProvince = By.xpath("(//span[contains(@class, 'select2')])[7]");
	
	
	
	public void filterByIndex(int index, By locator) {
		
		Select selectObj = new Select(returnWebElement(locator));
		selectObj.selectByIndex(index);
	
	}
	
	public void filterByValue(String value, By locator) {
		
		Select selectObj = new Select(returnWebElement(locator));
		selectObj.selectByValue(value);
	
	}
	
	public void filterByVisibleText(String text, By locator) {
		
		Select selectObj = new Select(returnWebElement(locator));
		selectObj.selectByVisibleText(text);
	
	}
	
}
