package com.hr2eazy.applypages;

import java.util.List;

import javax.swing.plaf.synth.SynthScrollPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.test.PermissionApply;

public class Permissionpage {
	
	WebDriver driver;
	@FindBy(id="ctl00_ContentPlaceHolder1_PopCalendar2_Control")
	WebElement calendar;
	
	@FindBy(id="popupSuperSpanMonth0")
	WebElement calendarmonth;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_ddlHoursStarttime")
	WebElement FromHour;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_ddlMinutesStarttime")
	WebElement FromMin;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_ddlMeridianStart")
	WebElement FromMeridiem;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_ddlHoursEndtime")
	WebElement ToHour;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_ddlMinutesEndtime")
	WebElement ToMin;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_ddlMeridianOut")
	WebElement ToMeridiem;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_txtreason")
	WebElement Reason;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_fileupload")
	WebElement Attachment;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_btnSaveDown")
	WebElement savebtn;
	
	
	public Permissionpage(WebDriver permissiondriver) {
		this.driver=permissiondriver;
	}
	
	public void fromdate(String b,String c) {
		calendar.click();
		calendarmonth.click();
		
		driver.findElement(By.xpath("//*[@id='popupSuperMonth"+b+"']")).click();
		//System.out.println("A");
  	     List<WebElement> alldates=driver.findElements(By.xpath("//*[@id='popupSuperContent0']/table /tbody/tr/td/span"));
  	     System.out.println(alldates);
		for(WebElement cal:alldates) {
			if(cal.getText().contains(c)) {
				System.out.println(cal);
				cal.click();
				break;
			}
		}
	}
	
	public void FromTime(String hour, String Min,String Meridiem) {
		FromHour.click();
		Select s=new Select(FromHour);
		s.selectByValue(hour);
		FromMin.click();
		Select s1=new Select(FromMin);
		s1.selectByValue(Min);
		FromMeridiem.click();
		Select s2=new Select(FromMeridiem);
		s2.selectByValue(Meridiem);
	}
	
	public void ToTime(String hours, String Min, String Meridiem) {
		ToHour.click();
		Select h=new Select(ToHour);
		h.selectByValue(hours);
		ToMin.click();
		Select min=new Select(ToMin);
		min.selectByValue(Min);
		ToMeridiem.click();
		Select s2=new Select(ToMeridiem);
		s2.selectByValue(Meridiem);
	}
	
	public void reasonapply(String Reason) {
		this.Reason.sendKeys("Reason");
		savebtn.click();
	}
	
	public void successmsg() {
		WebElement msg=driver.findElement(By.id("ctl00_ContentPlaceHolder1_lblMsg"));
		if(msg.isDisplayed()) {
			String alertmsg=msg.getText();
			if(alertmsg.equalsIgnoreCase("Please check the Permission date. Already Leave Applied on same date\r\n" + 
					"")) {
				PermissionApply permission=PageFactory.initElements(driver, PermissionApply.class);
				permission.permissionapply();		
			}
			else if(alertmsg.equalsIgnoreCase("Permission Date is limited to 1 month only.")) {
				System.out.println("Permission Date is limited to 1 month only.");
			}
			else if(alertmsg.equalsIgnoreCase("Record is added successfully."))
			System.out.println("Permission applied successfully");
		}
		
		
		
		
	}

}
