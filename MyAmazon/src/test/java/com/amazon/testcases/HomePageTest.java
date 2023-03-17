/**
 * 
 */
package com.amazon.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.BaseClass;
import com.amazon.pageobjects.HomePage;
import com.amazon.pageobjects.IndexPage;
import com.amazon.pageobjects.LoginPage;
import com.amazon.pageobjects.SearchReasultPage;
import com.amazon.utility.Log;

/**
 * @author Lenovo
 *
 */
public class HomePageTest extends BaseClass{
	
	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;
	SearchReasultPage searchReasultPage;
	
	@BeforeMethod
	public void setUp() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test
	public void verifyHelloAddress() {
		Log.startTestCase("verifyHelloAddress");
		IndexPage indexPage=new IndexPage();
		loginPage=indexPage.clickOnHelloSignInBtn();
		homePage=loginPage.clickOnLogin(prop.getProperty("email"), prop.getProperty("password"));
		boolean reasult=homePage.validateHelloAddress();
		Assert.assertTrue(reasult);
		Log.info("verifyHelloAddress TestCase is passed");
		Log.endTestCase("verifyHelloAddress");
	}
	
	@Test
	public void productSearchTest() {
		Log.startTestCase("productSearchTest");
		IndexPage indexPage=new IndexPage();
		loginPage=indexPage.clickOnHelloSignInBtn();
		homePage=loginPage.clickOnLogin(prop.getProperty("email"), prop.getProperty("password"));
		searchReasultPage=homePage.searchBox("iphone 12");
		Log.info("productSearchTest");
		Log.endTestCase("productSearchTest");
	}
	

}
