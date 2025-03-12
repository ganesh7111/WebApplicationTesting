package com.seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDowns {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		//Single Selection DropDown//
		Thread.sleep(3000);
		
		  WebElement courseElement = driver.findElement(By.id("course")); Select
		  courseNameDropDown = new Select(courseElement); 
		  List<WebElement>DropDownOptions = courseNameDropDown.getOptions();
		  
		  for( WebElement options :DropDownOptions ) { 
			  System.out.println(options.getText()); 
			  }
		  
		  courseNameDropDown.selectByIndex(1); //Selects Java
		  Thread.sleep(3000);
		  courseNameDropDown.selectByValue("net"); //Selects Dot Net
		  Thread.sleep(3000); 
		  courseNameDropDown.selectByVisibleText("Javascript");//Selects javascript 
		  Thread.sleep(3000); String selectText =courseNameDropDown.getFirstSelectedOption().getText();
		  System.out.println("Selected visible text :" + selectText);

	}

}
