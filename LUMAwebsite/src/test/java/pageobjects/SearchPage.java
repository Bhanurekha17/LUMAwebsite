package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class SearchPage extends BasePage{

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
@FindBy(xpath="//span[@data-ui-id='page-title-wrapper']") WebElement Product;

public boolean Searchresult(){
	try {
		return (Product.isDisplayed());
	} catch (Exception e) {
		return (false);
	}
}
}