package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Currently user is on login page");
	   
	}

	@When("giving username and password")
	public void giving_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("User given credentials");
	}

	@When("Click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("User click on login button"); 
	}

	@Then("Land on HomePage")
	public void land_on_HomePage() {
	    // Write code here that turns the phrase above into concrete actions
	 System.out.println("User landed on home page");
	}


}
