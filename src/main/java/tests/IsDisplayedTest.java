package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;


import utils.BaseTest;

public class IsDisplayedTest extends BaseTest{
	
	@Test 
	public void test() {
		app.click(app.menu.shopLink);
		app.shop.click(app.shop.cookingWithLoveBookLink);
		
		assertTrue(app.book.returnWebElement(app.book.maximizeImageIcon).isDisplayed());
		assertTrue(app.book.returnWebElement(app.book.bookTitle).isDisplayed());
		assertTrue(app.book.returnWebElement(app.book.bookPrice).isDisplayed());
		assertTrue(app.book.returnWebElement(app.book.bookDescription).isDisplayed());
		assertTrue(app.book.returnWebElement(app.book.selectQuantity).isDisplayed());
		assertTrue(app.book.returnWebElement(app.book.addToCartButton).isDisplayed());
		assertTrue(app.book.returnWebElement(app.book.bookCategory).isDisplayed());
		
	}
	
	@Test
	public void test2() {
		assertTrue(app.menu.returnWebElement(app.menu.facebookIcon).isDisplayed());
		assertTrue(app.menu.returnWebElement(app.menu.twitterIcon).isDisplayed());
		assertTrue(app.menu.returnWebElement(app.menu.instagramIcon).isDisplayed());
		
		
	}

}
