package com.seleniumPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLibraries {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://chatgpt.com/");
	}
}
