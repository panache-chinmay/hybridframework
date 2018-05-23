package com.qa.crm.testcases;
//import java.io.FileNotFoundException;
//import java.io.IOException;

import java.io.FileNotFoundException;

//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
//import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;
import com.qa.crm.testbase.TestBase;

public class LoginPageTest extends TestBase{
	
	//WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	
public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		Intializtion();
		loginPage = new LoginPage();
	}
	
	@Test(priority = 3)
	public void verifyPagetitle() {
		String title = loginPage.VerifyTitle();
		Assert.assertEquals(title, "Free CRM software in the cloud powers sales and customer service");
	}
	
	@Test(priority = 2)
	public void LogoDisplayed() {
		boolean flag =loginPage.CrmLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 1)
	public void LoginTest() throws FileNotFoundException{
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		
	}
	

}
