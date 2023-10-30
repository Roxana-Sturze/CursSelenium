package pages;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookPage {
	
	public WebDriver driver;
	
	public BookPage(WebDriver driver) {
		
		this.driver =driver;
		
	}
	
	public By reviewTab = By.cssSelector("a[href='#tab-reviews']");
	public By yourReviewField = By.cssSelector("textarea[id='comment']");
	public By nameField =By.cssSelector("input[id='author']");
	public By emailField =By.cssSelector("input[id='email']");
	public By submitButton =By.cssSelector("input[name='submit']");
	public By cookiesConsentCheckbox = By.cssSelector("input[id='wp-comment-cookies-consent']");
	public By reviewAwaitingApproval = By.cssSelector("em[class='woocommerce-review__awaiting-approval']");
	
	
	
	
	public void clickReviewTab() {
		
		driver.findElement(reviewTab).click();
	}
	
	public void clickSubmitButton() {
		clickReviewTab();
		driver.findElement(submitButton).click();
		
	}
	
	public void sendReview(String review, String name, String email) {
		
		clickReviewTab();
		Random rand = new Random();
		int num = rand.nextInt(5) + 1;
		By stars =By.cssSelector("a[class=star-"+ num + "]");
		driver.findElement(stars).click();
		driver.findElement(yourReviewField).sendKeys(review);
		driver.findElement(nameField).sendKeys(name);
		driver.findElement(emailField).sendKeys(email);
		driver.findElement(cookiesConsentCheckbox).click();
		driver.findElement(submitButton).click();
		
		
	}
	
	public String approvalMessage() {
		
		WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(reviewAwaitingApproval)); 
		
		return driver.findElement(reviewAwaitingApproval).getText();
	}

}
