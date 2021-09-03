package org.pet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class HomePage extends BaseClass{
public HomePage() {
PageFactory.initElements(driver, this);
}
@FindBy(xpath="//img[@src='../images/fish_icon.gif']")
private WebElement btnimgFish;
public WebElement getBtnimgFish() {
	return btnimgFish;
}

}
