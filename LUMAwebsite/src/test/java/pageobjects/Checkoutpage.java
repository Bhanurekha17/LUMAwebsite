package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Checkoutpage extends BasePage {

	public Checkoutpage(WebDriver driver) {
		super(driver);
		
	}	

@FindBy(xpath="//button[@data-role='opc-continue']//span") WebElement next;


@FindBy(xpath="//button[@title='Place Order']//span") WebElement placeOrder;
@FindBy(xpath="//span[@data-ui-id='page-title-wrapper']") WebElement Purchase;


@FindBy(xpath="//img[@title='Olivia 1/4 Zip Light Jacket']") WebElement ZipLightJacket;
@FindBy(xpath="//body//div//div[1]//div[1]//div[1]//strong[1]//span[2]") WebElement itemInCart;

public boolean summaryexists(){
	try {
		return (itemInCart.isDisplayed());
	} catch (Exception e) {
		return (false);
	}
}

public void viewsummary()  {
	
	Actions actions = new Actions(driver);
	actions.moveToElement(itemInCart).perform();
	itemInCart.click();
	
}
public boolean isproductexists(){
	try {
		Actions actions = new Actions(driver);
		actions.moveToElement(itemInCart).perform();
		itemInCart.click();
		return (ZipLightJacket.isDisplayed());
	} catch (Exception e) {
		return (false);
	}
}
public void Clicknext() throws InterruptedException {
	Thread.sleep(1000);
	Actions actions1 = new Actions(driver);
	actions1.moveToElement(next).perform();
	next.click();
	
}
public void placeOrder() throws InterruptedException {
	Thread.sleep(7000);
	Actions actions2 = new Actions(driver);
	actions2.moveToElement(placeOrder).perform();
		placeOrder.click();
}
}

