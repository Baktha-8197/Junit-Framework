package org.pet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class FrontPage extends BaseClass{
public FrontPage() {
PageFactory.initElements(driver, this);
}

@FindBy(xpath="//a[text()='Enter the Store']")
private WebElement btnEnter;

public WebElement getBtnEnter() {
	return btnEnter;
}

}
