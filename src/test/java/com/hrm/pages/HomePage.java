package com.hrm.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import com.generic.utils.ReusedFunction;

public class HomePage extends hrmLoginPage {
	
	private By quickLinks = By.cssSelector("div[class='quickLaunge'] span");
	
	
	ReusedFunction util = new ReusedFunction();
	SoftAssert Sa = new SoftAssert();
	
	public void homePageVerification() {
		//Quick Lounch Verification
		List<String> quickText = util.listOfEle(quickLinks, driver);
		System.out.println(quickText);
		
		
	}

}
