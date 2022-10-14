package com.pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
//1
public class BaseClass {
	public static WebDriver driver;
	//1
	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public static void url(String link) {
		driver.get(link);
	}
	//2
	public static String getUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	//3
	public void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public String getAppTitle() {
		String title = driver.getTitle();
		return title;
	}
	//4
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	//5
	public void elementSendKeys(WebElement element,String data ) {
		element.sendKeys(data);
	}
	//6
	public void elementclick(WebElement element) {
		element.click();
	}
	//7
	public WebElement locatorById(String idValue) {
		WebElement element = driver.findElement(By.id(idValue));
		return element;
	}
	//8
	public WebElement locatorByName(String nameValue) {
		WebElement element = driver.findElement(By.name(nameValue));
		return element;
	}
	//9
	public WebElement locatorByClassName(String classValue) {
		WebElement element = driver.findElement(By.className(classValue));
		return element;
	}
	//10
	public WebElement locatorByxpath(String xpathValue) {
		WebElement element = driver.findElement(By.xpath(xpathValue));
		return element;
	}
	//11
	public String TextInWebpage(WebElement element) {
		String text = element.getText();
		return text;
	}
	//12
	public String TextInsert(WebElement element) {
		String text = element.getAttribute("value");
		return text;
	}
	//13
	public String TextInsert(WebElement element,String attributeName) {
		String text = element.getAttribute(attributeName);
		return text;
	}
	//14
	public void selectByText(WebElement element,String text) {
		Select select= new Select(element);
		select.selectByVisibleText(text);

	}
	//15
	public void selectByIndex(WebElement element,int num) {
		Select select= new Select(element);
		select.selectByIndex(num);

	}
	//16
	public void selectByValue(WebElement element,String value) {
		Select select= new Select(element);
		select.selectByValue(value);
	}
	//17
	public List<WebElement> getoption(WebElement element) {
		Select select= new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}
	//18
	public int sizeOfOptions(List<WebElement> element) {
		int size = element.size();
		return size;	
	}
	//19
	public int sizeOfElement(List<WebElement> element) {
		int size = element.size();
		return size;	
	}
	//20
	public void deselectByValue(WebElement element,String value) {
		Select select= new Select(element);
		select.deselectByValue(value);
	}
	//21
	public void deselectByIndex(WebElement element,int num) {
		Select select= new Select(element);
		select.deselectByIndex(num);

	}
	//22
	public void deselectByText(WebElement element,String text) {
		Select select= new Select(element);
		select.deselectByVisibleText(text);

	}
	//23
	public List<WebElement> getSelectedOption(WebElement element) {
		Select select= new Select(element);
		List<WebElement> options = select.getAllSelectedOptions();
		return options;
	}

	//24
	public WebElement getFirstSelectedOption(WebElement element) {
		Select select= new Select(element);
		WebElement option = select.getFirstSelectedOption();
		return option;
	}
	//25
	public boolean isMultipleSelect(WebElement element) {
		Select select= new Select(element);
		boolean option = select.isMultiple();
		return option;
	}
	//26

	public void deSelectAll(WebElement element) {
		Select select= new Select(element);
		select.deselectAll();

	}
	//27
	public void moveElement(WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
	}
	//28
	public void dragAndDrop(WebElement source,WebElement target) {
		Actions action=new Actions(driver);
		action.dragAndDrop(source, target).perform();
	}

	//29
	public void contextClick(WebElement element) {
		Actions action=new Actions(driver);
		action.contextClick(element).perform();
	}
	//30
	public void doubleClick(WebElement element) {
		Actions action=new Actions(driver);
		action.doubleClick(element).perform();
	}
	//31
	public void sendKeysInAction(WebElement element,String data) {
		Actions action=new Actions(driver);
		action.sendKeys(element,data).perform();
	}

	//32
	public void keysAction(WebElement element,String data,Keys keyupvalue,Keys keydownvalue) {
		Actions action=new Actions(driver);
		action.sendKeys(data).keyDown(keydownvalue).keyUp(keyupvalue).perform();
	}
	//33
	public void sendKeysJs(WebElement element,String data) {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].setAttribute('value','"+data+"')",element);
	}
	//34
	public void clickJs(WebElement element) {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].click()",element);
	}
	//35
	public void scrolldown(WebElement element) {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].scrollIntoView(true)",element);
	}
	//36
	public void scrollUp(WebElement element) {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].scrollIntoView(false)",element);
	}

	//37

	public void frameByIndex(int num) {

		driver.switchTo().frame(num);
	}
	//38
	public void frameByvalue(String value) {

		driver.switchTo().frame(value);
	}
	//39
	public void frameByElement(WebElement element) {

		driver.switchTo().frame(element);
	}
	//40
	public void frameByLocator(String value) {

		driver.switchTo().frame(driver.findElement(By.id(value)));
	}
	//41
	public void frameToParent(WebElement element) {

		driver.switchTo().parentFrame();
	}
	//42
	public String getWindowId() {

		String handle = driver.getWindowHandle();
		return handle;
	}
	//43
	public Set<String> getAllWindowId() {

		Set<String> handle = driver.getWindowHandles();
		return handle;
	}
	//44
	public void switchToWindow(String value) {
		driver.switchTo().window(value);

	}
	//45

	public void switchToChildWindow(Set<String> allwindows,String parent) {
		for (String window : allwindows) {
			if (!window.equals(parent)) {
				driver.switchTo().window(window);
			}}}
	//46
	public int  countOfFrame() {
		List<WebElement> element = driver.findElements(By.tagName("iframe"));
		int size = element.size();
		return size;

	}
	//47
	public void switchAlert() {
		driver.switchTo().alert();
	}
	//48
	public void acceptAlert() {
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}

	//49
	public void dismissAlert(WebElement element) {
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}

	//50
	public void sendKeysInAlert(WebElement element,String data) {
		Alert alert=driver.switchTo().alert();
		alert.sendKeys(data);
	}
	//51
	public String getTextInAlert(WebElement element) {
		Alert alert=driver.switchTo().alert();
		String text = alert.getText();
		return text;
	}

	//52
	public void screenShot() {
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File path = screenshot.getScreenshotAs(OutputType.FILE);

	}
	//53
	public void copyfile(String destFile,File path) throws IOException {
		File file =new File(destFile);
		FileUtils.copyFile(path, file);

	}
	//54
	public int rowTableCount(){
		List<WebElement> elements = driver.findElements(By.tagName("tr"));
		int size = elements.size();
		return size;
	}
	//55
	public int TableCount(String data){
		List<WebElement> elements = driver.findElements(By.tagName("table"));
		int size = elements.size();
		return size;
	}

		
	public void implicityWait(long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));

	}
	public void explicitWait(long time,String id) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
	}
	
	public List<WebElement> findElements(String data) {
		
		List<WebElement> elements = driver.findElements(By.xpath(data));
		return elements;
		
	}
	
}





































