package com.amazon.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.actiondriver.Action;
import com.amazon.base.BaseClass;

public class AddToCartPage extends BaseClass{
	
	@FindBy(xpath="//*[@id='color_name_4']")
	WebElement productColour;
	
	@FindBy(xpath="//*[@id='size_name_2']/span")
	WebElement productSize;
	
	@FindBy(name="offeringID.1")
	WebElement checkBox;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addToCartBtn;
	
	public AddToCartPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void selectColour() {
		Action.click(getDriver(), productColour);
	}
	
	public void selectSize() {
		Action.click(getDriver(), productSize);
	}
	
	public void clickOnCheckBox() {
		Action.click(getDriver(), checkBox);
		
	}
	 
	public CheckOutPage clickOnAddToCart() {
		Action.click(getDriver(), addToCartBtn);
		return new CheckOutPage();
	}
	

}
