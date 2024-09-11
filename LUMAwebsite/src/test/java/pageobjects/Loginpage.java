package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


	public class Loginpage extends BasePage {

		public Loginpage(WebDriver driver) {
			super(driver);
		}

@FindBy(xpath="//input[@title='Email']")  WebElement emailaddress;
@FindBy(xpath="//input[@title='Password']")  WebElement password;
@FindBy(xpath="//fieldset[@data-hasrequired='* Required Fields']//button[@type='submit']//span")  WebElement signIn;
@FindBy(className="logged-in") WebElement welcome;

@FindBy(xpath="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")  WebElement WasIncorr;
public void setEmail(String email) {
	emailaddress.sendKeys(email);
}

public void setPassword(String pwd) {
	password.sendKeys(pwd);
}

public void clickLogin() {
	signIn.click();
}
public boolean loggedin() {
	try {
		return (welcome.isDisplayed());
	} catch (Exception e) {
		return (false);
	}
}

public boolean errormsg() {
	try {
		return (WasIncorr.isDisplayed());
	} catch (Exception e) {
		return (false);
}
}
}
