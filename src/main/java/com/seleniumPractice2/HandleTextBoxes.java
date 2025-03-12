package com.seleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleTextBoxes {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		//login_field
		WebElement usernameTxt= driver.findElement(By.id("login_field"));
		if(usernameTxt.isDisplayed()) {
			if(usernameTxt.isEnabled()) {
				usernameTxt.sendKeys("Neeli");
				String Enteredtext = usernameTxt.getAttribute("value");
				System.out.println(Enteredtext);
				Thread.sleep(3000);
				usernameTxt.clear();
			}else {
				System.err.println("username is not Enabled !!");

			}
			
		}else
			System.err.println("username is not Displayed !!");	
	}
}
