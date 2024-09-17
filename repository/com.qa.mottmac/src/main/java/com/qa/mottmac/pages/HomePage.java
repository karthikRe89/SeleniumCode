package com.qa.mottmac.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	//page locators:
	By DigitalButton = By.xpath("//li[@class='menuLink ']//*[contains(@href,'mottmac.com/digital')]");

	
	//page actions:
	public String getHomePageTitle(){
		return driver.getTitle();
	}
	
	public void clickOnDigitalBtn(){
		
		doClick(DigitalButton);
		
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	

}
