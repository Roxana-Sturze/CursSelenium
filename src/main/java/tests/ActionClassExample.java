package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

//import pages.ShopPage;
import utils.BaseTest;

public class ActionClassExample extends BaseTest{

	//@Test
	public void hoverTest() throws InterruptedException {
		
		app.hoverElement(app.menu.blogLink);
		
		Thread.sleep(2000);
		
		app.hoverElement(app.menu.aboutLink);
	}
	
	//@Test
	public void dragAndDropTest() {
		
		app.click(app.menu.shopLink);
		app.dragAndDrop(app.shop.sliderInitialPosition, 100, 0);
		app.dragAndDrop(app.shop.sliderFinalPosition, -100, 0);
		
	}
	
	@Test
	public void sendKeysTest() {
		app.click(app.menu.contactsLink);
		Actions action = new Actions(driver);
		
		WebElement nameField =app.returnWebElement(app.contacts.nameField);
		
		action.keyDown(Keys.SHIFT)
			  .sendKeys(nameField, "Test Name")
			  .keyUp(Keys.SHIFT)
			  .sendKeys(Keys.TAB, "Test@email.com")
			  .sendKeys(Keys.TAB, "My Subject")
			  .sendKeys(Keys.TAB, "My message body")
			  .sendKeys(Keys.TAB, Keys.ENTER)
			  .perform();
	}
	
	
	
}
