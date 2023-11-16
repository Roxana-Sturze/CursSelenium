package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.BaseTest;

public class DataProviderExample2 extends BaseTest{
	
	
	
	@DataProvider(name="loginTestData")
	public Object[][] loginTestData(){
		
		Object[][] data = new Object[4][3];
		
		
		data[0][0] = "TestUser";
		data[0][1] = "12345@67890";
		data[0][2] = true;
		
		data[1][0] = "usergresit";
		data[1][1] = "parolagresita";
		data[1][2] = false;
		
		data[2][0] = "TestUser";
		data[2][1] = "12345@67890";
		data[2][2] = true;
		
		data[3][0] = "usergresit";
		data[3][1] = "parolagresita";
		data[3][2] = false;
		
		
		return data;
		
	
		
	}
	
	
	
	
	@Test(dataProvider = "loginTestData")
	public void loginTest(String user, String pass, boolean succes) {

		app.click(app.menu.loginLink);
		app.login.loginInApp(user, pass);
		
		if(succes) {
			assertTrue(app.login.checkLoginMsgIsDisplayed(app.login.successLoginMsg));
			app.click(app.login.logoutButton);
		}else if(!succes){
			
			assertTrue(app.login.checkLoginMsgIsDisplayed(app.login.errorLoginMsg));
			app.click(app.login.closeLoginPopup);
			
		}
		
		
	}

}
