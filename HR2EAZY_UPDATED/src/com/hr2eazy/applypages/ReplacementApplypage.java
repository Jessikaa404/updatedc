package com.hr2eazy.applypages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ReplacementApplypage {
	WebDriver driver;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_PopCalendar1_Control")
	WebElement fromdate;
	
	@FindBy(id="popupSuperSpanMonth0")
	WebElement frommonth;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_PopCalendar2_Control")
	WebElement todate;
	
	@FindBy(id="popupSuperSpanMonth1")
	WebElement tomonth;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_chkHalfday")
	WebElement halfday;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_txtReason")
	WebElement reason;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_fileupload")
	WebElement attachment;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_btnSubmit")
	WebElement submit;
	
	public ReplacementApplypage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void fromdate(String date, String month) {
		fromdate.click();
		frommonth.click();
		driver.findElement(By.id("popupSuperMonth"+month+"")).click();
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@id='popupSuperContent0']/table /tbody/tr/td/span"));
 	     System.out.println(alldates);
		for(WebElement cal:alldates) {
			if(cal.getText().contains(date)) {
				System.out.println(cal);
				cal.click();
				break;
			}
		}
		
	}
		
	public void Todate(String date, String Month) {	
		todate.click();
		tomonth.click();
		driver.findElement(By.id("popupSuperMonth"+Month+"")).click();
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@id='popupSuperContent1']/table /tbody/tr/td/span"));
 	     System.out.println(alldates);
		for(WebElement cal:alldates) {
			if(cal.getText().contains(date)) {
				System.out.println(cal);
				cal.click();
				break;
			}
		}
		
	  	    
		
		
	}
	
	public void reason(String reasontxt) {
		reason.sendKeys(reasontxt);
	}
	
	public void submitbtn() {
		submit.click();
	}

}
