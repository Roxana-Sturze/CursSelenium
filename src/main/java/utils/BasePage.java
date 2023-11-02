package utils;

import org.openqa.selenium.WebDriver;

import pages.ContactsPage;
import pages.EventsPage;
import pages.GenericEventPage;
import pages.LoginPage;
import pages.MenuPage;
import pages.ShopPage;

public class BasePage  extends SeleniumWrappers{

	public BasePage(WebDriver driver) {
		super(driver);
		
	}
	
	
	public LoginPage login = new LoginPage(driver);
	public MenuPage menu = new MenuPage(driver);
	public ShopPage shop = new ShopPage(driver);
	public ContactsPage contacts = new ContactsPage(driver);
	public EventsPage events = new EventsPage(driver);
	public GenericEventPage genericEvent = new GenericEventPage(driver);
	
	

}
