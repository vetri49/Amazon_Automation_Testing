package com.simpilearn.seleniumtest.Amazon_application_AutomationTest.amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyUserSignedinTest {

	static WebDriver driver;
	public static void main(String[] args) {
		String siteurl="https://www.amazon.in";
		String driverpath="drivers/windows/geckodriver.exe";
		System.setProperty("webdriver.geckodriver.driver", driverpath);
		driver=new FirefoxDriver();
		driver.get(siteurl);
		
		driver.manage().window().maximize();

		signedin();
		driver.close();

	}
	public static void signedin() {
		WebElement signin=driver.findElement(By.id("nav-link-accountList"));
		signin.click();
		driver.findElement(By.id("ap_email")).sendKeys("xxxxxx111@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("xxxxxxxxxxxx");
		driver.findElement(By.id("signInSubmit")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement user=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")));
				if(user.getText().equals("Hello, Vetri")) {
					System.out.println("User is signed in  Amazon account!");
				}else {
					System.out.println("User is not signed in Amazon account");
				}
		System.out.println(user.getText());
		
		
		
	}

}
