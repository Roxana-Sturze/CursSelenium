package tests;

import org.testng.annotations.Test;

import utils.BaseTest;

public class IframeExample extends BaseTest{


	@Test
	public void iframeTest() {
		
		app.click(app.menu.contactsLink);
		app.contacts.zoomMap(app.contacts.zoomInButton);
		
		app.returnWebElement(app.contacts.nameField).sendKeys("Text");
	}

}
