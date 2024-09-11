package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Confirmationpage extends BasePage {

	public Confirmationpage(WebDriver driver) {
		super(driver);
	}	

	@FindBy(xpath="//span[@data-ui-id='page-title-wrapper']") WebElement Thankyou;
	
	public boolean isconfirmationpageexists(){
		try {
			return (Thankyou.isDisplayed());
		} catch (Exception e) {
			return (false);
	}
}
}