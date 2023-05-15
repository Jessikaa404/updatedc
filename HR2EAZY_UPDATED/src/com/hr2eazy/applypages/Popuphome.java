package com.hr2eazy.applypages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Popuphome {
WebDriver Driver;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_btnCloseInformation")
	@CacheLookup
	WebElement closepopup;
	
	@FindBy(how=How.XPATH,using=".//*[@id='ctl00_ContentPlaceHolder1_GVNotification_ctl03_lnkview']")
	@CacheLookup
	WebElement HRresource;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"myModal\"]/div/div")
	@CacheLookup
	WebElement pop;
	
	
	
	public Popuphome(WebDriver ldriver) {
		this.Driver=ldriver;
	}
	
	
	public void popupclose() {
		//this.Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement element;
		WebDriverWait wait = new WebDriverWait(Driver, 100);
		element= wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_ContentPlaceHolder1_btnCloseInformation")));
		
		closepopup.click();
		
	}
	
	public void popupnavigation() {
		HRresource.click();
	}

}
