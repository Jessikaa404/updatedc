package com.hr2eazy.applypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {
WebDriver driver;
	
	@FindBy(id="txtLanId")
	@CacheLookup
	WebElement username;
	
	
	@FindBy(id="txtPassword")
	@CacheLookup
	WebElement password;
	
	@FindBy(id="chkRemember")
	@CacheLookup
	WebElement rem;
	
	@FindBy(how=How.XPATH,using=".//*[@name='btnSubmit']")
	@CacheLookup
	WebElement submit;
	
	@FindBy(id="lblError")
	@CacheLookup
	WebElement alertmsg;
	public String ltext;
	
	public Loginpage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	public void login_hr2eazy(String uname,String passwrd) {
		username.sendKeys(uname);
		password.sendKeys(passwrd);
		rem.click();
		submit.click();
	}
	
	public void text() {
		ltext=alertmsg.getText();
	}


	

}
