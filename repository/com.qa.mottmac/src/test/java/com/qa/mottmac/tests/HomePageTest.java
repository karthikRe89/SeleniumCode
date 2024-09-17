package com.qa.mottmac.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.mottmac.pages.AdvisoryPage;
import com.qa.mottmac.pages.ContactPage;
import com.qa.mottmac.pages.DigitalPage;
import com.qa.mottmac.pages.HomePage;


public class HomePageTest extends BaseTest{
	
  public static final String expectedTitle="Global engineering, management and development consultants - Mott MacDonald";
  public static final String THANK_YOU_MESSAGE="Thank you.";
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		try {
		String title = page.getInstance(HomePage.class).getHomePageTitle();
		System.out.println("login page title is: "+ title);
		Assert.assertEquals(title,expectedTitle);
		page.getInstance(HomePage.class).clickOnDigitalBtn();
		page.getInstance(DigitalPage.class).clickOnAdvisoryBtn();
		page.getInstance(AdvisoryPage.class).clickOnContactBtn();
		page.getInstance(ContactPage.class).enterAndSubmitContactForm("Karthik", "s","karthikeyan@gmail.com");
		String thankYouMsg = page.getInstance(ContactPage.class).getThankYouMsg();
		Assert.assertEquals(thankYouMsg,THANK_YOU_MESSAGE);
		
		} catch (Exception e) {
			e.printStackTrace();
		}				
	}
}
