package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Mycart_page
{
	WebDriver driver;
	Login_page mylogin;
	public Mycart_page(WebDriver driver)
	{
		this.driver=driver;
	}
  //By cart=By.xpath("//*[@id=\"hd\"]/div/div/div[2]/div[1]/div/div[2]/div[1]/a[3]");
 // By continueshop=By.xpath("//*[@id=\"shopping-cart-items\"]/div/div/a");
  
 
  
  public void Mycart_button() 
  {
	  driver.findElement(By.linkText("MY CART")).click();
	  
  }
  public void continueshop()
  {
	  driver.findElement(By.xpath("//*[@id=\"shopping-cart-items\"]/div/div/a")).click();
  }
	
		

	}


