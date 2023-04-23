package com.hrm.test;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.hrm.pages.hrmLoginPage;

public class hrmLoginTest {

	hrmLoginPage hpage = new hrmLoginPage();
	SoftAssert sa = new SoftAssert();

	//@Test(priority = 1)
	public void loginApplication() {
		hpage.setup();
	}

	@Test(priority = 2)
	public void enterCredentials() {
		hpage.login("Admin", "admin123");
	}

	/*
	 * @Test(priority = 3) public void homePageVerifivationTest() {
	 * hpage.homePageVerification();
	 * 
	 * }
	 */
}
