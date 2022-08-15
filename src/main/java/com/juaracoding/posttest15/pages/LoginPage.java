package com.juaracoding.posttest15.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.posttest15.drivers.DriverSingleton;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement userName;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement regPassword;
	
	@FindBy(xpath = "//button[@name='login']")
	private WebElement btnLogin;
	
	public void login(String username, String regpassword) {
		this.userName.sendKeys("");
		this.regPassword.sendKeys("jihan.123.asd");
		btnLogin.click();
		
	}
}