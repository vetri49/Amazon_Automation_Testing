package com.simpilearn.seleniumtest.Amazon_application_AutomationTest.amazon;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FilltersUsingTest {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		String siteurl="https://www.amazon.in";
		String driverpath="drivers/windows/geckodriver.exe";
		System.setProperty("webdriver.geckodriver.driver", driverpath);
		driver=new FirefoxDriver();
		driver.get(siteurl);
		checkFillterTest();
		driver.close();

	}
	public static void checkFillterTest() throws InterruptedException {
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		driver.manage().window().maximize();
		searchBox.sendKeys("Nokia");
		searchBox.submit();
		System.out.println(searchBox.toString());
		
		
	
		
	}

}
