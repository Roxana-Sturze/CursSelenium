package tests;

import org.testng.annotations.Test;

import utils.BaseTest;

public class SaleTest extends BaseTest{
	
	@Test
	public void test() {
		
		app.menu.navigateTo(app.menu.shopLink);
		app.shop.click(app.shop.cookbooksLink);
		
		if(app.shop.listLength(app.shop.genericBook) == app.shop.listLength(app.shop.saleIcon)) {
			System.out.println("Toate cartile din categorie sunt la reducere");
		}else {
			System.out.println("Nu toate cartile sunt la reducere");
		}
		
	}

}
