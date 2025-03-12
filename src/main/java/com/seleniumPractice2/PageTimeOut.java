package com.seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class PageTimeOut {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//
		Instant StartTime = Instant.now();
		System.out.println("Start Time"+StartTime.toString());
		//
		driver.get("https://github.com/login");
		//
		Instant EndTime = Instant.now();
		System.out.println("Entd Time"+StartTime.toString());
		//
		Duration duration = Duration.between(StartTime, EndTime);
		System.out.println("Total Time to Load : " + duration.toMillis() + "Milliseconds");
		//
		System.out.println(driver.getTitle());
		//
		driver.quit();
		
	}

}
