package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XpathExample2 extends BaseTest{

	//@Test
	public void xpathTest() {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//find parent 
		WebElement popupLink = driver.findElement(By.xpath("//a[contains(@class, 'popup_link')]/parent::li[@class='menu_user_login']"));
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red')", popupLink );
		popupLink.click();
		
		//descendant (//) si child (/)
		WebElement username = driver.findElement(By.xpath("//ul[@id='menu_user']/descendant::form/child::div/child::input[@id='log']"));
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red')", username );
		username.sendKeys("Test");
		
		//descendant
		WebElement password = driver.findElement(By.xpath("//ul[@id='menu_user']/descendant::input[@id='password']"));
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red')", password );
		password.sendKeys("Test");
		
		//following
		WebElement rememberMe = driver.findElement(By.xpath("//div[@class='contact_phone_in_top']/following::input[@id='rememberme']"));
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red')", rememberMe );
		rememberMe.click();
		
		//preceding
		WebElement submit = driver.findElement(By.xpath("//div[@class='top_panel_top_socials']/preceding::input[@class='submit_button']"));
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red')", submit );
		submit.click();
	}
	
	@Test
	public void xpathTest2() {
		
		//         //h5[contains(text(), '$15.99')]/../..
		//         /..  --> urca pe parintele elementului
		
		
		// ne referim la paginatia din shop (adica click pe BOOKS)
		/*
		 * xpath: //*[contains(@class, 'page-numbers')] --> gaseste 4 elemente (parintele UL si 3 copii un tagname span si 2 tagnameuri a care au aceeasi clasa
		 * vreau sa elimin UL  din locatorul de mai sus
		 * 
		 * 
		 * xpath: //*[self::span or self::a][contains(@class, 'page-numbers')]
		 * 
		 * mai departe vreau sa elimin elementul care contine 1 si elementul care contine →
		 * 
		 * //*[self::span or self::a][contains(@class, 'page-numbers') and not(contains(text(), '1') or contains(text(), '→'))]
		 * 
		 */
		
		
		
	}
}
