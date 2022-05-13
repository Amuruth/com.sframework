/**
 * 
 */
package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author jjamr
 *This class will store all the locators and methods of login page
 */
public class LoginPage {
	
	//local variable
	WebDriver driver;
	
	By username= By.id("user-name");
	By password= By.xpath("//*[@id=\"user_pass\"]");
	By loginButton= By.name("wp-submit");	

// this is new commit from Amuruth
public LoginPage(WebDriver ldriver)//creating constructor with class name
{
	this.driver=ldriver;
	
}

public void loginToWrodpress(String userid, String pass)
{
	driver.findElement(username).sendKeys(userid);
	driver.findElement(password).sendKeys(pass);
	driver.findElement(loginButton).click();
	
}
//create 3 meaningful methods and parameterized
public void typeUserName(String uid)
{
	driver.findElement(username).sendKeys(uid);
}

public void typePasswrod(String pass)
{
	driver.findElement(password).sendKeys(pass);
}

public void clickOnLoginButton()
{
	driver.findElement(loginButton).click();
}

}