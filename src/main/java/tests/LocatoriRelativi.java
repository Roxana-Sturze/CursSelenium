package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

import utils.BaseTest;

public class LocatoriRelativi extends BaseTest{
	
	/*
	 * toLeftOf
	 * toRightOf
	 * below
	 * above
	 * near
	 * 
	 */
	
	@Test(groups = "ProductFunctionality")
	public void locaatoriRelativi() {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		
		//to left of
		WebElement price = driver.findElement(RelativeLocator.with(By.xpath("//h5[contains(@class, 'sc_title')]")).toLeftOf(By.xpath("//a[@href= 'life-in-the-garden']")));
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red')", price );
		
		
		//to right of
		WebElement price2 = driver.findElement(RelativeLocator.with(By.xpath("//h5[contains(@class, 'sc_title')]")).toRightOf(By.xpath("//a[@href= 'life-in-the-garden']")));
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red')", price2 );
		
		
		//below
		WebElement price3 = driver.findElement(RelativeLocator.with(By.xpath("//h5[contains(@class, 'sc_title')]")).below(By.xpath("//a[@href= 'life-in-the-garden']")));
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red')", price3 );
		
		//above
		WebElement authorMann = driver.findElement(RelativeLocator.with(By.xpath("//p[text()='Richard Mann']")).above(By.xpath("//h5[contains(@class, 'sc_title')]")));
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red')", authorMann );
		
		//near
		WebElement authorMann2 = driver.findElement(RelativeLocator.with(By.xpath("//p[text()='Richard Mann']")).near(By.xpath("//a[@href= 'life-in-the-garden']"), 100));
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red')", authorMann2 );
		
				
		
	}

}
