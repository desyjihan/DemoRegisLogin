package com.juaracoding.posttest15.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.posttest15.drivers.DriverSingleton;

public class RegisPage {

	private WebDriver driver;
	
	public RegisPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='reg_username']")
	private WebElement regUserName;
	
	@FindBy(xpath = "//input[@id='reg_email']")
	private WebElement regEmail;
	
	@FindBy(xpath = "//input[@id='reg_password']")
	private WebElement regPassword;

	@FindBy(xpath = "//button[@name='register']")
	private WebElement btnReg;
	
	public void regis(String regusername, String regemail, String regpassword) {
		this.regUserName.sendKeys(regusername);
		this.regEmail.sendKeys(regemail);
		this.regPassword.sendKeys(regpassword);
		btnReg.click();
		
	}
}
