package product.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProductMaps {
	
	
	@FindBy(id = "twotabsearchtextbox")
	public WebElement INPUT_SEARCH_PRODUCT;
	
	@FindBy(id = "nav-search-submit-button")
	public WebElement BUTTON_SEARCH_PRODUCT;

	@FindBy(xpath = "//span[@class='a-size-base-plus a-color-base a-text-normal']")
	public WebElement PATH_START_SEARCH;
	
	

}
