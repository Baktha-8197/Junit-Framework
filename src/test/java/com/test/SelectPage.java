package com.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;


public class SelectPage extends BaseClass{

	public SelectPage() {
PageFactory.initElements(driver, this);	}
	
@FindBy(xpath="//input[contains(@id,'radiobutton_')]")
private WebElement radioBtnSelect;

@FindBy(id="continue")
private WebElement btnContinue;

public WebElement getRadioBtnSelect() {
	return radioBtnSelect;
}

public WebElement getBtnContinue() {
	return btnContinue;
}


}

