package com.test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.test.BaseClass;

public class OrderId extends BaseClass {

public OrderId() {
PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@id='order_no']")
private WebElement printOrderNo;
public WebElement getPrintOrderNo() {
	return printOrderNo;
}


}
