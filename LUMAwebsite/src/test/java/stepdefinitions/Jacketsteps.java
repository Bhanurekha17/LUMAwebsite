package stepdefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

import factory.BaseClass;
import pageobjects.Homepage;
import pageobjects.JacketsPage;
import pageobjects.Loginpage;

public class Jacketsteps {
	JacketsPage jp;
	Homepage hp;
	Loginpage lp;
	 
	@Given("the user is loggedin and navigates to the Home page")
	public void the_user_is_loggedin_and_navigates_to_the_home_page() {
		lp=new Loginpage (BaseClass.getDriver());
		lp.loggedin();
	}

	@When("navigates through category menu")
	
	public void navigates_through_category_menu() throws InterruptedException {
		hp=new Homepage (BaseClass.getDriver());
		hp.selectcategory();
	}

	@When("the user clicks on the Jackets category")

	public void the_user_clicks_on_the_jackets_category() {
	  hp.select();
	}

	@Then("the user should be redirected to the Jackets Page")
	
	public void the_user_should_be_redirected_to_the_jackets_page() {
	    jp=new JacketsPage(BaseClass.getDriver());
	    
	    boolean targetpage=jp.isjacketpageexists();
		
		Assert.assertEquals(targetpage, true);
	}



}
