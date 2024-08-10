package com.cognizant.basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void browserLaunch() {
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Launching browser");
	}
	
	public static void browserLaunch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver =  new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver =  new EdgeDriver();
		}
		else {
			System.out.println("Invalid Browser");
		}
		System.out.println("Launching browser");
		driver.manage().window().maximize();
	}
	
	public static void loadUrl(String url) {
		driver.get(url);
		System.out.println("URl Loading");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void closeBrowser() {
		driver.close();  //close the current tab where the driver focus is
		driver.quit();  //close all the tab for the respective driver and session out
	}
	
	public static WebElement searchElementById(String id){   // this method can be removed
		WebElement element = driver.findElement(By.id(id));
		return element;
	}
	
	public static WebElement searchElementByXpath(String xpath){	// this method can be removed
		
		return driver.findElement(By.xpath(xpath));
	}
	
	public static String getProperty(String key) throws IOException {
		File file = new File("C:\\Users\\AzharudeenJaferali\\eclipse-workspace\\TigerAutomation\\src\\test\\resources\\Source\\Credentials.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		
		return prop.getProperty(key);
	}
	
}
