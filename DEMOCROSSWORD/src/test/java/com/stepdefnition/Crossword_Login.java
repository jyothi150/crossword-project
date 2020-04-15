package com.stepdefnition;

import org.apache.log4j.Logger;

import com.baseclass.Library;
import com.pages.Login_page;
import com.seleniumutil.seleniumutil;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Crossword_Login extends Library{
	Logger LOG = Logger.getLogger("devpinoyLogger");
	
	@Given("^I Launch the Browser and enter the url$")
	public void i_Launch_the_Browser_and_enter_the_url() throws Throwable {
	    launch();
	    seleniumutil sp= new seleniumutil(driver);
	    sp.take_screenshot("C:\\Users\\Lenovo\\eclipse-workspace\\DEMOCROSSWORD\\src\\test\\resources\\screenshots\\browserlaunch.png");
	    LOG.info("browser is launched");
	}

	@When("^login page is opened$")
	public void login_page_is_opened() throws Throwable {
	    Login_page lp= new Login_page(driver);
	    lp.login();
	    LOG.info("login page opened");
	}

	@Then("^I enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_the_and(String arg1, String arg2) throws Throwable {
		Login_page lp= new Login_page(driver);
		lp.login_details(arg1, arg2);
		LOG.info("login details entered");
	   
	}

	@Then("^I click on the signin button$")
	public void i_click_on_the_signin_button() throws Throwable {
		Login_page lp= new Login_page(driver);
		lp.submit();
		seleniumutil sp= new seleniumutil(driver);
		sp.take_screenshot("C:\\Users\\Lenovo\\eclipse-workspace\\DEMOCROSSWORD\\src\\test\\resources\\screenshots\\signin.png");
		LOG.info("submit button clicked");
	}}

