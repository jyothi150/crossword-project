package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Logout_page{
WebDriver driver;
Login_page mylogin;
public Logout_page (WebDriver driver)
{
	this.driver=driver;
}
By Logout=By.linkText("Logout");


public void Logout()
{
	driver.findElement(Logout).click();
}






}
