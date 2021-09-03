package com.test;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.test.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
PageFactory.initElements(driver, this);
	}
	
@FindBy(id="username")
private WebElement txtUsername;

@FindBy(id="password")
private WebElement txtPassword;

@FindBy(name="login")
private WebElement btnLogin;

public WebElement getTxtUsername() {
	return txtUsername;
}

public WebElement getTxtPassword() {
	return txtPassword;
}

public WebElement getBtnLogin() {
	return btnLogin;
}


}
