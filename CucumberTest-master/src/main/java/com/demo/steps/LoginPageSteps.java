package com.demo.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps {
	
	@Given("^User open browser$")
	public void user_open_browser() throws Throwable {
	    System.out.println("Always execute before every scenario of that feature file");
	}

	@Given("^User open application$")
	public void user_open_application() throws Throwable {
		System.out.println("Open application");
	}
	
	@When("^User enters Username$")
	public void user_enters_username() {
		System.out.println("Enter UserName");
	}

	@When("^User enters Password$")
	public void user_enters_password() {
		System.out.println("Enter password");
	}

	@When("^User clicks on Login button$")
	public void user_clicks_onSignIn() throws Throwable {
		System.out.println("Click Login button");
	}

	@Then("^User is successfully logged in$")
	public void user_is_displayed_login_screen() throws Throwable {
		System.out.println("Successfull Login!!");
	}
	
	@Given("^User enters Username \"([^\"]*)\"$")
	public void user_enters_Username(String user) throws Throwable {
	   System.out.println(user);
	}

	@Given("^User enters Password \"([^\"]*)\"$")
	public void user_enters_Password(String pass) throws Throwable {
	   System.out.println(pass);
	}

}
