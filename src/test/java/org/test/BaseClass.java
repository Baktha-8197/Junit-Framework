package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	
public static void getDriver() {//1
WebDriverManager.chromedriver().setup();
 driver=new ChromeDriver();
 driver.manage().window().maximize();
}

public  static void launchUrl(String value) {//2
     driver.get(value);
}

public static String getTitle() {//3
	String title = driver.getTitle();
	return title;
}


public static String currentUrl() {//4
	String url = driver.getCurrentUrl();
	return url;
}

public static  WebElement locators(String locator,String value) {//5
	WebElement element = null;
if (locator.equalsIgnoreCase("id")) {
	driver.findElement(By.id(value));
}else if (locator.equalsIgnoreCase("name")) {
	driver.findElement(By.name(value));
}else if (locator.equalsIgnoreCase("xpath")) {
	driver.findElement(By.xpath(value));
}else if(locator.equalsIgnoreCase("tagName")){
	driver.findElement(By.tagName(value));
}

return element;
}

public static  void enterText(WebElement element,String value) {//6
element.sendKeys(value);
}


public  static void btnClick(WebElement element) {//7
element.click();
}

public static String getText(WebElement element) {//8
	String text = element.getText();
	return text;
}

public static String getAttribute(WebElement element,String attributeValue) {//9
String attribute = element.getAttribute(attributeValue);
return attribute;
}

public static void moveToElement(WebElement element) {//10
Actions actions=new Actions(driver);
actions.moveToElement(element).perform();
}


public static void navigateTo(String url) {//11
	driver.navigate().to(url);
}

public static void navigateBack() {//12
	driver.navigate().back();
}

public static void refresh() {//13
	driver.navigate().refresh();
}


public static void navigateForward() {//14
driver.navigate().forward();
}


public static void dragAndDrop(WebElement s,WebElement d) {//15
Actions actions=new Actions(driver);
actions.dragAndDrop(s, d);
}

public static void rightClick(WebElement element) {//16
	Actions actions=new Actions(driver);
	actions.contextClick(element).perform();
	
}


public static void doubleClick(WebElement element) {//17
Actions actions=new Actions(driver);
actions.doubleClick(element).perform();
}

public static void acceptAlert() {//18
 Alert alert = driver.switchTo().alert();
 alert.accept();
}


public static void dismissAlert() {//19
	Alert alert = driver.switchTo().alert();
	alert.dismiss();
}

public static void enterTextAlert(String value) {//20
	Alert alert = driver.switchTo().alert();
	alert.sendKeys(value);
}

public static String getTextAlert() {//21
	Alert alert = driver.switchTo().alert();
	String text = alert.getText();
	return text;
}

public static void switchFrameId(String value) {//22
	driver.switchTo().frame(value);
}

public static void switchFrameName(String value) {//23
	driver.switchTo().frame(value);
}

public static void switchFrameIndex(int value) {//24
driver.switchTo().frame(value);
}

public static void switchFrameWebElement(WebElement element) {//25
	driver.switchTo().frame(element);
}

public static WebElement findFrame(String frame) {//26
WebElement element = driver.findElement(By.tagName(frame));
return element;
}

public static  void srollDown(WebElement element) {//27
JavascriptExecutor executor=(JavascriptExecutor) driver;
executor.executeScript("arguments[0].scrollIntoView(true)", element);
}

public static void scrollUp(WebElement element) {//28
	JavascriptExecutor executor=(JavascriptExecutor) driver;
	executor.executeScript("arguments[0].scrollIntoView(false)",element);
}


