package com.ebay.test;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.ebay.pages.EBayArticlePage;
import com.ebay.pages.EBayHomePage;
import com.ebay.pages.EBaySearchResultsPage;

import helpers.Properties;

public class EbayTestBasePOM {	
	protected WebDriver driver = null;
	protected EBayArticlePage eArticlesPage;
	protected EBayHomePage eHomePage;
	protected EBaySearchResultsPage eSearchResultsPage;
	
	@Before
	public void setUp() {		
			ChromeOptions ops = new ChromeOptions();
	        ops.addArguments("--disable-notifications");
			System.setProperty(Properties.CHROME_DRIVER_NAME, Properties.CHROME_DRIVER_LOCATION);
		    driver = new ChromeDriver(ops);			
		    driver.get(Properties.MAIN_URL);
		    
		    eArticlesPage = new EBayArticlePage(driver);
		    eHomePage = new EBayHomePage(driver);
		    eSearchResultsPage = new EBaySearchResultsPage(driver);
	}
}
