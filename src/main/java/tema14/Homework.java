package tema14;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Homework extends BaseTest{
	
	
	@Test
	public void check() {
	
	//<a href="#popup_login" class="popup_link popup_login_link icon-user inited" title="">Login</a>
	
	WebElement loginTab = driver.findElement(By.linkText("Login"));
	assertTrue(loginTab.isDisplayed());
	
	//<input type="text" id="log" name="log" value="" placeholder="Login or Email">
	WebElement loginBar =driver.findElement(By.name("log"));
	assertTrue(!loginBar.isDisplayed());
	
	//<input type="password" id="password" name="pwd" value="" placeholder="Password">
	WebElement passwordBar = driver.findElement(By.id("password"));
	assertFalse(passwordBar.isDisplayed());
	
	loginTab.click();
	assertTrue(loginBar.isDisplayed());
	assertTrue(passwordBar.isDisplayed());
	
	
	}

}
