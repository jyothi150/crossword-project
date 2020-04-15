package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Help_page {

	WebDriver driver;
	Login_page mylogin;
	public Help_page(WebDriver driver)
	{
		this.driver=driver;
	}
	 By Help=By.linkText("Help");
	 By Faqs=By.xpath("//*[@id=\"content-slot\"]/div[2]/div/div/div/div/div[1]/a");
	 
	 public void Help()
	 {
		 driver.findElement(Help).click();
	 }
	 public void Faqs()
	 {
		 driver.findElement(Faqs).click();
	 }
	 
	 
	 

	

}
