package stepdefnition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steodefnition {
	
	@Given("user is  on homepage")
	public void user_is_on_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    
	    System.out.println("Given");
	}

	@When("user navigates to Login Page")
	public void user_navigates_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("When i am in git");

	}

	@And("user enters username and Password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("and");

	}

	@Then("success message is displayed")
	public void success_message_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("then");

	}

}
