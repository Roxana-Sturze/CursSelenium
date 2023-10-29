package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.MenuPage;
import pages.SingleAuthorPage;
import utils.BaseTest;

public class SingleAuthorTest extends BaseTest{
	
	@Test
	public void verifySkills() {
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.singleAuthorLink);
		
		SingleAuthorPage author =new SingleAuthorPage(driver);
		
		assertEquals(author.dramaSkills(),"95%");
		assertEquals(author.biographySkills(),"75%");
		assertEquals(author.cookBooksSkills(),"82%");
		
		
	}

}
