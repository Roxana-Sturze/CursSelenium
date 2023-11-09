package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class JavaScriptExecutor extends BaseTest{
	
	@Test
	public void example1() {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		
//		WebElement searchIcon = app.returnWebElement(app.menu.searchIcon);
//		WebElement searchInput = app.returnWebElement(app.menu.searchInput);
		WebElement searchIcon = driver.findElement(app.menu.searchIcon);
		WebElement searchInput = driver.findElement(app.menu.searchInput);
		
		//alternativa pentru click()
		
		jse.executeScript("arguments[0].click()", searchIcon);
		
		//alternativa pentru sendKeys()
		
		jse.executeScript("arguments[0].value='cooking'", searchInput);
		
		
		jse.executeScript("arguments[0].click()", searchIcon);
	}

}
