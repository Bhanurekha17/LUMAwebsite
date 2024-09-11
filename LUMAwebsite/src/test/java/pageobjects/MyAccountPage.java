package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
@FindBy(xpath="//div[@data-ui-id='message-success']") WebElement thankYou;
@FindBy(xpath="//header//ul//button[@type='button']") WebElement change;
@FindBy(xpath="(//a)[4]") WebElement signOut;

@FindBy(xpath="//span[@data-ui-id='page-title-wrapper']") WebElement SignedOut;
public boolean isMyAccountPageExists()   // MyAccount Page heading display status
{
	try {
		return (thankYou.isDisplayed());
	} catch (Exception e) {
		return (false);
	}
}
public void clickprofile() {
	change.click();

}
public void clickLogout() {
	signOut.click();
   
}

public void closeBrowser() {
	driver.close();
   
}


public boolean logoutmsgExists()   
{
	try {
		return (SignedOut.isDisplayed());
		
	} catch (Exception e) {
		return (false);
		
	}
	
}
}
