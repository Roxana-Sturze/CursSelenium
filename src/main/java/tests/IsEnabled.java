package tests;

import org.testng.annotations.Test;

import utils.BaseTest;

public class IsEnabled extends BaseTest{
	
	
	/*
	 * isEnabled() -->   verifica daca un element de tip input este enabled sau disabled
	 * intoarce boolean
	 */
	
	
	
	@Test
	public void isEnabledTest() {
		
		app.menu.navigateTo(app.menu.loginLink);
		System.out.println(app.returnWebElement(app.login.usernameField).isEnabled());
		
	}

}
