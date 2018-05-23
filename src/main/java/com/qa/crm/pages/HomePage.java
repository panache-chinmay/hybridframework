package com.qa.crm.pages;

import java.io.FileNotFoundException;

//import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.testbase.TestBase;

public class HomePage extends TestBase  {

	
	@FindBy(xpath="//td[@class ='headertext' and @align ='left']")
	WebElement loginun;
	
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement ContactsLink;
	
	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement DealsLink;
	
	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement TasksLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyTitle() {
		return driver.getTitle();
	}
	
	public boolean Verifyusername() {
		return loginun.isDisplayed();
	}
	
	public ContactsPage ClickonContacts() throws FileNotFoundException {
		 ContactsLink.click();
		 return new ContactsPage();
	}
	
	public  DealsPage ClickonDeals() throws FileNotFoundException {
			DealsLink.click();
		 return new DealsPage();
	}
	public TasksPage ClickonTask() throws FileNotFoundException {
		 TasksLink.click();
		 return new TasksPage();
	}

}
