package com.seleniumPractice;
import java.util.*;
import java.io.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.devtools.v131.filesystem.model.File;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestScreenShots {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		
		//***File***
		
		
		  java.io.File sourceFile = driver.getScreenshotAs(OutputType.FILE);
		  java.io.File destFile = new java.io.File("./ScreenShots/img1.jpg");
		  FileUtils.copyFile(sourceFile, destFile);
		  System.out.println("Screen Shot Saved");
		  driver.quit();
		  
		 
		
	}
}
