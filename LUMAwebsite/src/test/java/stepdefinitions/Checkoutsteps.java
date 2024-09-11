package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import factory.BaseClass;
import pageobjects.Checkoutpage;
import pageobjects.Productdetailpage;
import pageobjects.Confirmationpage;

public class Checkoutsteps {
	Productdetailpage pdp;
	Confirmationpage cop;
	Checkoutpage chp;

	@Given("the Product is successfully added to cart")
	public void the_product_is_successfully_added_to_cart() {
		pdp=new Productdetailpage(BaseClass.getDriver());
	    pdp.cartclick();
	}

	@When("user clicks on the Proceed to check out button")
	public void user_clicks_on_the_proceed_to_check_out_button() throws InterruptedException {
	  pdp.checkout();
	}

	@Then("user should be navigated to checkout Page")
	public void user_should_be_navigated_to_checkout_page() throws InterruptedException {
		chp=new Checkoutpage(BaseClass.getDriver());
	    boolean targetitem = chp.summaryexists();
		Assert.assertEquals(targetitem, true);
	    
	}

	@Given("the product is available on the checkout Page")
	public void the_product_is_available_on_the_checkout_page() throws InterruptedException {
		chp=new Checkoutpage(BaseClass.getDriver());
		chp.isproductexists();
	}

	@When("the user clicks on the next button")
	public void the_user_clicks_on_the_next_button()throws InterruptedException {
	  chp.Clicknext();
	}
		
	
	@When("the user clicks on the place order button")
	public void the_user_clicks_on_the_place_order_button() throws InterruptedException {
		chp=new Checkoutpage(BaseClass.getDriver());
		chp.placeOrder();
	}

	@Then("order should get placed and order confirmation page should be displayed")
	public void order_should_get_placed_and_order_confirmation_page_should_be_displayed() {
		cop=new Confirmationpage(BaseClass.getDriver());
		 boolean targetpage = cop.isconfirmationpageexists();
		Assert.assertEquals(targetpage, true);
	}



}
