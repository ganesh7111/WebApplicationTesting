package com.seleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.*;

//Not Wotking
public class NestedFrames {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(2000);
		
		//Printing Text 1 in main document
		driver.findElement(By.id("name")).sendKeys("Text1");
		Thread.sleep(2000);

		
		//Switching to frame 3 and Entering Text
		
		driver.switchTo().frame("frm3");
		Thread.sleep(1000);
		Select DropDowns = new Select(driver.findElement(By.id("selectnav")));
		DropDowns.selectByVisibleText("-- Selenium");
		Thread.sleep(1000);
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Entered into Frame 3");
		Thread.sleep(2000);

		
		//Switching to frame 1 present inside frame 3 and selecting  java
		
		driver.switchTo().frame("frm1");
		Thread.sleep(1000);
		Select DropDown31 = new Select(driver.findElement(By.id("course")));
		DropDown31.selectByVisibleText("Java");
		Thread.sleep(2000);

		
		//Switching to frame 3 and Entering Text
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		Select DropDowns3 = new Select(driver.findElement(By.id("selectnav")));
		DropDowns3.selectByVisibleText("- Dot Net");
		Thread.sleep(1000);
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Coming From  Frame 1");
		Thread.sleep(2000);

		
		//Switching to frame 2 present in frame 3 
		
		driver.switchTo().frame("frm2");
		Thread.sleep(1000);
		driver.findElement(By.id("firstName")).sendKeys("Ganesh Kumar Neeli");
		Thread.sleep(2000);
		
		//Switching to frame 3 and Entering Text
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Nested Frames Completed !!");
		
		Thread.sleep(10000);
		driver.quit();
		
		
	}

}
