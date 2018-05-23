package com.qa.crm.testcases;

import java.io.FileNotFoundException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.pages.ContactsPage;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;
import com.qa.crm.pages.TasksPage;
import com.qa.crm.testbase.TestBase;
import com.qa.crm.testutil.TestUtil;

public class ContactsPageTest extends TestBase{
	
		TestUtil testUtil;
		ContactsPage contactPage;
		HomePage homePage;
		LoginPage loginPage;
		TasksPage taskPage;

			public ContactsPageTest() {
				super();
			}
			
	@BeforeMethod
	public void SetUp() throws FileNotFoundException {
	Intializtion();
	loginPage = new LoginPage();
	contactPage = new ContactsPage();
	testUtil = new TestUtil();
	homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	testUtil.SwitchtoMainFrame();
	contactPage = homePage.ClickonContacts();
		}
	
	@Test(priority = 1)
	public void VerifyContactsPageTest() {
		contactPage.verifyContactPage();
	}
	
	@Test(priority =2)
	public void ChecktheContactname() {
		contactPage.CheckConatctList("Ashwin sa");
	}
	
	@Test(priority =2)
	public void MutlipleChecktheContactname() {
		contactPage.CheckConatctList("Ashwin sa");
		contactPage.CheckConatctList("Ninad Dani");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
			
}