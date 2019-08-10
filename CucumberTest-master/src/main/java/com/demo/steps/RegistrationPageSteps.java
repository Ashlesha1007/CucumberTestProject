package com.demo.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationPageSteps {
	
	@Given("^Connect with database$")
	public void connect_with_database() throws Throwable {
	    System.out.println("Connect to database");
	    System.out.println("Always execute before every scenario of feature file");
	}
	
	@Given("^user open the application$")
	public void user_open_the_application() throws Throwable {
	    System.out.println("Opens the application");
	}

	@When("^User enters email id$")
	public void user_enters_emailid() {
		System.out.println("Enters UserName");
	}

	@When("^User enters password$")
	public void user_enters_password() {
		System.out.println("Enters password");
	}
	
	@When("^User clicks on register button$")
	public void user_clicks_on_register_button() throws Throwable {
	    System.out.println("Cicking on register button");
	}

	@Then("^User is successfully signed up$")
	public void user_is_successfully_signed_up() throws Throwable {
	    System.out.println("User successfully signed up");
	}
	

	@When("^User enters invalid email id$")
	public void user_enters_invalid_email_id() throws Throwable {
	   System.out.println("User enters invalid email id");
	}
	
	@When("^User enters valid password$")
	public void user_enters_valid_password() throws Throwable {
	    System.out.println("User enters password");
	}
	
	@Then("^User is not signed up$")
	public void user_is_not_signed_up() throws Throwable {
	   System.out.println("User is not signed up successfully");
	}
	
	@When("^User enters email id \"([^\"]*)\"$")
	public void user_enters_email_id(String EmailId) throws Throwable {
		 System.out.println(EmailId);
	}

	@When("^User enters password \"([^\"]*)\"$")
	public void user_enters_password(String Password) throws Throwable {
		 System.out.println(Password);
	}
	


}
