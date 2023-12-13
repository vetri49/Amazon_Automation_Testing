package com.simpilearn.seleniumtest.Amazon_application_AutomationTest.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LocateWebElementsTest {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		String siteurl="https://www.amazon.in";
		String driverpath="drivers/windows/geckodriver.exe";
		System.setProperty("webdriver.geckodriver.driver", driverpath);
		driver=new FirefoxDriver();
		driver.get(siteurl);
		locateElementsTest();
		driver.close();

	}
	public static void locateElementsTest() throws InterruptedException {
	
      Thread.sleep(1000);
		
		WebElement link=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"));
		
		link.click();
		Thread.sleep(1000);

		String expectedTitle = "Amazon.in Bestsellers: The most popular items on Amazon";
		String actualTitle = driver.getTitle();

		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Test is Passed ! I can locate the web elements using locators");
		} else {
			System.out.println("Test is Failed !");
		}

		System.out.println("Expected Title : " + expectedTitle);
		System.out.println("Actual Title : " + actualTitle);
		
		
	}

}
