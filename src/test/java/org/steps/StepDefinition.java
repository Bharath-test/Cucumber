package org.steps;

import org.base.BaseClass;
import org.datas.Pojo1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	
	@Given("user should be launch ChromeBrowser and enter the url")
	public void user_should_be_launch_ChromeBrowser_and_enter_the_url() {
		launchBrowser();
		loadUrl("https://www.facebook.com/");
	   
	}

	@When("user is going to enter username and password field")
	public void user_is_going_to_enter_username_and_password_field() {
		
		Pojo1 p = new Pojo1();
		
	    fill(p.getTxtUser(), "Greens@123");
	    fill(p.getTxtPass(), "Greens");
	   
	}

	@When("user should be click to login button")
	public void user_should_be_click_to_login_button() {
		
		Pojo1 p = new Pojo1();
		btnClk(p.getBtnClick());
	    
	}

	@Then("user should be navigate to credential page")
	public void user_should_be_navigate_to_credential_page() {
	    
		System.out.println("Successful");
	}

	@When("user is going to enter username and password")
	public void user_is_going_to_enter_username_and_password() {
	   
        Pojo1 p = new Pojo1();
		
	    fill(p.getTxtUser(), "Selenium@123");
	    fill(p.getTxtPass(), "selenium");
	   
		
	}

	@When("user should be click to login btn")
	public void user_should_be_click_to_login_btn() {
	   
		Pojo1 p = new Pojo1();
		btnClk(p.getBtnClick());
	    
		
	}

	@Then("user should be navigate to error page")
	public void user_should_be_navigate_to_error_page() {
	   
		 System.out.println("Done");
	}




}
