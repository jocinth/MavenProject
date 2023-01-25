package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
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
	
	
	public static void launchMethod(String url) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		
		

	}
	
	public static void maximizeMethod() {
		
		driver.manage().window().maximize();

	}
	
	public static void implicitlyWaitMethod(long seconds) {

		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		

	}
	
	public String getTitleMethod() {
		
	   String title = driver.getTitle();
	   return title;

	}
	
	public String getCurrentUrlMethod() {
		
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		

	}
	
	public WebElement findElementByClassMethod(String className) {
		
		WebElement element = driver.findElement(By.className(className));
		return element;
		

	}
	
	public WebElement findElementByIdMethod(String id) {
		
		WebElement element = driver.findElement(By.id(id));
		return element;
		

	}
	
	public WebElement findElementByNameMethod(String name) {
		
		WebElement element = driver.findElement(By.name(name));
		return element;

	}
	
	public WebElement findElementByTagMethod(String tagName) {
		
		WebElement element = driver.findElement(By.tagName(tagName));
		return element;

	}
	
	public WebElement findElementByXpathMethod(String xpathExpression) {
		
		WebElement element = driver.findElement(By.xpath(xpathExpression));
		return element;

	}
	
	public List<WebElement> findElementssssByXpath(String xpathExpression ) {
		
		List<WebElement> elements = driver.findElements(By.xpath(xpathExpression));
		return elements;

	}
	
	public void sendKeysMethod(WebElement element, String data) {
		
		element.sendKeys(data);
		
		
		

	}
	
	public void clickMethod(WebElement element) {
		
		element.click();

	}
	
	public void clearMethod(WebElement element) {
		
		element.clear();

	}
	
	public void closeMethod() {
		driver.close();

	}
	
	public static void quitMethod() {
		driver.quit();

	}
	
	public String getTextMethod(WebElement element) {
		
		String text = element.getText();
		return text;

	}
	
	public String getTagNameMethod(WebElement element) {
		
		String tagName = element.getTagName();
		return tagName;

	}
	
	public String getAttributeMethod(WebElement element, String locator) {
		
		String attribute = element.getAttribute(locator);
		return attribute;
		

	}
	
	public String getWindowHandleMethod() {
		
		String windowHandle = driver.getWindowHandle();
		return windowHandle;

	}
	
	public void switchToMethod(String currentwindow) {
		
		driver.switchTo().window(currentwindow);

	}
	
	public Set<String> getWindowHandlesMethod() {
		
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;

	}
	
	public void doubleClickMethod(WebElement element) {
		
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();

	}
	
	public void moveToElementMethod(WebElement element) {
		
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
		

	}
	
	public void contextClickMethod(WebElement element) {
		
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
		

	}
	
	public void dragAndDropMethod(WebElement source, WebElement target) {
		
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
		

	}
	
	public void backMethod() {
		
		driver.navigate().back();

	}
	
	public void forwardMethod() {
		
		driver.navigate().forward();

	}
	
	public static void refreshMethod() {
		
		driver.navigate().refresh();

	}
	
	public void keyPressMethod(int keycode) throws AWTException {
		
		Robot r = new Robot();
		r.keyPress(keycode);

	}
	
	public void keyReleaseMethod(int keycode) throws AWTException {
		
		Robot r = new Robot();
		r.keyRelease(keycode);
	
		
    }
	
	public void selectByIndexMethod(WebElement element, int index) {
		
		Select s = new Select(element);
		s.selectByIndex(index);

	}
	
	public void selectByValueMethod(WebElement element, String value) {
		
		Select s = new Select(element);
		s.selectByValue(value);

	}
	
	public void selectByVisibleText(WebElement element, String text) {
		
		Select s = new Select(element);
		s.selectByVisibleText(text);
		
	}
	
	public void deSelectByIndexMethod(WebElement element, int index) {
		
		Select s = new Select(element);
		s.deselectByIndex(index);

	}
	
	public void deSelectByValueMethod(WebElement element, String value) {
		
		Select s = new Select(element);
		s.deselectByValue(value);

	}
	
	public void deSelectByVisibleText(WebElement element, String text) {
		
		Select s = new Select(element);
		s.deselectByVisibleText(text);

	}
	
	public void deSelectAllMethod(WebElement element) {
		
		Select s = new Select(element);
		s.deselectAll();
		

	}
	
	public void isMultipleMethod(WebElement element) {
		
		Select s = new Select(element);
		boolean multiple = s.isMultiple();

	}
	
	public List<WebElement> getAllSelectedOptions(WebElement element) {
		
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		return allSelectedOptions;

	}
	
	public WebElement getFirstSelectedOptionMethod(WebElement element) {
		
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		return firstSelectedOption;
		

	}
	
	public List<WebElement> getOptionsMethod(WebElement element) {
		
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		return options;
		

	}
	
	public void JavascriptMethods(String script, WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(script, element);

	}
	
	public void scrollDownJavascriptMethod(WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		

	}
	
	public void scrollUpJavascriptMethod(WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
		

	}
	
	public void acceptAlertMethod() {
		
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
	
	public void dismissAlertMethod() {
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		

	}
	
	public String getTextAlertMethod() {
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		return text;

	}
	
	public void sendKeysAlertMethod(String text) {
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);

	}
	
	public File getScreenshotAsAndOutputMethod(String fileName) throws IOException {
		
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File source = screenShot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Jocinth\\eclipse-workspace\\CucumberProject\\Screenshot\\"+fileName+".png");
		FileUtils.copyFile(source, dest);
		return source;

	}
	
	//public void creatingFileAndDestMethod(String path) {
		
		//File dest = new File(path);
		

	//}
	
	//public void copyFileMethod(File source, File dest) throws IOException {
		
		//FileUtils.copyFile(source, dest);

	//}
	
	public File getScreenshotAsforWebElementMethod(WebElement element) {
		
		File source = element.getScreenshotAs(OutputType.FILE);
		return source;
		

	}
	
	public void setData(int row, int cell, String name, String value) throws IOException {
		
		File file = new File("C:\\Users\\Jocinth\\eclipse-workspace\\PonniyinSelvan\\Kundhavai\\New.xls");
		FileInputStream input = new FileInputStream(file);
		Workbook book = new HSSFWorkbook(input);
		Sheet createSheet = book.createSheet(name);
		Row createRow = createSheet.createRow(row);
		Cell createCell = createRow.createCell(cell);
		createCell.setCellValue(value);
		FileOutputStream output = new FileOutputStream(file);
		book.write(output);
		

	}
	
	public String getData(String name, int row, int cell) throws IOException {
		
		File file = new File("C:\\Users\\Jocinth\\eclipse-workspace\\PonniyinSelvan\\Kundhavai\\New.xls");
		FileInputStream input = new FileInputStream(file);
		Workbook book = new HSSFWorkbook(input);
		Sheet sheet = book.getSheet(name);
		Row row2 = sheet.getRow(row);
		Cell cell2 = row2.getCell(cell);
		String stringCellValue = cell2.getStringCellValue();
		return stringCellValue;

}
	
}
