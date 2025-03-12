package com.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;

// links---buttons---radio buttons---checkboxes 

public class HandleBasicHtmlControls {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("hindichbx")).click();
		Thread.sleep(3000);
		WebElement chinesechk = driver.findElement(By.id("chinesechbx"));
		chinesechk.click(); //check
		if(chinesechk.isSelected()) {
			Thread.sleep(3000);
			chinesechk.click(); //uncheck
		}
		Thread.sleep(3000);
		driver.findElement(By.id("msg")).click();
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(3000);
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
	}

}
