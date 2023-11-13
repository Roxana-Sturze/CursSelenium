package pages;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.SeleniumWrappers;

public class BookPage extends SeleniumWrappers{
	
	public BookPage(WebDriver driver) {
		super(driver);
	}

//	public WebDriver driver;
	
//	public BookPage(WebDriver driver) {
//		
//		this.driver =driver;
//		
//	}
	
	public By reviewTab = By.cssSelector("a[href='#tab-reviews']");
	public By yourReviewField = By.cssSelector("textarea[id='comment']");
	public By nameField =By.cssSelector("input[id='author']");
	public By emailField =By.cssSelector("input[id='email']");
	public By submitButton =By.cssSelector("input[name='submit']");
	public By cookiesConsentCheckbox = By.cssSelector("input[id='wp-comment-cookies-consent']");
	public By reviewAwaitingApproval = By.cssSelector("em[class='woocommerce-review__awaiting-approval']");
	
	public By maximizeImageIcon = By.xpath("//a[contains(@class, 'woocommerce-product-gallery__trigger')]");
	public By bookTitle =By.xpath("//h1[contains(@class, 'product_title')]");
	public By bookPrice = By.xpath("(//span[contains(@class, 'amount')])[5]");
	public By bookDescription = By.xpath("//div[contains(@class, 'short-description')]");
	public By selectQuantity = By.xpath("//input[contains(@name, 'quantity')]");
	public By addToCartButton = By.xpath("//button[contains(@name, 'add-to-cart')]");
	public By bookCategory = By.xpath("(//a[contains(@href, 'product-category')])[3]");
	
	
	
	
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
