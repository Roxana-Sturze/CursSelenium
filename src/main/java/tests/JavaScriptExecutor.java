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
		
/*		//alternativa pentru click()
		
		jse.executeScript("arguments[0].click()", searchIcon);
		
		//alternativa pentru sendKeys()
		
		jse.executeScript("arguments[0].value='cooking'", searchInput);
		jse.executeScript("arguments[0].click()", searchIcon);
	
*/		
		
		//alternativa pentru click()
		jse.executeScript("document.getElementsByClassName('icon-search')[0].click()");
		//alternativa pentru sendKeys()
		jse.executeScript("document.getElementsByClassName('search_field')[0].value = 'cooking' ");
		jse.executeScript("document.getElementsByClassName('icon-search')[0].click()");
		
		//alternativa pentru getText()

		String bookTitle =jse.executeScript("return document.getElementsByClassName('post_title')[0].childNodes[0].innerText").toString();
		System.out.println(bookTitle);
		
		//alternativa pentru isDisplayed()
		String isDisplayed = jse.executeScript("return document.getElementsByClassName(\"post_title\")[0].checkVisibility()").toString();
		System.out.println(isDisplayed);
		Boolean.valueOf(isDisplayed);// daca vreau sa transform stringul in boolean
		
		//alternativa pt getCurrentURL()
		String currentURL = jse.executeScript("return document.URL").toString();	
		System.out.println(currentURL);
		
		//alternativa pt getTitle()
		String title = jse.executeScript("return document.title").toString();
		System.out.println(title);
	
	
		jse.executeScript("document.getElementsByClassName('menu_user_login')[0].childNodes[0].click()");
		
		//alternativa pt isSelected()
		String isSelected = jse.executeScript("return document.getElementsByName('rememberme')[0].checked").toString();
		System.out.println(isSelected);
		
		//alternativa pt isEnabled()
		String isEnabled = jse.executeScript("return document.getElementsByName('pwd')[0].disabled").toString();
		System.out.println(isEnabled);
		
		
		System.out.println(driver.getTitle());
		//custom  function
		jse.executeScript("window.schimbTitlulPaginii = function(){ document.title = 'Alt titlu'}; window.schimbTitlulPaginii.call()");
		
		System.out.println(driver.getTitle());
		
		
	}

}
