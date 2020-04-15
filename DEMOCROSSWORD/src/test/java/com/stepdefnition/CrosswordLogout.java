package com.stepdefnition;

import org.apache.log4j.Logger;

import com.baseclass.Library;
import com.pages.Login_page;
import com.pages.Logout_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CrosswordLogout extends Library {
	Logger LOG = Logger.getLogger("devpinoyLogger");
	@Given("^I am logged on the website$")
	public void i_am_logged_on_the_website() throws Throwable {
		launch();
	    Login_page lp= new Login_page(driver);
	    lp.login();
	    lp.login_details("jyothidurga150@gmail.com", "jyothi123");
	    lp.submit();
	    Thread.sleep(900);
	    LOG.info("loginpage is opened");
	}

	@When("^I click the logout button$")
	public void i_click_the_logout_button() throws Throwable {
		Logout_page op= new Logout_page(driver);
		op.Logout();
		LOG.info("logout button is clicked");
		
	    
	}

	@Then("^I received that iam logged out$")
	public void i_received_that_iam_logged_out() throws Throwable {
		
		LOG.info("reacieved that i logged out");
	   
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
