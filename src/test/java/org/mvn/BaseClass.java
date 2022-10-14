package org.mvn;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import javax.swing.text.Element;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static WebDriver driver;
	public  static void opendriver()
	{

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	//1.locator id
	public  static WebElement locatorbyid(String data) {
		WebElement element = driver.findElement(By.id(data));
		return element;

	}//2.locator name
	public WebElement name(String names) {
		WebElement s = driver.findElement(By.name(names));
		return s;

	}
	public  static void Maximizewindow() {
		driver.manage().window().maximize();

	}
	//3.locator classname
	public WebElement classna(String find) {
		WebElement k = driver.findElement(By.name(""));
		return k;
	}
	// 4.get text
	public String gettext(WebElement element) {
		String text = element.getText();
		return text;
	}
	//5. index
	public void index(WebElement element,int f) {
		Select select = new Select(element);
		select.selectByIndex(0);

	}
	//6.get  first selected options
	public WebElement firstvalue(WebElement s) {
		Select f= new Select(s);
		WebElement option = f.getFirstSelectedOption();
		return option;


	}//7.close window
	public  static void closewindow() {
		driver.close();
	}
	public static void enterurl(String name) {
		driver.get(name);
	}
	//8.exit all
	public void exitwindow() {
		driver.quit();
	}
	//9.sendkeys
	public void sendkeys(WebElement element ,String attvalue) {

		element.sendKeys(attvalue);

	}//10 xpathlocator
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
	//15 by index
	public void selectByIndex(WebElement element,int num) {
		Select select= new Select(element);
		select.selectByIndex(num);

	}
	public void clickbtn(WebElement element) {
		element.click();
		
		
	    
		      

	}
	
	//16 by value
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

	public void moveElement(WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
	}

	public void dragAndDrop(WebElement source,WebElement target) {
		Actions action=new Actions(driver);
		action.dragAndDrop(source, target).perform();
	}


	public void contextClick(WebElement element) {
		Actions action=new Actions(driver);
		action.contextClick(element).perform();
	}

	public void doubleClick(WebElement element) {
		Actions action=new Actions(driver);
		action.doubleClick(element).perform();
	}

	public void sendKeysInAction(WebElement element,String data) {
		Actions action=new Actions(driver);
		action.sendKeys(element,data).perform();
	}


	public void keysAction(WebElement element,String data,Keys keyupvalue,Keys keydownvalue) {
		Actions action=new Actions(driver);
		action.sendKeys(data).keyDown(keydownvalue).keyUp(keyupvalue).perform();
	}

	public void sendKeysJs(WebElement element,String data) {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].setAttribute('value','"+data+"')",element);
	}

	public void clickJs(WebElement element) {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].click()",element);
	}

	public void scrolldown(WebElement element) {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].scrollIntoView(true)",element);
	}
	public String readfromexcel(String sheetdata,int rownum,int cellnum) throws IOException {
		File f = new File(
				"C:\\Users\\Theepan\\MavExample\\excelworksheet\\adactin.xlsx");
		FileInputStream s = new FileInputStream(f);
		Workbook workbook=new XSSFWorkbook(s);
		Sheet sheet = workbook.getSheet("adactindata");
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType cellType = cell.getCellType();
		String  res = null;
		switch (cellType) {
		case STRING :
			res=  cell.getStringCellValue();


			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date value = cell.getDateCellValue();
				SimpleDateFormat format= new SimpleDateFormat();
				res = format.format(value);

			}
			else {
				double numericCellValue = cell.getNumericCellValue();
				long round = Math.round(numericCellValue);

				if (round==numericCellValue) {
					res= String.valueOf(round);
				}
				else {
					res= String.valueOf(numericCellValue);

				}

			}break;

		default:
			break;
		}
		return res;






	}

	public  void createexcel(String sheetdata ,int rownum , int cellnum ,String data ) throws IOException {
		File f = new File(
				"C:\\Users\\Theepan\\MavExample\\excelworksheet\\adactin.xlsx");
		FileInputStream s = new FileInputStream(f);
		Workbook workbook=new XSSFWorkbook(s);
		Sheet sheet = workbook.getSheet("adactindata");
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);
		FileOutputStream out = new FileOutputStream(f);
		workbook.write(out);






	}



}














