package org.pet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class ProductIdName extends BaseClass{
	
	public ProductIdName() {
PageFactory.initElements(driver, this);
}

	@FindBy(xpath="(//a[contains(text(),'FI-SW-')])[1]")
	private WebElement btnAngel;

	public WebElement getBtnAngel() {
		return btnAngel;
	}
	
	
}
