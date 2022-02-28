package com.test.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleFeature_StepDef {

	@Given("I am on login page")
	public void i_am_on_login_page() {
	    
	    System.out.println("User is on the login page of the application");
		
	}

	@When("I enter login credentials")
	public void i_enter_login_credentials() {
	    
		System.out.println("User has typed in the valid credentials");
	    
	}

	@Then("I should get logged into my account successfully")
	public void i_should_get_logged_into_my_account_successfully() {
	    
		System.out.println("User should get logged into his account in the application");
	    
	}

}