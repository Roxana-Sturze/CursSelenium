package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class ScrollExample extends BaseTest{
	
	@Test(priority=1)
	public void scrollByixel() {
		
		//JS scroll
		
		//Action class scroll
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 2000).perform();
	}
	
	@Test(priority=2)
	public void scrollToElement() throws InterruptedException {
		
		
		//JS scroll
		
		//Action class scroll
		Actions action = new Actions(driver);
		action.scrollToElement(app.returnWebElement(app.menu.signUpButton)).perform();
		Thread.sleep(4000);
		
	}
	
	@Test(priority=3)
	public void scrollTopOrDown() throws InterruptedException {
		
		//JS scroll
		
		//Action class scroll
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		Thread.sleep(3000);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		
	}

}
