package org.pet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class CredentialPage extends BaseClass{
	
public CredentialPage() {
PageFactory.initElements(driver, this);
}

@FindBy(name="username")
private WebElement txtUsername;

@FindBy(name="password")
private WebElement txtPassword;

@FindBy(name="signon")
private WebElement btnSign;

public WebElement getTxtUsername() {
	return txtUsername;
}

public WebElement getTxtPassword() {
	return txtPassword;
}

public WebElement getBtnSign() {
	return btnSign;
}

}
