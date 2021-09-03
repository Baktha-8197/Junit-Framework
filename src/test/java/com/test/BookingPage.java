package com.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.test.BaseClass;

public class BookingPage extends BaseClass{

	public BookingPage() {
PageFactory.initElements(driver,this);	}
	
	@FindBy(id="first_name")
	private WebElement txtFirstname;
	
	@FindBy(id="last_name")
	private WebElement txtLastname;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCcNo;
	
	@FindBy(id="cc_type")
	private WebElement dDnCcType;
	
	@FindBy(id="cc_exp_month")
	private WebElement dDnExpMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement dDnExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCvvNo;
	
	@FindBy(id="book_now")
	private WebElement btnBook;

	public WebElement getTxtFirstname() {
		return txtFirstname;
	}

	public WebElement getTxtLastname() {
		return txtLastname;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCcNo() {
		return txtCcNo;
	}

	public WebElement getdDnCcType() {
		return dDnCcType;
	}

	public WebElement getdDnExpMonth() {
		return dDnExpMonth;
	}

	public WebElement getdDnExpYear() {
		return dDnExpYear;
	}

	public WebElement getTxtCvvNo() {
		return txtCvvNo;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}
	
	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement text;
	
	public WebElement getText() {
		return text;
	}
}
