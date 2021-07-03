package org.steps;

import org.base.BaseClass;
import org.datas.Pojo1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login1 extends BaseClass {
	
	@Given("user to launch browser and hit url")
	public void user_to_launch_browser_and_hit_url() {
	    launchBrowser();
		loadUrl("https://www.facebook.com/");
	}

	@When("user has to going to enter username and password")
	public void user_has_to_going_to_enter_username_and_password() {
		
		Pojo1 p = new Pojo1();
		fill(p.getTxtUser(), "Java@123");
		fill(p.getTxtPass(), "Java6789");
		btnClk(p.getBtnClick());
	    
	}

	@Then("user should be navigate to home page")
	public void user_should_be_navigate_to_home_page() {
	    System.out.println("Verified");
	}
	
	

}
