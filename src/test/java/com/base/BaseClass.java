package com.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.hrm.pages.hrmLoginPage;
import com.hrm.test.hrmLoginTest;

public class BaseClass {
	WebDriver driver =null;
	@BeforeSuite
	public void getDriver() {
		hrmLoginPage hm = new hrmLoginPage();
		driver=hm.setup();
	}
	
	
	@AfterSuite
	public void tearDown() {
		//driver.close();
	}

}
