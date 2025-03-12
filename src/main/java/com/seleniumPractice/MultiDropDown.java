package com.seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class MultiDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		WebElement IdeName =driver.findElement(By.id("ide"));
		Select IdeNameOptions = new Select(IdeName);
		List<WebElement> CourseOptions = IdeNameOptions.getOptions();
		for(WebElement Options : CourseOptions) {
			System.out.println(Options.getText());
		}
		Thread.sleep(3000);
		IdeNameOptions.selectByIndex(1);
		Thread.sleep(3000);
		IdeNameOptions.selectByVisibleText("IntelliJ IDEA");
		Thread.sleep(3000);
		IdeNameOptions.selectByValue("vs");
		Thread.sleep(3000);
		IdeNameOptions.deselectByVisibleText("IntelliJ IDEA");
	}
}
