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

/**
 * @author Lenovo
 *
 */
public class CheckOutPageTest extends BaseClass{
	
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
	public void checkOutTest() {
		IndexPage indexPage=new IndexPage();
		loginPage=indexPage.clickOnHelloSignInBtn();
		homePage=loginPage.clickOnLogin(prop.getProperty("email"), prop.getProperty("password"));
		searchReasultPage=homePage.searchBox("iphone 12");
		addToCartPage=searchReasultPage.selectProduct();
		checkOutPage=addToCartPage.clickOnAddToCart();
		loginPage=checkOutPage.clickOnCheckOut();
		
	}

}
