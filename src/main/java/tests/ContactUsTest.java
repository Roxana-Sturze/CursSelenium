package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.ContactsPage;
import pages.MenuPage;
import utils.BaseTest;

public class ContactUsTest extends BaseTest{
	
	
	@Test
	public void sendMessage() throws InterruptedException {
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.contactsLink);
		
		ContactsPage contact = new ContactsPage(driver);
		contact.sendMessage("Roxana", "sturze_roxana@yahoo.com", "Test", "Test");
		
		assertEquals(contact.confirmationMessage(), "Thank you for your message. It has been sent.");
		
		
		
		
	}

}
