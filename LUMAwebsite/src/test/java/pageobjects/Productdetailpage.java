package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Productdetailpage extends BasePage {
	public Productdetailpage(WebDriver driver) {
		super(driver);
	}	
WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
@FindBy(xpath="//span[@data-ui-id='page-title-wrapper']") WebElement olivia14ZipLightJacket;

@FindBy(xpath="//div[@aria-label='M']")  WebElement Medium;
@FindBy(xpath="//div[@aria-label='Blue']")  WebElement blue;
@FindBy(xpath="//button[@title='Add to Cart']//span") WebElement addToCart;

@FindBy(xpath="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")WebElement successmsg;
@FindBy(xpath="//body/div/header/div/div[@data-block='minicart']/a[1]")  WebElement one;
@FindBy(xpath="//button[@title='Proceed to Checkout']") WebElement proceedToCheckout;

	public boolean isProductdetailpageexists(){
		try {
			return (olivia14ZipLightJacket.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}
	public void selectsize()  {
		
		Medium.click();
	}
	public void seletcolor() {
		blue.click();
	}
public void addtocart() {
	addToCart.click();
}
public void cartclick() {
	one.click();
}
public void checkout() throws InterruptedException {
	wait.until(ExpectedConditions.visibilityOf(proceedToCheckout));
	proceedToCheckout.click();
}
public boolean cartvalueincrement() {
	try {
		return (one.isDisplayed());
	} catch (Exception e) {
		return (false);
	}
}
	public boolean Successmsg() {
		try {
			return (successmsg.isDisplayed());
		} catch (Exception e) {
			return (false);
		}

}
}




