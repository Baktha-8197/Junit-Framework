package org.test;



import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.test.BookingPage;
import com.test.LoginPage;
import com.test.OrderId;
import com.test.SearchPage;
import com.test.SelectPage;


public class Junit1 extends BaseClass{

	//LoginPage
	@AfterClass
	public static void close() {
    driver.quit();
	}
	@BeforeClass
	public static void begin() {
    getDriver();
    launchUrl("https://adactinhotelapp.com/");
    }
	@After
	public void afterTime() {
    Date date=new Date();
    System.out.println(date);
	}
	@Before
	public void beforeTime() {
		Date date=new Date();
		System.out.println(date);
	}
	@Test
	public void test1() throws IOException {
		LoginPage lp=new LoginPage();
	  
	enterText(lp.getTxtUsername(),getDataFromExcel("C:\\Users\\ELCOT\\eclipse-workspace\\JUNITFrameWork\\TestData\\Adactin.xlsx", "Sheet1", 0, 0));
	enterText(lp.getTxtPassword(), getDataFromExcel("C:\\Users\\ELCOT\\eclipse-workspace\\JUNITFrameWork\\TestData\\Adactin.xlsx", "Sheet1", 0, 1)); 
	btnClick(lp.getBtnLogin());
	}
	
	
	@Test
	public void test2() throws IOException {
		SearchPage sp=new SearchPage();
		selectDropDown(sp.getdDnLocation(), "index", "1");
		selectDropDown(sp.getdDnHotels(), "index", "1");
		selectDropDown(sp.getdDnRoomType(), "index", "2");
		selectDropDown(sp.getdDnRoomNos(), "index", "1");
		enterText(sp.getTxtCheckInDate(),getDataFromExcel("C:\\Users\\ELCOT\\eclipse-workspace\\JUNITFrameWork\\TestData\\Adactin.xlsx", "Sheet1", 1, 0));
		enterText(sp.getTxtCheckOutDate(), getDataFromExcel("C:\\Users\\ELCOT\\eclipse-workspace\\JUNITFrameWork\\TestData\\Adactin.xlsx", "Sheet1", 2, 0));
		selectDropDown(sp.getdDnAdultRoom(), "index", "1");
		selectDropDown(sp.getdDnChildRoom(), "index", "3");
		btnClick(sp.getBtnSubmit());
	}
	@Test
	public void test3() {
		//SelectPage
		SelectPage sp1=new SelectPage();
		btnClick(sp1.getRadioBtnSelect());
		btnClick(sp1.getBtnContinue());
	}
	@Test
	public void test4() throws IOException {
		//BookingPage
		BookingPage bp=new BookingPage();
		enterText(bp.getTxtFirstname(), getDataFromExcel("C:\\Users\\ELCOT\\eclipse-workspace\\JUNITFrameWork\\TestData\\Adactin.xlsx", "Sheet1", 0, 0));
	    enterText(bp.getTxtLastname(), getDataFromExcel("C:\\Users\\ELCOT\\eclipse-workspace\\JUNITFrameWork\\TestData\\Adactin.xlsx", "Sheet1", 3, 0));
	    enterText(bp.getTxtAddress(),getDataFromExcel("C:\\Users\\ELCOT\\eclipse-workspace\\JUNITFrameWork\\TestData\\Adactin.xlsx", "Sheet1", 4, 0));
	    enterText(bp.getTxtCcNo(), getDataFromExcel("C:\\Users\\ELCOT\\eclipse-workspace\\JUNITFrameWork\\TestData\\Adactin.xlsx", "Sheet1", 5, 0));
	    enterText(bp.getTxtCvvNo(), getDataFromExcel("C:\\Users\\ELCOT\\eclipse-workspace\\JUNITFrameWork\\TestData\\Adactin.xlsx", "Sheet1", 6, 0));
	    selectDropDown(bp.getdDnCcType(),"index","2");
	    selectDropDown(bp.getdDnExpMonth(),"index","3");
	    selectDropDown(bp.getdDnExpYear(),"index","2");
	    btnClick(bp.getBtnBook());
	}
	@Test
	public void test5() throws IOException {
		//printing order no
		implicitWait();
		OrderId oi=new OrderId();
		String attribute = oi.getPrintOrderNo().getAttribute("value");
		System.out.println(attribute);
		insertDataToExcel("C:\\Users\\ELCOT\\eclipse-workspace\\JUNITFrameWork\\TestData\\Adactin.xlsx", "Sheet2", 0, 1, attribute);
	}
	}

