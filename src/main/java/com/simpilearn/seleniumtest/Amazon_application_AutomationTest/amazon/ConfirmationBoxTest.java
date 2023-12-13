package com.simpilearn.seleniumtest.Amazon_application_AutomationTest.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfirmationBoxTest {

	static WebDriver driver;
	public static void main(String[] args) {
		String siteurl="https://www.amazon.in";
		String driverpath="drivers/windows/geckodriver.exe";
		System.setProperty("webdriver.geckodriver.driver", driverpath);
		driver=new FirefoxDriver();
		driver.get(siteurl);
		confirmboxTest();

	}
	public static void confirmboxTest() {
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchBox.sendKeys("nokia");
		searchBox.submit();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]")).click();
		driver.findElement(By.xpath("//div[contains(@class, 'a-alert-success')]")).click();
	
		WebElement confirmbox=driver.findElement(By.xpath("//div[@class='confirmation-box']"));
		if(confirmbox.isDisplayed()) {
			System.out.println("Confirmation box is displayed");
		}else {
			System.out.println("Confirmation box is not displayed");
		}
	}

}
