package tests;


import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.BookPage;
import pages.MenuPage;
import utils.BaseTest;

public class ReviewTest extends BaseTest{

	@Test
	public void sendReview() {
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.lifeInTheGardenBookLink);
		
		BookPage book = new BookPage(driver);
		book.clickSubmitButton();
		
		driver.switchTo().alert().accept();
		
		book.sendReview("q", "test", "test@test.com");
		assertEquals("Your review is awaiting approval",book.approvalMessage());
	}
}
