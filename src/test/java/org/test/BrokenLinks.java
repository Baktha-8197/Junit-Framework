package org.test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrokenLinks extends BaseClass{
@BeforeClass
public static void browserLaunch() {
	getDriver();
	launchUrl("https://www.facebook.com/");
}
@AfterClass
public static void close() {
	driver.quit();
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
@Test
public void brokenLinks() throws IOException {
	
	List<WebElement> link = driver.findElements(By.tagName("a"));
	int size = link.size();
	System.out.println(size);
	int a=0;
	for (int i = 0; i < size; i++) {
		WebElement element = link.get(i);
		String attribute = element.getAttribute("href");
		if(attribute!=null) {
			URL url=new URL(attribute);
			URLConnection openConnection = url.openConnection();
			HttpsURLConnection connection=(HttpsURLConnection) openConnection;
			int responseCode = connection.getResponseCode();
			if(responseCode!=200) {
				System.out.println("Broken links :"+attribute);
				a++;
			}
		}
	}
	System.out.println("Total broken links are" +a);
}
}
