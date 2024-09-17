package com.qa.mottmac.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ContactPage extends BasePage{

	public ContactPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	//page locators:	
	By FirstNameFld = By.xpath("//input[@id='firstname*43']");
	By SurNameFld = By.xpath("//input[@id='surname*43']");
	By EmailFld = By.xpath("//input[@id='email*43']");
	By SubmitBtn = By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/main[1]/section[2]/div[1]/div[1]/form[1]/div[3]/button[1]");
	By ThankYouMsg = By.xpath("//div[@id='message_c88b']");
	
	//page actions:		
	public void enterAndSubmitContactForm(String firstName,String surName,String email){
						
		try {
			doSendKeys(FirstNameFld,firstName);
			doSendKeys(SurNameFld,surName);
			doSendKeys(EmailFld,email);
			doClick(SubmitBtn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String getThankYouMsg(){
			
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(ThankYouMsg));
				String Message=doGetText(ThankYouMsg);
				return Message;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}
}
