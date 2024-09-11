package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}

@FindBy(xpath="//input[@id='firstname']") WebElement firstName;
@FindBy(xpath="//input[@id='lastname']")  WebElement lastName;
@FindBy(xpath="//input[@id='email_address']") WebElement Email;
@FindBy(xpath="//input[@id='password']")  WebElement password;
@FindBy(xpath="//input[@id='password-confirmation']")WebElement confirmPassword;
@FindBy(xpath="//button[@title='Create an Account']") WebElement createAnAccount;


public void setFirstName(String fname) {
	firstName.sendKeys(fname);

}

public void setLastName(String lname) {
	lastName.sendKeys(lname);

}

public void setEmail(String email) {
	Email.sendKeys(email);

}

public void setPassword(String pass) {
	password.sendKeys(pass);

}

public void setconfirmPassword(String pwd) {
	confirmPassword.sendKeys(pwd);

}

public void ClickCreateanAccount() {
	createAnAccount.click();

}
}