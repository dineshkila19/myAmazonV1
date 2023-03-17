/**
 * 
 */
package com.amazon.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.actiondriver.Action;
import com.amazon.base.BaseClass;

/**
 * @author Dinesh
 *
 */
public class CheckOutPage extends BaseClass{
	
	@FindBy(xpath="//*[@id='attach-added-to-cart-message']/div/div[2]/div[3]/span/span/input")
	WebElement proceedToCheckOutBtn;
	
	public CheckOutPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public LoginPage clickOnCheckOut() {
		Action.click(getDriver(), proceedToCheckOutBtn);
		return new LoginPage();
		
	}
	
	
	

}
