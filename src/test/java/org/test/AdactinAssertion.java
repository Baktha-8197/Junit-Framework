package org.test;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinAssertion extends BaseClass{
	static WebDriver driver;
@BeforeClass
public static void browserlaunch() {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.get("https://adactinhotelapp.com/");
}


@Before
public void beforeEnterTime() {
	Date date=new Date();
	System.out.println(date);
}
@After
public void afterEnterTime() {
	Date date=new Date();
	System.out.println(date);
}
@AfterClass
public static void close() {
	driver.quit();
}
@Test
public void loginPage() throws IOException {
	String title = driver.getTitle();
	 boolean contains = title.contains("Adactin");
	 Assert.assertTrue(contains);
	 System.out.println("User in the Adactin home page ");
	 
	 LoginPage lp=new LoginPage();
	 driver.findElement(By.id("username")).sendKeys("Bakthavachalam");
	 
	 
	 String pageSource = driver.getPageSource();
	 System.out.println(pageSource);
	 //pageSource.contains(")
	 
	 System.out.println("Naan pollathavan ,poi sollathavan en nenjathil vanjangal  illkathavan"
	 		+ "kai thatti vai moodi pasangu pesathavan jumbu chicku jumbo");
	 System.out.println("unkooda naan serndhu irundhida enakku jenamam onnu podhuma nooru jenmam venum"
	 		+ "nooru jenmam venum atha kekkuran antha samiya ,podhuma,nooru jenmam namakku podhuma vera varam edhum keppama ssaga varam keppom antha samiya andha samiya "
	 		+ "");
	 
}
}
