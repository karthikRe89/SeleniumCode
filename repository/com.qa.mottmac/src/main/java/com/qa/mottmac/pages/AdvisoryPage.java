package com.qa.mottmac.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdvisoryPage extends BasePage{

	public AdvisoryPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	//page locators:
	By ContactButton = By.xpath("//div[@class='lf-row right lf-end']//a[2]");

	
	//page actions:	
	public void clickOnContactBtn(){				
		try {
			doClick(ContactButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	

}
