package com.Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory  {
	
	static WebDriver driver;
	
	public static WebDriver startbrowser(String browserName,String url) {
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhuvaneswari\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Frefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Working Folder\\Share\\selenium drivers\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
