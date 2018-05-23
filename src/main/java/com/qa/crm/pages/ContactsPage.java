package com.qa.crm.pages;

import org.openqa.selenium.By;

//import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.testbase.TestBase;

public class ContactsPage extends TestBase  {

		@FindBy(xpath="//td[contains(text(),'Contacts')]")
		WebElement VerifyContactPage;
		
		
		public ContactsPage() {
			PageFactory.initElements(driver, this);	
		}
		
		
		public boolean verifyContactPage() {
			return VerifyContactPage.isDisplayed();
		}
		
		public void CheckConatctList( String username) {
			driver.findElement(By.xpath("//a[text()='"+username+"']//parent::td[@class='datalistrow']"
					+ "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
			}
		
		
		
	}


