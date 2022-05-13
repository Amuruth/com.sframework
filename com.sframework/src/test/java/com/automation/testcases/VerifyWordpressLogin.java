/**
 * 
 */
package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.automation.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;

/**
 * @author jjamr
 *
 */
public class VerifyWordpressLogin {
	//creating method
	@Test
	public void verifyValidLogin()
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://login.wordpress.org/");
		
		//creating object for loginPage class
		LoginPage login = new LoginPage(driver);
		
		login.typeUserName("admin");
		
		login.typePasswrod("demo123");
		
		login.clickOnLoginButton();
		
		driver.quit();
		
	}

}
