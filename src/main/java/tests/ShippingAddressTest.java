package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MenuPage;
//import pages.UserPage;
import utils.BaseTest;

public class ShippingAddressTest extends BaseTest{
	
	@Test
	public void test() throws InterruptedException {
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.loginLink);
		
		LoginPage login = new LoginPage(driver);
		login.loginInApp("TestUser", "12345@67890");
		
		
		app.menu.navigateTo(app.menu.userLink);
		Thread.sleep(2000);
		app.menu.navigateTo(app.menu.userSettingsLink);
		
		//UserPage user = new UserPage(driver);
		
		app.user.click(app.user.addressLink);
		app.user.click(app.user.addAddressButton);
		
		app.user.filterByIndex(41, app.user.countryDropdown);
		app.user.filterByVisibleText("Newfoundland and Labrador", app.user.proviceDropdown);
		
		assertEquals(app.user.returnWebElement(app.user.selectedCountry).getText(), "Canada");
		assertEquals(app.user.returnWebElement(app.user.selectedProvince).getText(),"Newfoundland and Labrador");
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/account/edit-address/shipping/");
		
		
	}

}
