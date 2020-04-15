package com.stepdefnition;

import org.apache.log4j.Logger;

import com.baseclass.Library;
import com.pages.Book_page;
import com.pages.Login_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class  CrosswordBook extends Library{
	Logger LOG = Logger.getLogger("devpinoyLogger");
	
	
	@Given("^I logged on the Website$")
	public void i_logged_on_the_Website() throws Throwable {
	    launch();
	    Login_page lp= new Login_page(driver);
	    lp.login();
	    lp.login_details("jyothidurga150@gmail.com", "jyothi123");
	    lp.submit();
	    Thread.sleep(900);
	    LOG.info("login page is opened");
	}

	

	@When("^I click on books$")
	public void i_click_on_books() throws Throwable {
		Book_page bp= new Book_page(driver);
		bp.books_button();
		LOG.info("book page is cliked");
	}

	@Then("^I select required book$")
	public void i_click_on_quickview() throws Throwable {
		Book_page bp= new Book_page(driver);
		bp.quick_view();
		LOG.info("book is selected");
	}




}






