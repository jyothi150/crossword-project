package com.stepdefnition;

import org.apache.log4j.Logger;

import com.baseclass.Library;
import com.pages.Login_page;
import com.pages.Mycart_page;
import com.seleniumutil.seleniumutil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CrosswordMycart extends Library {
	Logger LOG = Logger.getLogger("devpinoyLogger");
	@Given("^I logged on to the Website$")
	public void i_logged_on_to_the_Website() throws Throwable {
		launch();
		 seleniumutil sp= new seleniumutil(driver);
		 sp.take_screenshot("C:\\Users\\Lenovo\\eclipse-workspace\\DEMOCROSSWORD\\src\\test\\resources\\screenshots\\browserLaunch.png");
	    Login_page lp= new Login_page(driver);
	    lp.login();
	    lp.login_details("jyothidurga150@gmail.com", "jyothi123");
	    lp.submit();
	    Thread.sleep(900);
	    LOG.info("login page is opened");
	   
	}

	@When("^I clicked on mycart$")
	public void i_clicked_on_mycart() throws Throwable {
		Mycart_page Mp= new Mycart_page(driver);
		
		Mp.Mycart_button();
		LOG.info("mycart is clicked");
	
		
	   
	}

	@Then("^I select continue shopping$")
	public void i_select_continue_shopping() throws Throwable {
		Mycart_page Mp= new Mycart_page(driver);
		Mp.continueshop();
		seleniumutil sp= new seleniumutil(driver);
		sp.take_screenshot("C:\\Users\\Lenovo\\eclipse-workspace\\DEMOCROSSWORD\\src\\test\\resources\\screenshots\\continue shoping.png");
		LOG.info("continue shopping clicked");
	   
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
