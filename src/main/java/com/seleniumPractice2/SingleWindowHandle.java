package com.seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingleWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for(String windowHandle : windowHandles) {
			if(!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("Neeli Ganesh Kumar");
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("name")).sendKeys("Ganesh Tested");
		Thread.sleep(2000);
		driver.quit();	
	}
}
