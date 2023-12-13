package com.simpilearn.seleniumtest.Amazon_application_AutomationTest.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchBoxTest {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		String siteurl="https://www.amazon.in";
		String driverpath="drivers/windows/geckodriver.exe";
		System.setProperty("webdriver.geckodriver.driver", driverpath);
		driver=new FirefoxDriver();
		driver.get(siteurl);
		
		searchProductTest("Iphone 13");
		driver.close();
		

	}
	public static void searchProductTest(String product) throws InterruptedException {
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Iphone 13");
		searchBox.submit();
		Thread.sleep(2000);
		
		String expectedTitle = "Amazon.in : "+product;
		String actualTitle = driver.getTitle();

		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Test is Passed !");
		} else {
			System.out.println("Test is Failed !");
		}

		System.out.println("Expected Title : " + expectedTitle);
		System.out.println("Actual Title : " + actualTitle);
	}

}
