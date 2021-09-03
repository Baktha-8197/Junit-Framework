package org.pet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class PricePage extends BaseClass{

	public PricePage() {
PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text()='Add to Cart'])[1]")
	private WebElement btnAddToCart;

	public WebElement getBtnAddToCart() {
		return btnAddToCart;
	}
	
	
}
