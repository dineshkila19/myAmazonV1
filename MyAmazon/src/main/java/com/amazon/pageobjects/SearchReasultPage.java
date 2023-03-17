package com.amazon.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.actiondriver.Action;
import com.amazon.base.BaseClass;

public class SearchReasultPage extends BaseClass{
	
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")
	WebElement iphone12PurpleImg;
	
	public SearchReasultPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public AddToCartPage selectProduct() {
		Action.click(getDriver(), iphone12PurpleImg);
		
		return new AddToCartPage();
		
	}
	
	
	
	
	

}
