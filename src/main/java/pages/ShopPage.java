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
	
	public By sliderInitialPosition =By.cssSelector("span[style='left: 0%;']");
	public By sliderFinalPosition =By.cssSelector("span[style='left: 100%;']");
	
	public By cookingWithLoveBookLink = By.xpath("(//a[contains(@href, 'cooking')])[6]");
	
	public By cookbooksLink = By.xpath("//a[contains(@href, 'cookbooks')]");
	public By saleIcon = By.xpath("//span[contains(@class, 'onsale')]");
	
	public By genericBook = By.xpath("//h2[contains(@class, 'product__title')]/a[contains(@href, 'shop')]");
	
	
	public int listLength(By locator) {
		
		return driver.findElements(locator).size();
	}
	
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
	
	public void checkSale() {
		
	
	}
}
