/**
 * 
 */
package com.amazon.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.BaseClass;
import com.amazon.pageobjects.IndexPage;
import com.amazon.utility.Log;

import junit.framework.Assert;

/**
 * @author Lenovo
 *
 */
public class IndexPageTest extends BaseClass{
	IndexPage indexPage;
	@BeforeMethod
	public void setUp() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test
	public void verifyMyAmazonLogo() {
		Log.startTestCase("verifyMyAmazonLogo");
		IndexPage indexPage=new IndexPage();
		boolean reasult=indexPage.validateMyLogo();
		Assert.assertTrue(reasult);
		Log.info("verifyMyAmazonLogo testcase is passed");
		Log.endTestCase("verifyMyAmazonLogo");
	}
	
	@Test
	public void getAmazonTitle() {
		Log.startTestCase("getAmazonTitle");
		IndexPage indexPage=new IndexPage();
		String actTitle=indexPage.getTitle();
		String expTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(actTitle, expTitle);
		Log.info("getAmazonTitle testcase is passed");
		Log.endTestCase("getAmazonTitle");
	}
	

}
