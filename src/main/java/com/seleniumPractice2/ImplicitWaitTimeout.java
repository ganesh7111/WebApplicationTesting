package com.seleniumPractice2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitTimeout {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Intializing Implicit Wait Time
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1000, 1000));
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        //finding TextBox 1
        driver.findElement(By.id("btn1")).click();
        //finding and sendingKeys the the displayed textBox1
        driver.findElement(By.id("txt1")).sendKeys("Testing TextBox1....");
        //finding TextBox2
        driver.findElement(By.id("btn2")).click();
        //finding and sendingKeys the the displayed textBox2
        driver.findElement(By.id("txt2")).sendKeys("Testing TextBox2....");






    }
}
