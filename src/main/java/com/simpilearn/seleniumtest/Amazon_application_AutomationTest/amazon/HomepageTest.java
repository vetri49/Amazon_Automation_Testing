package com.simpilearn.seleniumtest.Amazon_application_AutomationTest.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomepageTest {

	public static void main(String[] args) {
		String siteurl="https://www.amazon.in";
		String driverpath="drivers/windows/geckodriver.exe";
		
		System.setProperty("webdriver.geckodriver.driver", driverpath);
		WebDriver driver=new FirefoxDriver();

		 driver.get(siteurl);
		 
		 String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		 String actualtitle=driver.getTitle();
		 
		 if(expectedTitle.equals(actualtitle)) {
			 System.out.println("Test is passed!");
		 }else {
			 System.out.println("Test is failed");
		 }
		 System.out.println("Expected title is : "+expectedTitle);
		 System.out.println("actaual title is : "+actualtitle);
		 driver.close();

	}

}
