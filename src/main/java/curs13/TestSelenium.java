package curs13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class TestSelenium {

	
	
	
	@Test
	public void openBrowser() {
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		//WebDriver driver = new SafariDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://keybooks.ro");
		
		driver.findElement(By.linkText("Login")).click();
		
		
		//driver.findElement(By.id("log")).isDisplayed();
		//driver.findElement(By.id("log")).sendKeys("TestUser");
		
		WebElement username = driver.findElement(By.id("log"));
		
		username.isDisplayed();
		username.sendKeys("TestUser");
		
		//driver.quit();		
		//System.err.print("Test ceva");
		
	}
}
