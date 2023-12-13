package com.simpilearn.seleniumtest.Amazon_application_AutomationTest.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyProductsTest {

	static WebDriver driver;
	public static void main(String[] args) {
		String siteurl="https://www.amazon.in";
		String driverpath="drivers/windows/geckodriver.exe";
		System.setProperty("webdriver.geckodriver.driver", driverpath);
		driver=new FirefoxDriver();
		driver.get(siteurl);
		addProductstoWishlist();
		driver.close();
	}
	public static void addProductstoWishlist() {
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	
		searchBox.sendKeys("nokia");
		searchBox.submit();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]")).click();
		WebElement wishlist=driver.findElement(By.xpath("//div[contains(@class, 'a-alert-success')]"));
		if(wishlist.isDisplayed()) {
			System.out.println("Products are added to wishlist");
		}else {
			System.out.println("Products are not added to wishlist");
		}
	}

}
