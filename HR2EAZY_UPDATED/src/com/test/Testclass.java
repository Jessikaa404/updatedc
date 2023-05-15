package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;

public class Testclass {
	public static WebDriver driver;
	
	public static void main(String[] args){
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\\\VM - 16-10\\\\eclipse-workspace\\\\selenium drivers\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
			//driver.get("www.google.com");
			driver.manage().window().maximize();
			driver.get("https://qaen.hr2eazy.com/");
			
			//driver.manage().timeouts().implicitlyWait(10, null);
			WebElement entuserid = driver.findElement(By.id("txtLanId"));
			entuserid.sendKeys("jackie");
			WebElement entuserpass = driver.findElement(By.id("txtPassword"));
			entuserpass.sendKeys("qaz4321");
			WebElement clicksignin = driver.findElement(By.id("btnSubmit"));
			clicksignin.click();
			driver.switchTo().alert().accept();
			
			WebElement clickleave = driver.findElement(By.xpath("(//div[@class='flat-txt'])[2]"));
			clickleave.click();
			WebElement multidrop = driver.findElement(By.xpath("(//div[@class='flat-txt'])[2]"));
			Select s=new Select(multidrop);
			s.selectByVisibleText("Annual Leave");
			WebElement click2=driver.findElement(By.xpath("(//span[contains(text(),'Carry Forward')])[1]"));
			click2.click();
			WebElement entreason = driver.findElement(By.xpath("//span[text()='Reason']"));
			entreason.sendKeys("personel work");
			WebElement click3 = driver.findElement(By.xpath("(//img[@align='absmiddle'])[1]"));
			click3.click();
			WebElement apply=driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
			apply.click();
			WebElement clickclose = driver.findElement(By.xpath("(//input[@type='submit'])[3]"));
			clickclose.click();
			WebElement clickper = driver.findElement(By.xpath("(//div[@class='flat-txt'])[1]"));
			clickper.click();
			WebElement cliclapprove = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
			cliclapprove.click();
			WebElement clickclose2 = driver.findElement(By.xpath("(//input[@type='submit'])[3]"));
			clickclose2.click();
			
			 driver.quit();
		/*System.setProperty("webdriver.chrome.driver", "C:\\VM - 16-10\\eclipse-workspace\\selenium drivers\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qaen.hr2eazy.com/");
		System.out.println("Helloo");
		System.setProperty("webdriver.chrome.driver","C:\\\\VM - 16-10\\\\eclipse-workspace\\\\selenium drivers\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();


		driver1.get("http://qa20.hr2eazy.com/Modules/General/MyDashboard.aspx");
		driver1.manage().window().maximize();
		driver1.findElement(By.id("signUp")).click();
		WebElement login= driver1.findElement(By.id("txtLanId"));
		login.sendKeys("Jin");
		WebElement password=driver1.findElement(By.id("txtPassword"));
		password.sendKeys("qaz4321");
		WebElement signin=driver1.findElement(By.id("btnSubmit"));
		signin.click();
		WebElement leave1 =driver1.findElement(By.xpath("/html/body/div[2]/form/div[3]/div/div[1]/div[3]/div/div/div/div[1]/section/div/div[2]/div/div/div[3]/div[1]/div[4]/a"));
		leave1.click();
		Select leavetype=new Select(driver1.findElement(By.id("ctl00_ContentPlaceHolder1_ddlLeaveType")));
		leavetype.selectByVisibleText("Annual Leave");
		WebElement ent=driver1.findElement(By.id("ctl00_ContentPlaceHolder1_rbtnEntitled"));
		ent.click();
		/*WebElement cal=driver1.findElement(By.xpath("/html/body/div[8]/form/div[3]/div/div/div[4]/div/div/div/div/section/div[1]/div[2]/div[2]/div/div/div/div[1]/div/div[4]/div[1]/div/div[1]/div/span/img"));
		cal.click();
		Action date= (Action) driver1.findElement(By.xpath("///table/tbody/tr[4]/td[2]/span"));
		date.perform();
		WebElement reason=driver1.findElement(By.xpath("/html/body/div[8]/form/div[3]/div/div/div[3]/div/div/div/div/section/div[1]/div[2]/div[2]/div/div/div/div[1]/div/div[3]/div/textarea"));
		reason.sendKeys("going to hospitl");
		WebElement submit=driver1.findElement(By.linkText("Apply Leave"));
		submit.click();
		WebElement app=driver1.findElement(By.linkText("Approver"));
		app.click();
		WebElement close=driver1.findElement(By.id("btnClose"));
		close.click();
		WebElement approve=driver1.findElement(By.linkText("Aishu"));
		System.out.println(approve);
		WebElement siout=driver1.findElement(By.xpath("/html/body/div[7]/form/div[3]/div/div/nav[1]/div[1]/div[2]/ul/li[1]/a/span/span"));
		siout.click();
		Thread.sleep(1000);
		WebElement siginout=driver1.findElement(By.linkText("Sign In"));
		siginout.click();
		WebElement login1= driver1.findElement(By.id("txtLanId"));
		login1.sendKeys("aishu");
		WebElement password1=driver1.findElement(By.id("txtPassword"));
		password1.sendKeys("qaz4321");
		WebElement signin1=driver1.findElement(By.id("btnSubmit"));
		signin1.click();
		Thread.sleep(2000);
		WebElement popup =driver1.findElement(By.linkText("Close"));
		popup.click();
		WebElement appro=driver1.findElement(By.xpath("/html/body/div[2]/form/div[3]/div/div[1]/nav[1]/div[1]/div[1]/div/div[5]/a"));
		appro.click();
		WebElement lev= driver1.findElement(By.xpath("ctl00_ContentPlaceHolder1_ddlLeaveType"));
		Select le=(Select) driver1.findElement(By.id("ctl00_ContentPlaceHolder1_ddlLeaveType"));
		le.selectByVisibleText("Annual Leave");
		Select check=(Select) driver1.findElement(By.id("<"));
		check.getFirstSelectedOption();
		WebElement app1=driver1.findElement(By.linkText("Approver"));
		app1.click();*/
		
	}

}
