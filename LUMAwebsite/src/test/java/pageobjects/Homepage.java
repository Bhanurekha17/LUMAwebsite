package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage {

	public Homepage(WebDriver driver) {
		super(driver);
	}

	// Elements

@FindBy(xpath="//header//li[3]//a[1]")  WebElement createAnAccount;
@FindBy(xpath="//body//div//header//div//div//ul//li[@data-label='or']//a") WebElement signIn;
@FindBy(xpath="//input[@placeholder='Search entire store here...']") WebElement txtSearchbox;
@FindBy(xpath="//button[@title='Search']")  WebElement btnSearch;
@FindBy(xpath="//a[@href='https://magento.softwaretestingboard.com/women/tops-women/jackets-women.html']//span") WebElement jackets;	
@FindBy(xpath="//body/div/div/div[@role='tablist']/div[@role='tabpanel']/nav[@data-action='navigation']/ul[@role='menu']/li[2]/a[1]/span[2]") WebElement women;
@FindBy(xpath="//a[@href='https://magento.softwaretestingboard.com/women/tops-women.html']")  WebElement tops;		

@FindBy(xpath="//img[@src='https://magento.softwaretestingboard.com/pub/media/wysiwyg/home/home-main.jpg']") WebElement Yogaimg;
	// Action Methods
	public void clickMyAccount() {
		createAnAccount.click();
	}

	public boolean isyogaimgexists()   // MyAccount Page heading display status
	{
		try {
			return (Yogaimg.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}
	
	public void clicksignIn()    // added in step6
	{
		signIn.click();
	}
	
	public void enterProductName(String pName)   //For Search Product Test
	{
		txtSearchbox.sendKeys(pName);
	}
	
	public void clickSearch()  //For Search Product Test
	{
		btnSearch.click();
	}
	public void selectcategory() throws InterruptedException  {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(women).perform();
		
		actions.moveToElement(tops).perform();
		
		actions.moveToElement(jackets);
	}
	
	public void select()  //For select category
	{
		
		jackets.click();
	}
	
	
}

