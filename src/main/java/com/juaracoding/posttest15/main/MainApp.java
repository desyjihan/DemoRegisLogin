package com.juaracoding.posttest15.main;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.posttest15.drivers.DriverSingleton;
import com.juaracoding.posttest15.pages.LoginPage;
import com.juaracoding.posttest15.pages.RegisPage;

public class MainApp {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		DriverSingleton.getInstance("Chrome");
		WebDriver driver = DriverSingleton.getDriver();
		String url = "https://shop.demoqa.com/";
		driver.get(url);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window,scrollBy(0,300)");
		Thread.sleep(600);

		driver.findElement(By.xpath("//a[normalize-space()='My Account']")).click();
		Thread.sleep(600);

		js.executeScript("window,scrollBy(0,400)");
		Thread.sleep(600);
		
		RegisPage regispage = new RegisPage();
		regispage.regis("jihan", "jihan@test.com", "jihan.123.asd");
		System.out.println("Input Regis Success");
		Thread.sleep(600);
		
		driver.findElement(By.xpath("//a[@class='showlogin']")).click();
		Thread.sleep(600);

		driver.findElement(By.xpath("//input[@id='rememberme']")).click();
		System.out.println("Rememberme Success");
		Thread.sleep(600);
		
		LoginPage loginPage = new LoginPage();
		loginPage.login("jihan", "jihan.123.asd");
		System.out.println("Input Login Success");
		Thread.sleep(600);


		js.executeScript("window,scrollBy(0,400)");
		Thread.sleep(600);
		
		delay(3);
		driver.quit();
	}

	static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}