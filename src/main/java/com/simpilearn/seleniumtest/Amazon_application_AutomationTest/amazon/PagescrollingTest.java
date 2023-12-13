package com.simpilearn.seleniumtest.Amazon_application_AutomationTest.amazon;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PagescrollingTest {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		String siteurl="https://www.amazon.in";
		String driverpath="drivers/windows/geckodriver.exe";
		System.setProperty("webdriver.geckodriver.driver", driverpath);
		driver=new FirefoxDriver();
		driver.get(siteurl);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 2000)");

        Thread.sleep(2000);
        

        Long scrollPosition = (Long) js.executeScript("return window.pageYOffset;");
        System.out.println("Scroll position: " + scrollPosition);
        driver.close();
		

	}

}
