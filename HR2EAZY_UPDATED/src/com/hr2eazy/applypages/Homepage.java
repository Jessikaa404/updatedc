package com.hr2eazy.applypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage {
	
		WebDriver driver;
		
		@FindBy(how=How.XPATH,using=".//*[@id='ctl00_ContentPlaceHolder1_lnkApplyLeave']")
		@CacheLookup
		WebElement Applyleave;
		
		@FindBy(how=How.XPATH,using=".//*[@id='ctl00_ContentPlaceHolder1_lnkPermission']")
		@CacheLookup
		WebElement Applypermission;
		
		@FindBy(how=How.XPATH,using=".//*[@id='ctl00_ContentPlaceHolder1_lnkCancelLeave']")
		@CacheLookup
		WebElement CancelLeave;
		
		@FindBy(how=How.XPATH,using=".//*[@id='ctl00_ContentPlaceHolder1_lnkReplacementLeave']")
		@CacheLookup
		WebElement ReplacementLeave;
		
		@FindBy(how=How.XPATH,using=".//*[@id='ctl00_ContentPlaceHolder1_PublicHoliday1_gvpublicHoliday']/tbody")
		@CacheLookup
		WebElement publicholidays;
		
		@FindBy(how=How.XPATH,using=".//*[@id='ctl00_ContentPlaceHolder1_ctl01_GVRemaingLeaves']/tbody/tr[1]/td[7]")
		@CacheLookup
		WebElement annualcount;
		
		@FindBy(how=How.XPATH,using=".//*[@id='sidebarnav']/li[1]")
		@CacheLookup
		WebElement homebtn;
		
		@FindBy(how=How.XPATH,using="//*[@id=\"ctl00_ContentPlaceHolder1_lnkPermission\"]/div")
		@CacheLookup
		WebElement permission;
		
		@FindBy(id="ctl00_ContentPlaceHolder1_lnkCancelLeave")
		@CacheLookup
		WebElement cancelleave;
		
		@FindBy(id="ctl00_ContentPlaceHolder1_lnkReplacementLeave")
		@CacheLookup
		WebElement replacementbtn;
		
		@FindBy(id="ctl00_ContentPlaceHolder1_lnkClaims")
		WebElement claim;
		
		@FindBy(how=How.XPATH,using="//*[@id='ctl00_ContentPlaceHolder1_ctl16_gvclaim']")
		WebElement claimtable;
		
		@FindBy(how=How.XPATH,using="//*[@id='ctl00_ContentPlaceHolder1_lnkExtraTime']/img")
		@CacheLookup
		WebElement overttime;
		
		@FindBy(how=How.XPATH,using="//*[@id='ctl00_ContentPlaceHolder1_ctl15_gvOvertime']/tbody")
		@CacheLookup
		WebElement overtimetable;
		
		@FindBy(id="ctl00_ContentPlaceHolder1_lnkAdvance")
		@CacheLookup
		WebElement advancebtn;
		
		@FindBy(how=How.XPATH,using="//*[@id='ctl00_ContentPlaceHolder1_lnkPettyCash']/img")
		@CacheLookup
		WebElement pettycashbtn;
		
		@FindBy(id="ctl00_ContentPlaceHolder1_lnkTravel")
		@CacheLookup
		WebElement Travel;
		
		@FindBy(id="ctl00_ContentPlaceHolder1_lnkApplyTravel")
		@CacheLookup
		WebElement Travelclaim;
		
		@FindBy(id="ctl00_ContentPlaceHolder1_lnkReliefEntry")
		@CacheLookup
		WebElement userrelief;
		
		@FindBy(id="ctl00_ContentPlaceHolder1_lnkTraining")
		@CacheLookup
		WebElement Trainingbtn;
		
		@FindBy(id="ctl00_ContentPlaceHolder1_ctl07_GvMyTrainingHistory_ctl02_btnAccept")
		@CacheLookup
		WebElement mytraining;
		
		@FindBy(id="ctl00_ContentPlaceHolder1_lnkBookingManagement")
		@CacheLookup
		WebElement bookoption;
		
		public Homepage(WebDriver lDriver) {
			this.driver=lDriver;
		}
		
		public void applyleavebtn() {
			Applyleave.click();
		}
		
		public void cancelleave() {
			cancelleave.click();
		}
		
		public void permissiobtn() {
			Applypermission.click();
		}
		
		public String holidays() {
			String publicleave=publicholidays.getText();
			System.out.println(publicholidays.getText());
			return publicleave;
		}
		
		public String leave() {
			String leavcount=annualcount.getText();
			return leavcount;
		}
		
		public void homenav() {
			homebtn.click();
		}
		
		public void replacemenycheck() {
			replacementbtn.click();
		}
		
		public void claimbtn() {
			claim.click();
		}
		
		public String claimcountcheck() {
			String claimvalue=claimtable.getText();
			//System.out.println(claimtable.getText());
			return claimvalue;
		}
		
		public String OTtable() {
			String OT=overtimetable.getText();
			return OT;
		}
		
		public void ovettimebtn() {
			overttime.click();
		}
		
		public void advance() {
			advancebtn.click();
		}
		
		public void pettycash() {
			pettycashbtn.click();
		}
		
		public void travelbtn() {
			Travel.click();
		}
		
		public void travelclaim() {
			Travelclaim.click();
		}
		
		public void userreliefentry() {
			userrelief.click();
		}
		
		public void training() {
			Trainingbtn.click();
		}
		
		public void mytraining() {
			mytraining.click();
		}
		
		public void bookingoption() {
			bookoption.click();
		}

	}



