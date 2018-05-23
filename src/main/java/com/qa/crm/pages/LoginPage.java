package com.qa.crm.pages;

import java.io.FileNotFoundException;

//import java.io.FileNotFoundException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.crm.testbase.TestBase;

public class LoginPage extends TestBase {
	
	// page factory or object repository 
	
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//img[contains(@class, 'img-responsive')]")
	WebElement CmrLogo ;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement Signup ;
	
	@FindBy(xpath="//input[@type ='submit']")
	WebElement LoginButton ;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public String VerifyTitle() {
		return driver.getTitle();	
	}
	
	public boolean CrmLogo() {
		return CmrLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) throws FileNotFoundException{
		username.sendKeys(un);
		password.sendKeys(pwd);
		//loginBtn.click();
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", LoginButton);
		    	
		    	
		return new HomePage();
	}
	

}
