package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class ClassicBlogPage extends SeleniumWrappers{

	public ClassicBlogPage(WebDriver driver) {
		super(driver);
	}
	
	public By searchField = By.xpath("(//input[contains(@class, 'search_field')])[3]");
	public By searchButton = By.xpath("//button[contains(@class, 'search_button')]");
	public By blogTitle = By.xpath("//h4[contains(@class, 'post_title')]");
	public By bookCategory1 = By.xpath("(//a[contains(@class, 'category_link')])[1]");
	public By bookCategory2 = By.xpath("(//a[contains(@class, 'category_link')])[2]");
	public By bookCategory3 = By.xpath("(//a[contains(@class, 'category_link')])[3]");

}
