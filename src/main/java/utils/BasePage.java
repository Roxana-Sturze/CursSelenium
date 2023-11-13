package utils;

import org.openqa.selenium.WebDriver;

import pages.BookPage;
import pages.ContactsPage;
import pages.EventsPage;
import pages.GenericEventPage;
import pages.LoginPage;
import pages.MenuPage;
import pages.ShopPage;
import pages.UserPage;

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
	public UserPage user = new UserPage(driver);
	public BookPage book = new BookPage(driver);
	
	

}
