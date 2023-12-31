package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
	
	public WebDriver driver;
	public BasePage app;

	@BeforeClass(alwaysRun = true)
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize(); //maximizes the browser window
		driver.get("https://keybooks.ro"); // navigates to the specified URL
		
		app = new BasePage(driver);
		
	}
	
	
	@AfterClass(alwaysRun = true)
	public void tearDown() throws InterruptedException {
		
	
		Thread.sleep(4000);// bad practice
		
		//driver.close(); // inchide tab-ul curent
		driver.quit(); // inchide browser-ul indiferent cate taburi sunt deschise
		
	}
	
}
