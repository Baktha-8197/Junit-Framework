package org.test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pet.CredentialPage;
import org.pet.FrontPage;
import org.pet.HomePage;
import org.pet.PaymentPage;
import org.pet.PricePage;
import org.pet.ProductIdName;
import org.pet.ShoppingPage;

public class PetShop extends BaseClass {
@BeforeClass
public static void browserLaunch() {
   getDriver();
   launchUrl("https://petstore.octoperf.com/");
}
@AfterClass
public static void closeDriver() {
   close();
}
@Before
public  void BeforeEnterTime() {
Date date=new Date();
System.out.println(date);
}
@After
public void afterEnterTime() {
Date date=new Date();
System.out.println(date);
}
@Test
public void test1() {
//FrontPage
	FrontPage page1=new FrontPage();
	btnClick(page1.getBtnEnter());
		
}
@Test
public void test2() {
    //HomePage
	HomePage page2=new HomePage();
	btnClickJs(page2.getBtnimgFish());
	
	//ProductIdPage
	ProductIdName page3=new ProductIdName();
	btnClickJs(page3.getBtnAngel());
	
	//PricePage
	PricePage page4=new PricePage();
	btnClickJs(page4.getBtnAddToCart());
	
	//ShoppingPage
	ShoppingPage page5=new ShoppingPage();
	doubleClick(page5.getTxtQuantity());
	enterText(page5.getTxtQuantity(), "4");
	btnClick(page5.getBtnProceed());
	
	//CredentialPage
	CredentialPage page=new CredentialPage();
	enterText(page.getTxtUsername(), "Bakthavachalam");
	doubleClick(page.getTxtPassword());
	enterText(page.getTxtPassword(), "Sathiyavani@1");
	btnClick(page.getBtnSign());
	
	
	 //PaymentPage
	 implicitWait();
	
	
     btnClickJs(page2.getBtnimgFish());
	
	//ProductIdPage
	btnClickJs(page3.getBtnAngel());
	
	//PricePage

	btnClickJs(page4.getBtnAddToCart());
	
	//ShoppingPage

	doubleClick(page5.getTxtQuantity());
	enterText(page5.getTxtQuantity(), "4");
	btnClick(page5.getBtnProceed());
	
	
	PaymentPage page6=new PaymentPage();
	btnClick(page6.getBtnCkeckBox());
	btnClick(page6.getBtnContinue());
	btnClick(page6.getBtnContinue1());
	btnClick(page6.getBtnConfirm());
	String text = getText(page6.getPrintOrderNo());
	System.out.println(text);
	
	
	
}
}
