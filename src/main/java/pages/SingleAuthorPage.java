package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingleAuthorPage {
	
	public WebDriver driver;

	public SingleAuthorPage(WebDriver driver) {
		
		this.driver =driver;
		
	}
	
	public By dramaSkillProcentage = By.cssSelector("div[data-stop='95'");
	public By biographySkillProcentage = By.cssSelector("div[data-stop='75'");
	public By cookBooksSkillProcentage = By.cssSelector("div[data-stop='82'");
	
	
	public String dramaSkills() {
		WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(dramaSkillProcentage));
		return driver.findElement(dramaSkillProcentage).getText();
	}
	public String biographySkills() {
		WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(biographySkillProcentage));
		return driver.findElement(biographySkillProcentage).getText();
	}
	public String cookBooksSkills() {
		WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(cookBooksSkillProcentage));
		return driver.findElement(cookBooksSkillProcentage).getText();
	}
}
