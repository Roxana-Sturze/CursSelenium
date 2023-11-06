package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MenuPage;
import utils.BaseTest;

public class LoginTest extends BaseTest{
	
	@Parameters({"user", "pass"})
	@Test(priority = 1)
	public void validLogin(String username, String password) throws InterruptedException {
		
		//open login pop-up
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.loginLink);
		
		//insert valid username
		// insert valid password
		//press submit button
		
		LoginPage login = new LoginPage(driver);
		//login.loginInApp("TestUser", "12345@67890");
		login.loginInApp(username, password);
		
		//verify success login
		Thread.sleep(1000);
		assertTrue(login.checkLoginMsgIsDisplayed(login.successLoginMsg));
		
		
	}

}
