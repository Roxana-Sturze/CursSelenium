package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.SeleniumWrappers;

public class ShopPage extends SeleniumWrappers{

	public ShopPage(WebDriver driver) {
		super(driver);
		
	}
	
	public By orderDropdown = By.name("orderby");
	
	
	public void filterByValue(String value) {
		
		Select selectObj = new Select(returnWebElement(orderDropdown));
		selectObj.selectByValue(value);
	
	}
	
	public String getCurrentSelectedOption() {
		
		Select selectObj = new Select(returnWebElement(orderDropdown));
		return selectObj.getFirstSelectedOption().getText();
	}

	public void filterByVisibleText(String text) {
		
		Select selectObj = new Select(returnWebElement(orderDropdown));
		selectObj.selectByVisibleText(text);
	
	}
	
	public void filterByIndex(int index) {
		
		Select selectObj = new Select(returnWebElement(orderDropdown));
		selectObj.selectByIndex(index);
	
	}
}
