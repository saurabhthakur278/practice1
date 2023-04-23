package com.hrm.test;

import org.testng.annotations.Test;

import com.hrm.pages.HomePage;

public class HomePageTest {
	
	HomePage hp =new HomePage();
	
	@Test(priority = 3)
	public void homePageVerifivationTest() {
		String[] list = {"Assign Leave", "Leave List", "Timesheets","Apply Leave", "My Leave", "My Timesheet"};
		hp.homePageVerification();
	}

}
