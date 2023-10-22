package curs14;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class SeleniumLocator extends BaseTest{
	
	
	@Test(priority = 1)
	public void tagNameExample() {
		
		//<em>Discover</em>
		
		
		WebElement discoverText = driver.findElement(By.tagName("em"));
		
		//metoda get text ne aduce textul dintre tagurile html
		String text = discoverText.getText();
		assertEquals(text, "Discover");
	}
	
	
	@Test(priority = 2)
	public void linkTextExample() {
		
		//<a href="https://keybooks.ro/shop/">Books</a>
		WebElement shopLink = driver.findElement(By.linkText("BOOKS"));
		shopLink.click();
		//getCurrentUrl --> intoarce url la care se afla aplicatia acum
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/");
	}
	
	
	@Test(priority = 3)
	public void partialLinkTextExample() {
		//<a href="https://keybooks.ro/shop/cooking-with-love/">Cooking with love</a>
		
		WebElement cookingBookLink = driver.findElement(By.partialLinkText("love"));
		cookingBookLink.click();
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/cooking-with-love/");
	}

	
	@Test(priority = 4)
	public void classNameLocator() {
		//<bdi><span class="woocommerce-Price-currencySymbol">$</span>18.49</bdi>
		
		WebElement price = driver.findElement(By.className("price"));
		System.out.println(price.getText());
		
		assertTrue(price.getText().contains("18.49"));
		
		
	}
	
	@Test(priority = 5)
	public void idLocator() {
		
		//<li class="reviews_tab" id="tab-title-reviews" role="tab" aria-controls="tab-reviews">
	
		Actions obj = new Actions(driver);
		obj.scrollByAmount(0, 300).perform();
		
		
		WebElement reviewTab = driver.findElement(By.id("tab-title-reviews"));
		reviewTab.click();
		
		
		WebElement reviewElement =driver.findElement(By.className("woocommerce-Reviews-title"));
		assertTrue(reviewElement.isDisplayed());
		assertEquals(reviewElement.getText(), "Reviews");
		
		
	}
	
	
	@Test(priority = 6)
	public void nameLocator() {
		
		//<textarea id="comment" name="comment" cols="45" rows="8" required=""></textarea>
		
		WebElement messageBox = driver.findElement(By.name("comment"));
		//sendKeys --> simuleaza scrierea de la tastatura
		
		messageBox.sendKeys("My message!");
		
	}
	
	
	@Test(priority = 7)
	public void cssSelector() {
		
		//<input id="author" name="author" type="text" value="" size="30" required="">
		
		WebElement nameTextBox = driver.findElement(By.cssSelector("input[name='author']"));
		nameTextBox.sendKeys("My name!");
	}
	


}
