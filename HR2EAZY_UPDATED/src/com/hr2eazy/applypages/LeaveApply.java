package com.hr2eazy.applypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

//import com.hr2eazy.pages.List;

public class LeaveApply {
	
	 WebDriver driver;
	 @FindBy(xpath="//*[@id=\"ctl00_ContentPlaceHolder1_lnkApplyLeave\"]/div/text()")
	 WebElement Applyleavebtn;
	 
	 @FindBy(xpath="//*[@name=\"ctl00$ContentPlaceHolder1$ddlLeaveType\"]")
	 WebElement Leavetypedropdown;
	 
	 @FindBy(xpath="//*[@id=\"ctl00_ContentPlaceHolder1_txtReason\"]")
	 WebElement Leavereason;
	 
	 @FindBy(id="ctl00_ContentPlaceHolder1_rbtnEntitled")
	 WebElement entitleradiobtn;
	 
	 @FindBy(id="ctl00_ContentPlaceHolder1_rbtnCarryForward")
	 WebElement CFradiobtn;
	 
	 @FindBy(xpath="//*[@id=\"ctl00_ContentPlaceHolder1_txtLeaveFrom\"]")
	 WebElement Leavefromdate;
	 
	 @FindBy(xpath="//*[@id=\"ctl00_ContentPlaceHolder1_txtLeaveTo\"]")
	 WebElement Leavetodate;
	 
	@FindBy(id="ctl00_ContentPlaceHolder1_PopLeavecal_Control")
	WebElement date1;
		
	@FindBy(id="popupSuperSpanMonth0")
	WebElement replacefrommonth;
		
	@FindBy(how=How.XPATH,using=".//*[@id='popupSuperContent0']/table/tbody/tr")
	WebElement table;
		
	@FindBy(id="ctl00_ContentPlaceHolder1_PopLeavecal2_Control")
	WebElement date2;
		
	@FindBy(id="popupSuperSpanMonth1")
	WebElement replaceTommonth;
		
	@FindBy(how=How.XPATH,using=".//*[@id='popupSuperContent1']/table/tbody")
	WebElement table2;

	 
	@FindBy(xpath="//*[@id=\"ctl00_ContentPlaceHolder1_ddlReliefEmpname\"]")
	WebElement Reliefdropdown;
	 
	 @FindBy(xpath="//*[@id=\"ctl00_ContentPlaceHolder1_chkHalfday\"]")
	 WebElement Halfday;
	 
	 @FindBy(xpath="//*[@id=\"ctl00_ContentPlaceHolder1_fileupload\"]")
	 WebElement attachmentupload;
	 
	 @FindBy(id="ctl00_ContentPlaceHolder1_btnSaveDown")
	 WebElement Applyleavesavebtn;
	 
	 @FindBy(id="ctl00_ContentPlaceHolder1_btnCloseDown")
	 WebElement closebtn;
	 
	 public LeaveApply(WebDriver Leavedriver) {
		 this.driver=Leavedriver;
	 }
	 
	 public void leavetype(String Leavetype) {
		 Leavetypedropdown.click();
		 Select st=new Select(Leavetypedropdown);
		 st.selectByValue(Leavetype);
		
	 }
	 
	 public void Applytype(String type) {
		 if(type.equalsIgnoreCase("Entitle")) {
			 entitleradiobtn.click();
		 }
		 else {
			 CFradiobtn.click();
		 }
	 }
	 
	 public void leavereason(String reason) {
		 Leavereason.sendKeys(reason);
	 }
	 
	 
	public void fromdate(String b,String c) {
				date1.click();
				replacefrommonth.click();
				
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
	
	public void Todate(String b,String c) {
		date2.click();
		replaceTommonth.click();
		
		driver.findElement(By.xpath("//*[@id='popupSuperMonth"+b+"']")).click();
		//System.out.println("A");
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@id='popupSuperContent1']/table /tbody/tr/td/span"));
 	    for(WebElement cal:alldates) {
			if(cal.getText().contains(c)) {
				cal.click();
				break;
			}
		}
	}
	
	public void attach(String path) {
		//attachmentupload.click();
		attachmentupload.sendKeys(path);
	}
	
	public void submit() {
		Applyleavesavebtn.click();
	}
	 }
	 


