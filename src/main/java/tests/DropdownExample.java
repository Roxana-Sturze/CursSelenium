package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utils.BaseTest;

public class DropdownExample extends BaseTest {
	
	
	@Test(priority=1)
	public void selectByValueTest() {
		
		app.click(app.menu.shopLink);
		app.shop.filterByValue("date");
		
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/?orderby=date");
		assertEquals(app.shop.getCurrentSelectedOption(), "Sort by latest");
		
	}
	
	@Test(priority=2)
	public void selectByTextTest() {
		
		app.click(app.menu.shopLink);
		app.shop.filterByVisibleText("Sort by average rating");
		
		assertEquals(app.shop.getCurrentSelectedOption(),"Sort by average rating");
		
	}
	
	@Test(priority=3)
	public void selectByIndexTest() {
		
		app.click(app.menu.shopLink);
		app.shop.filterByIndex(4);
		
		assertEquals(app.shop.getCurrentSelectedOption(), "Sort by price: low to high");
		
	}
	
	
	@Test(priority=4)
	public void example() throws InterruptedException {
		
		app.click(app.menu.shopLink);
		//incarca in memorie un WebElement pe un session id
		WebElement dropdown= driver.findElement(By.name("orderby"));
		Select select = new Select(dropdown);// prmeste WebElementul de mai sus
		select.selectByIndex(2);// se foloseste de Webelement si face refresh (ia alt id de sesiune)
		Thread.sleep(2000);
		//start fix pt stale element
		dropdown= driver.findElement(By.name("orderby"));
		select = new Select(dropdown);
		//end fix
		select.selectByValue("date");// se foloseste de elementul care apartine de prima sesiune
		
		
	}

}