public static void enterTextJs(WebElement element,String value) {//29
	JavascriptExecutor executor=(JavascriptExecutor) driver;
	executor.executeScript("arguments[0].setAttribute('value','"+value+"')", element);
}


 public static void btnClickJs(WebElement element) {//30
JavascriptExecutor executor=(JavascriptExecutor) driver;
executor.executeScript("arguments[0].click()", element);
}
 
 
 public static Object getAttributejs(WebElement element) {//31
JavascriptExecutor executor=(JavascriptExecutor) driver;
Object executeScript = executor.executeScript("return arguments[0].getAttribute('value')",element);
return executeScript;
}
 
 public static void screenshot(String DesiredLocation) throws IOException {//32
	 TakesScreenshot screenshot=(TakesScreenshot) driver;
	 File s = screenshot.getScreenshotAs(OutputType.FILE);
	 File d=new File(DesiredLocation);
	 FileUtils.copyFile(s, d);
 }

public static void selectDropDown(WebElement element,String type,String value) {//33
Select select=new Select(element);
if (type.equalsIgnoreCase("index")) {
	select.selectByIndex(Integer.parseInt(value));
}else if (type.equalsIgnoreCase("value")) {
	select.selectByValue(value);
}else if (type.equalsIgnoreCase("VisibleText")) {
	select.selectByVisibleText(value);
}
}


public static String getAllOptions(WebElement element) {//34
Select select=new Select(element);
List<WebElement> alloptions = select.getOptions();
for(int i=0;i<alloptions.size();i++) {
	WebElement element2 = alloptions.get(i);
	String text = element2.getText();
	return text;
}
return null;
}


public static  List<WebElement> getAllSelectedOptions(WebElement element) {//35
Select select=new Select(element);
List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
return allSelectedOptions;
}

public static WebElement getFirstSelectedOption(WebElement element) {//36
Select select=new Select(element);
WebElement firstSelectedOption = select.getFirstSelectedOption();
return firstSelectedOption;
}


public static boolean isMultiple(WebElement element) {//37
Select select=new Select(element);
boolean multiple = select.isMultiple();
return multiple;
}

public static  void deSelectByIndex(WebElement element,int i) {//38
Select select=new Select(element);
select.deselectByIndex(i);
}


public static void deSelectByValue(WebElement element,String value) {//39
Select select=new Select(element);
select.deselectByValue(value);
}


public static void deSelectByText(WebElement element,String text) {//40
Select select=new Select(element);
select.deselectByVisibleText(text);
}


public static void deselctAll(WebElement element) {//41
Select select=new Select(element);
select.deselectAll();
}


public static void switchWindowId(String value) {//42
driver.switchTo().window(value);
}


public static String getDataFromExcel(String pathname,String name,int rowNum,int cellNum) throws IOException {
File file=new File(pathname);
FileInputStream fileInputStream=new FileInputStream(file);
Workbook workbook=new XSSFWorkbook(fileInputStream);
Sheet sheet = workbook.getSheet(name);
Row row = sheet.getRow(rowNum);
Cell cell = row.getCell(cellNum);
int cellType = cell.getCellType();
String value="";
if (cellType==1) {
	value= cell.getStringCellValue();	
}else if (DateUtil.isCellDateFormatted(cell)) {
	Date dateCellValue = cell.getDateCellValue();
	SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MMM-YYYY");
	dateFormat.format(dateCellValue);
}else {
	double numericCellValue = cell.getNumericCellValue();
	long l=(long) numericCellValue;
	value = String.valueOf(l);
}return value;
}


public static  void insertDataToExcel(String pathname,String name,int rowNum,int cellNum,String value) throws IOException {
File file=new File(pathname);
FileInputStream fileInputStream=new FileInputStream(file);
Workbook workbook=new XSSFWorkbook(fileInputStream);
Sheet sheet = workbook.createSheet(name);
Row row = sheet.createRow(rowNum);
Cell cell = row.createCell(cellNum);
cell.setCellValue(value);
FileOutputStream fileOutputStream=new FileOutputStream(file);
workbook.write(fileOutputStream);

}


public static void implicitWait() {
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}


public static List<WebElement> findElements(WebElement element,String value) {
	List<WebElement> list = element.findElements(By.tagName(value));
	return list;

}
public static String getPageSource() {
String pageSource = driver.getPageSource();
return pageSource;
}

public static void close() {
driver.quit();
}

}
