package org.sam;

import java.awt.dnd.DragSourceDropEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellAlignment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
     
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
	}
	public static void WindowMaximize() {
		driver.manage().window().maximize();
	}
	public static void launchUrl(String Url) {
		driver.get(Url);
	}
	public static String pagetittle() {
		String title = driver.getTitle();
		return title;
	}
	public static String pageUrl() {
		String Url = driver.getCurrentUrl();
		return Url;
	}
	public static void passText(String txt,WebElement ele) {
		ele.sendKeys(txt);
	}
	public static void closeEntireBrowser() {
		driver.quit();
	}
		
	public static void screenshot(String imgName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File image = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("location+ imgName.png");
		FileUtils.copyFile(image, f);
	}
	public static void excelRead(String sheetName, int rowNum,int cellNum) throws IOException {
		File f = new File ("excellocation.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook mysheet = new XSSFWorkbook(fis);
	
	
				
		
	
		
	}
}
