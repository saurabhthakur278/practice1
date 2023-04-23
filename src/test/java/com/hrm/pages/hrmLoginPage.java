package com.hrm.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import com.generic.utils.ReusedFunction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hrmLoginPage {

	
	private By uname=By.xpath("//input[@id='txtUsername']");
	private By pass=By.xpath("//input[@id='txtPassword']");
	private By login=By.xpath("//input[@id='btnLogin']");
	private By quickLinks = By.cssSelector("div[class='quickLaunge'] span");
	
	WebDriver driver=null;
	
	ReusedFunction util = new ReusedFunction();
	SoftAssert Sa = new SoftAssert();
	
	public WebDriver setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

	
	public void login(String userName,String passWord) {
		util.sendKeysOnEle(uname, userName, driver);
		util.sendKeysOnEle(pass, passWord, driver);
		util.clickOnEle(login, driver);
		
	}
	
	public void homePageVerification() {
		//Quick Lounch Verification
		String[] list = {"Assign Leave", "Leave ", "Timesheets","Apply Leave", "My Leave", "My Timesheet"};
		List<String> quickText = util.listOfEle(quickLinks, driver);
		System.out.println(quickText);
	}

}
