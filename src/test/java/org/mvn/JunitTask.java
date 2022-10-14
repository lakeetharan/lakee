package org.mvn;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitTask {
	static WebDriver driver;
	@BeforeClass
	
	public static void beforeclass() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

	}
	@AfterClass
	public  static void afterclass() {
		driver.quit();

	}
	@Test
	 	 public void logintest() {
		
		WebElement txtusrnm = driver.findElement(By.id("username"));
		txtusrnm.sendKeys("Greens8767");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("L4R739");
		
		WebElement btnclk = driver.findElement(By.id("login"));
		btnclk.click();
	}
	@Before
		public void bfrescrensht() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		
		File file= new File("E:\\\\screenshotselenium\\\\ScreenShotTask.png");
		FileUtils.copyFile(screenshotAs, file);
		
		
		
		
			
	
		
		}
		
		
		
		
		
		
		
		
		
				
		
		

		}        


