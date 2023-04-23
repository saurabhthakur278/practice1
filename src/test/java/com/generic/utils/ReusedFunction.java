package com.generic.utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReusedFunction {
	
	
	public void clickOnEle(By element, WebDriver driver) {
		driver.findElement(element).click();
	}
	
	public void sendKeysOnEle(By element, String text, WebDriver driver) {
		WebElement ele = driver.findElement(element);
		ele.sendKeys(text);
	}
	
	public List<String> listOfEle(By element, WebDriver driver) {
		List<WebElement> links = driver.findElements(element);
		List<String> addList = new ArrayList<String>();
		for(int i =0; i<=links.size()-1; i++) {
			addList.add(links.get(i).getText());
		}
		return addList;
	}
}
