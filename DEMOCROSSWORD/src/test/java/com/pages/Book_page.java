package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Book_page {
	WebDriver driver;
	Login_page mylogin;
	public Book_page(WebDriver driver)
	{
		this.driver=driver;
	}

	/*
	 * public void dologin(String username, String password) throws Throwable {
	 * mylogin = new Login_page(driver); mylogin.login();
	 * mylogin.login_details(username, password); mylogin.submit();
	 * 
	 * }
	 */
	
	public void books_button() {
		driver.findElement(By.linkText("Books")).click();
		
	}
	
	public void quick_view()  
	{
		
		driver.findElement(By.xpath("//*[@id=\"search-result-items\"]/li/div/div[2]/span[1]/a")).click();
	
	}
}
