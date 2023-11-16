package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.BaseTest;

public class DataProviderExample extends BaseTest{
	
	@DataProvider(name= "bookNameDataProvider")
	public Object[][] bookNameDataProvider(){
		
		Object[][] data = new Object [5][2];
		
		data[0][0] ="The forest";
		data[0][1] = "book2.jpg";
		
		data[1][0] = "Life in the garden";
		data[1][1] = "book4.jpg";
		
		data[2][0] = "The long road to deep Silence";
		data[2][1] = "book5.jpg";
		
		data[3][0] = "It’s a really strange story";
		data[3][1] = "book12.jpg";
		
		data[4][0] = "Storm";
		data[4][1] = "books7.jpg";
		
		return data;
	}
	
	//@Test(dataProviderClass = "numeClasa", dataProvider = "bookNameDataProvider" ) --> daca data provider este in alta clasa
	@Test(dataProvider = "bookNameDataProvider")
	public void searchBooksTest(String bookName, String bookPicture) throws InterruptedException {
		
		app.menu.search(bookName);
		Thread.sleep(3000);
		
		WebElement pozaCarte = driver.findElement(By.cssSelector("div[data-image*='"+ bookPicture +"']"));
		assertTrue(pozaCarte.isDisplayed());
		
	}

}
