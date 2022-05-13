package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
		
	@FindBy(name="user-name")WebElement uname;
	
	@FindBy(name="password")WebElement pass;
	
	@FindBy(xpath="//input[@id='login-button']")WebElement loginButton;
	
	
	public void loginToCRM(String usernameApplication,String passwordApplication)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			//e.printStackTrace();
		}
		{
			
		}
		
		uname.sendKeys(usernameApplication);
		pass.sendKeys(passwordApplication);
		loginButton.click();
		
	}
}
