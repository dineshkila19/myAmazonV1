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
import com.amazon.utility.Log;

/**
 * @author Dinesh
 *
 */
public class LoginPageTest extends BaseClass{
	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;
	
	@BeforeMethod
	public void setUp() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test
	public void LoginTest(){
		Log.startTestCase("LoginTest");
		IndexPage indexPage=new IndexPage();
		loginPage=indexPage.clickOnHelloSignInBtn();
		homePage=loginPage.clickOnLogin(prop.getProperty("email"), prop.getProperty("password"));
		Log.info("user successfully entered email and password");
		String actURL=homePage.getCurrentUrl();
		Log.info("user gets the Actual URL");
		String curURL="https://www.amazon.in/ap/signin";
		Log.info("User gets the Current URL");
		Assert.assertEquals(actURL, curURL);
		Log.info("LoginTest TestCase is passed");
		Log.endTestCase("LoginTest");
	}
	
	

}
