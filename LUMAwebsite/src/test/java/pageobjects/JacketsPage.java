package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JacketsPage extends BasePage {
	public JacketsPage(WebDriver driver) {
		super(driver);
	}	

//elements
@FindBy(xpath="//span[@data-ui-id='page-title-wrapper']")  WebElement jackets;
@FindBy(xpath="//img[@alt='Olivia 1/4 Zip Light Jacket']")  WebElement ZipLightJacketimg;
@FindBy(xpath="//li[1]//div[1]//div[1]//strong[1]//a[1]")  WebElement ZipLightJacketlink;

//action methods
public boolean isjacketpageexists(){
	try {
		return (jackets.isDisplayed());
	} catch (Exception e) {
		return (false);
	}
}
public void ClickonProduct() {
	ZipLightJacketlink.click();
}
}
