package com.qa.crm.testutil;

import com.qa.crm.testbase.TestBase;

public class TestUtil extends  TestBase {
	 
	public static long PAGE_LOAD_TIMEOUT = 100;
	public static long IMPLICIT_WAIT = 50;
	
	
	public void SwitchtoMainFrame() {
		driver.switchTo().frame("mainpanel");
	}

}
