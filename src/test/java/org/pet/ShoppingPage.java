package org.pet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class ShoppingPage extends BaseClass {
 
	public ShoppingPage() {
 PageFactory.initElements(driver,this);
 }
 
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement txtQuantity;
	
	@FindBy(xpath="//a[text()='Proceed to Checkout']")
	private WebElement btnProceed;

	public WebElement getTxtQuantity() {
		return txtQuantity;
	}

	public WebElement getBtnProceed() {
		return btnProceed;
	}
	
	
}
