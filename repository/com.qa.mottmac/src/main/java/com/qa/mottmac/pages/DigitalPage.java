package com.qa.mottmac.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DigitalPage extends BasePage{

	public DigitalPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	//page locators:
	By AdvisoryButton = By.xpath("//a[@class='b-digital-btn blue no-margin-top']");

	
	//page actions:	
	public void clickOnAdvisoryBtn(){
					
		try {
			doClick(AdvisoryButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	

}
