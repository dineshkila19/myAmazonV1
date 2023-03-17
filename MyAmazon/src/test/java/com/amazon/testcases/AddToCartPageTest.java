/**
 * 
 */
package com.amazon.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.BaseClass;
import com.amazon.pageobjects.AddToCartPage;
import com.amazon.pageobjects.CheckOutPage;
import com.amazon.pageobjects.HomePage;
import com.amazon.pageobjects.IndexPage;
import com.amazon.pageobjects.LoginPage;
import com.amazon.pageobjects.SearchReasultPage;
import com.amazon.utility.Log;

/**
 * @author Dinesh
 *
 */
public class AddToCartPageTest extends BaseClass{
	
	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;
	SearchReasultPage searchReasultPage;
	AddToCartPage addToCartPage;
	CheckOutPage checkOutPage;
	
	@BeforeMethod
	public void setUp() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test
	public void addToCartTest() throws InterruptedException {
		Log.startTestCase("addToCartTest");
		IndexPage indexPage=new IndexPage();
		loginPage=indexPage.clickOnHelloSignInBtn();
		Log.info("User is successfully clickOn the signin ");
		homePage=loginPage.clickOnLogin(prop.getProperty("email"), prop.getProperty("password"));
		Log.info("User secessfully enter email and password");
		searchReasultPage=homePage.searchBox("iphone 12");
		Log.info("user entered iphone 12");
		addToCartPage=searchReasultPage.selectProduct();
		Log.info("user successfully select the product");
		Thread.sleep(3000);
		addToCartPage.clickOnCheckBox();
		Log.info("user successfully click the CheckBox");
		checkOutPage=addToCartPage.clickOnAddToCart();
		Log.info("User clicked the addtocart ");
		Log.info("addToCartTest TestCase is PASSED");
		Log.endTestCase("addToCartTest");
	}
	

}
