package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Library {

protected WebDriver driver;
   
public void launch() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\DEMOCROSSWORD\\src\\test\\resources\\drivers\\chromedriver.exe");
	driver =new ChromeDriver();
	//driver.manage().window().maximize();//maximizing the window
	//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);//implicitily waiting for driver
	
	driver.get("http://www.crossword.in");
	
	
	
}

public void quit()
{
	//closing the driver
	driver.close();
}
	
}
