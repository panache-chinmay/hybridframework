package com.qa.crm.testcases;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.pages.ContactsPage;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;
import com.qa.crm.pages.TasksPage;
import com.qa.crm.testbase.TestBase;
import com.qa.crm.testutil.TestUtil;

public class HomePageTest extends TestBase {
	
		
	
	TestUtil testUtil;
	ContactsPage contactPage;
	HomePage homePage;
	LoginPage loginPage;
	TasksPage taskPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() throws FileNotFoundException {
		Intializtion();
		loginPage = new LoginPage();
		contactPage = new ContactsPage();
		testUtil = new TestUtil();
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	@Test(priority=1)
	public void VerifyUsername() {
		testUtil.SwitchtoMainFrame();
		Assert.assertTrue(homePage.Verifyusername());

	}
	@Test(priority=2)
	public void VerifyPageTitle() {
		String title = homePage.VerifyTitle();
		Assert.assertEquals(title, "CRMPRO","Home page title not matched");
	}
	@Test(priority=3)
	public void VerifyContactsLink() throws FileNotFoundException {
		testUtil.SwitchtoMainFrame();
		contactPage = homePage.ClickonContacts();
	}
	
	@AfterMethod
	public void TearDown() {
		driver.close();
	}
	
	
 
}
