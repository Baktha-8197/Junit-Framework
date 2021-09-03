package org.pet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class PaymentPage extends BaseClass {

	public PaymentPage() {
PageFactory.initElements(driver, this);	}
	
	@FindBy(xpath="//input[@name='shippingAddressRequired']")
	private WebElement btnCkeckBox;
	
	@FindBy(xpath="//input[@name='newOrder']")
	private WebElement btnContinue;
	
	@FindBy(xpath="//input[@name='newOrder']")
	private WebElement btnContinue1;
	
	@FindBy(xpath="//a[text()='Confirm']")
	private WebElement btnConfirm;
	
	@FindBy(xpath="//th[@align='center']")
	private WebElement printOrderNo;

	public WebElement getPrintOrderNo() {
		return printOrderNo;
	}

	public WebElement getBtnCkeckBox() {
		return btnCkeckBox;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getBtnContinue1() {
		return btnContinue1;
	}

	public WebElement getBtnConfirm() {
		return btnConfirm;
	}
	
}
