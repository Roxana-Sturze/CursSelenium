package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import utils.BaseTest;

public class BlogTest extends BaseTest{
	
	@Test
	public void searchBlog() {
		app.menu.navigateTo(app.menu.blogLink);
		app.menu.navigateTo(app.menu.classicBlogLink);
		app.contacts.click(app.classic.searchField);
		app.classic.returnWebElement(app.classic.searchField).sendKeys("Why");
		app.classic.click(app.classic.searchButton);
		
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/?s=Why");
		
		app.classic.click(app.classic.blogTitle);
		
		assertEquals(app.classic.returnWebElement(app.classic.bookCategory1).getText(),"Classic");
		assertEquals(app.classic.returnWebElement(app.classic.bookCategory2).getText(),"News");
		assertEquals(app.classic.returnWebElement(app.classic.bookCategory3).getText(),"Recommend");
		assertEquals(driver.getCurrentUrl(),"https://keybooks.ro/2016/02/02/why-i-wont-stop-buying-books/");
		
	}

}
