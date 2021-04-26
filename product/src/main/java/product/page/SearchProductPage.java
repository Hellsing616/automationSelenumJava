package product.page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import common.TestRule;
import product.maps.SearchProductMaps;

public class SearchProductPage extends SearchProductMaps {

	private List<String> resultNameProduct = new ArrayList<String>();
	private List<String> resultNamePrice = new ArrayList<String>();

	public SearchProductPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void accessShoppingPortal(String site) {
		TestRule.getDriver().getTitle().equals(site);

	}

	public void writeNameProduct(String product) {
		INPUT_SEARCH_PRODUCT.sendKeys(product);

	}

	public void clickButtonSearch() {
		BUTTON_SEARCH_PRODUCT.click();

	}

	public void receiveProductList() {

		List<WebElement> listResultProductName = TestRule.getDriver()
				.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		List<WebElement> listResultProductPrice = TestRule.getDriver()
				.findElements(By.xpath("//span[@class='a-price']"));

		for (int i = 0; i < listResultProductName.size(); i++) {
			resultNameProduct.add(listResultProductName.get(i).toString());
			for (int j = 0; j < listResultProductName.size(); j++) {
				resultNamePrice.add(listResultProductPrice.get(i).toString());
				
				System.out.println(resultNameProduct.toString()+" "+ resultNamePrice.toString());
				continue;
			}
		}

		/*
		 * for (WebElement nameProduct : listResultProductName) {
		 * resultNameProduct.add(nameProduct.getText()); }
		 * 
		 * for (WebElement priceProduct : listResultProductPrice) {
		 * resultNamePrice.add(priceProduct.getText()); }
		 * 
		 * Map<String , String> resultProduct = new HashMap<String, String>();
		 * 
		 * 
		 * System.out.println(new StringBuilder().append(resultProduct.keySet()));
		 * 
		 * 
		 * for (int i = 0; i < listResultProductName.size(); i++) {
		 * resultProduct.put(resultNameProduct.toString(), resultNamePrice.toString());
		 * }
		 * 
		 */

	}

	public void generateSpreadsheetsWithSearchResults(String status) {
		// TODO Auto-generated method stub

	}

}
