package com.stepdefnition;

import org.apache.log4j.Logger;

import com.baseclass.Library;
import com.pages.Help_page;
import com.pages.Login_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class crosswordHep extends Library{
	Logger LOG = Logger.getLogger("devpinoyLogger");
	Help_page hp;
	
	@Given("^I am logged in to the website$")
	public void i_am_logged_in_to_the_website() throws Throwable {
		launch();
	    Login_page lp= new Login_page(driver);
	    lp.login();
	    lp.login_details("jyothidurga150@gmail.com", "jyothi123");
	    lp.submit();
	    Thread.sleep(900);
	    LOG.info("loginpage is opened");
	    
	}

	@When("^I have clicked on to the Help$")
	public void i_have_clicked_on_to_the_Help() throws Throwable {
	 hp= new Help_page(driver);
		hp.Help();
		LOG.info("Help button clicked");
		
	    
	}

	@Then("^I click on faqs that i want$")
	public void i_click_on_faqs_that_i_want() throws Throwable {
hp=new Help_page(driver);
		hp.Faqs();
		LOG.info("faqs have clicked");
	   
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
