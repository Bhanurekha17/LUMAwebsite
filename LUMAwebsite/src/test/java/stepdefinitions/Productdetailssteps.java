package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import factory.BaseClass;
import pageobjects.JacketsPage;
import pageobjects.Productdetailpage;
public class Productdetailssteps {
JacketsPage jp;
Productdetailpage pp;

	
	@Given("the user lands on the category Page")
	
	public void the_user_lands_on_the_category_page() {
		jp=new JacketsPage(BaseClass.getDriver());
		jp.isjacketpageexists();
	}

	@When("the user clicks on the Jackets Ziplight product")
	public void the_user_clicks_on_the_jackets_ziplight_product() {
	    jp.ClickonProduct();
	}

	@Then("the user should be redirected to the Ziplight Jacket's productPage")
	public void the_user_should_be_redirected_to_the_ziplight_jacket_s_product_page() {
		 pp=new Productdetailpage(BaseClass.getDriver());
	 boolean targetpage = pp.isProductdetailpageexists();
	Assert.assertEquals(targetpage, true);
	   }
	}


