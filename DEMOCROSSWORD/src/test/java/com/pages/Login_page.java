package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page {
	WebDriver driver;
  By Login1 = By.xpath("//*[@id=\"hd\"]/div/div/div/div[1]/div/div[2]/div[1]/a[2]");
  
  By Username =By.name("user_session[email]");
  By pwd =By.id("user_session_password");
  By LOGINsubmit =By.xpath("//*[@id=\"user_session_submit\"]");
  
  	public Login_page(WebDriver driver) {
  		this.driver=driver;
}
	
  public void login()
  {
	  driver.findElement(Login1).click();
  }
  public void login_details(String username , String password)
  {
	  driver.findElement(Username).sendKeys(username);
	  driver.findElement(pwd).sendKeys(password);
  }
  public void submit()
  {
	  driver.findElement(LOGINsubmit).click();
  }
 

}