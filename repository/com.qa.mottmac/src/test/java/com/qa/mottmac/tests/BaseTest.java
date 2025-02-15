package com.qa.mottmac.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.mottmac.pages.Page;


public class BaseTest {

	public WebDriver driver;
	public WebDriverWait wait;
	public Page page;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthik\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	    wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.get("https://www.mottmac.com/");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// create the object of page class: Instantiate Page Class
		page = new Page(driver, wait);
	}

	@AfterMethod
	public void tearDown() {
		if(driver!=null)
		{
			driver.quit();
		}
		
	}

}
