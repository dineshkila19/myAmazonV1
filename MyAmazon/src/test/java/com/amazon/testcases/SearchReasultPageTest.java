/**
 * 
 */
package com.amazon.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.BaseClass;
import com.amazon.pageobjects.AddToCartPage;
import com.amazon.pageobjects.HomePage;
import com.amazon.pageobjects.IndexPage;
import com.amazon.pageobjects.LoginPage;
import com.amazon.pageobjects.SearchReasultPage;
import com.amazon.utility.Log;

/**
 * @author Lenovo
 *
 */
public class SearchReasultPageTest extends BaseClass{
	
	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;
	SearchReasultPage searchReasultPage;
	AddToCartPage addToCartPage;
	
	@BeforeMethod
	public void setUp() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test
	public void selectProductTest() {
		Log.startTestCase("selectProductTest");
		IndexPage indexPage=new IndexPage();
		loginPage=indexPage.clickOnHelloSignInBtn();
		homePage=loginPage.clickOnLogin(prop.getProperty("email"), prop.getProperty("password"));
		Log.info("user is successfully entered email and password");
		searchReasultPage=homePage.searchBox("iphone 12");
		Log.info("user enter the product name like IPHONE 12");
		addToCartPage=searchReasultPage.selectProduct();
		Log.info("selectProductTest TestCase is PASSED");
		Log.endTestCase("selectProductTest");
	}
	
	
	
	

}
