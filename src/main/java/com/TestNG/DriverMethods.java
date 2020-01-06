package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DriverMethods {
	
	WebDriver driver;
	@Test
	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_workspace_oxygen\\TestNG\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java");
		driver.manage().window().maximize();
		Thread.sleep(5000);
//		driver.manage().window().setPosition(new Point(-2000,0));
		Thread.sleep(5000);
		driver.manage().window().maximize();
	}
	

}
