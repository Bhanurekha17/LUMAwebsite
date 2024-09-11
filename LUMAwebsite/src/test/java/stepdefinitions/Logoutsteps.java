package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import factory.BaseClass;
import pageobjects.Homepage;
import pageobjects.Confirmationpage;
import pageobjects.Loginpage;
import pageobjects.MyAccountPage;

public class Logoutsteps  {
	WebDriver driver;
	MyAccountPage myp;
	Homepage hop;
	Loginpage lop;
	Confirmationpage cp;
	
	@Given("the user is logged in and navigates to Profile icon")
	public void the_user_is_logged_in_and_navigates_to_profile_icon() {
		lop=new Loginpage(BaseClass.getDriver());
		lop.loggedin();
	
	}
	@Given("the order placed succesfully")
	public void the_order_placed_succesfully() {
		cp=new Confirmationpage(BaseClass.getDriver());
		cp.isconfirmationpageexists();
			
			}

	@When("the user clicks on logout button")
	public void the_user_clicks_on_logout_button() {
		myp=new MyAccountPage(BaseClass.getDriver());
		myp.clickprofile();
	    myp.clickLogout();
	}

	@Then("user successfully logged out message should be displayed")
	public void user_successfully_logged_out_message_should_be_displayed() {
		
		boolean targetpage;
	  targetpage=  myp.logoutmsgExists();
      Assert.assertEquals(targetpage, true);
   
    	}
	
	@Then("the user should be navigated to homepage")
	public void the_user_should_be_navigated_to_homepage() throws InterruptedException {
		hop=new Homepage(BaseClass.getDriver());
		Thread.sleep(6000);
		boolean targetpage1;
		  targetpage1=hop.isyogaimgexists();
		  Assert.assertEquals(targetpage1, true);
		 }
		
	}
		
	
	

