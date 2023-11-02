package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XpathExample extends BaseTest{

	@Test(priority=1)
	public void xpathExample() throws InterruptedException {
		driver.findElement(By.xpath("//li[@class='menu_user_login']")).click();
		
		//logical OR
		driver.findElement(By.xpath("//input[@id='log' or @name = 'log']")).sendKeys("TestUser");
		
		//logical And
		driver.findElement(By.xpath("//input[@type='password' and @name='pwd']")).sendKeys("12345@67890");
		
		driver.findElement(By.xpath("//input[@class='submit_button']")).click();	
		
		Thread.sleep(4000);
	}
	
	@Test(priority=2)
	public void xpathExample2() {
		driver.findElement(By.xpath("//span[@class='user_name']")).click();
		
		//text() --> citeste textul dintre tagurile HTML
		//<a href="https://keybooks.ro/wp-admin/profile.php" class="icon icon-cog">Settings</a>
		driver.findElement(By.xpath("//a[text() = 'Settings']")).click();
		
		
		//contains
		//    //a[contains(text(),'recent')] --> referinta catre textul dintre taguri cu text()
		//   //a[contains(@href , 'orders')] --> referinta catre atributul href cu @href
		driver.findElement(By.xpath("//a[contains(text(),'recent')]")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement orderTableHeader = driver.findElement(By.xpath("//th[contains(@class, 'woocommerce-orders-table__header')]/span[text()='Order']"));
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red')", orderTableHeader );
		
		//index
		WebElement totalTableHeader =driver.findElement(By.xpath("(//th[contains(@class, 'woocommerce-orders-table__header')]/span)[4]"));
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid orange')", totalTableHeader );
		
		
		WebElement order =driver.findElement(By.xpath("//td[contains(@class, 'woocommerce-orders-table__cell')][@data-title='Order']/a[not(contains(text(), '#172' ))]"));
		order.click();	
		}
}
