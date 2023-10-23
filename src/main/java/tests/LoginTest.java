package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MenuPage;
import utils.BaseTest;

public class LoginTest extends BaseTest{
	
	
	@Test(priority = 1)
	public void validLogin() throws InterruptedException {
		
		//open login pop-up
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.loginLink);
		
		//insert valid username
		// insert valid password
		//press submit button
		
		LoginPage login = new LoginPage(driver);
		login.loginInApp("TestUser", "12345@67890");
		
		//verify success login
		Thread.sleep(1000);
		assertTrue(login.checkLoginMsgIsDisplayed(login.successLoginMsg));
		
		
	}

}
