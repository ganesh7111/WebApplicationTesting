package com.seleniumPractice; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.*; 
import org.openqa.selenium.support.ui.Select;  
import io.github.bonigarcia.wdm.WebDriverManager;  

public class Frames {  
    public static void main(String[] args) throws InterruptedException {  
        WebDriverManager.chromedriver().setup();  
        WebDriver driver = new ChromeDriver();  
        driver.manage().window().maximize();  
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");  
        Thread.sleep(2000);  

        // Enter Text 1 in parent frame
        driver.findElement(By.id("name")).sendKeys("Text 1");  
        Thread.sleep(2000);  

        // Switch to first frame and select Java
        driver.switchTo().frame("frm1");  
        Select courseName_DropDown = new Select(driver.findElement(By.id("course")));  
        courseName_DropDown.selectByVisibleText("Java");  
        Thread.sleep(2000);  

        // Switch back to main content
        driver.switchTo().defaultContent();  
        Thread.sleep(2000);  

        // Enter Text 2 in parent frame
        driver.findElement(By.id("name")).clear();  
        driver.findElement(By.id("name")).sendKeys("Text 2");  
        Thread.sleep(2000);  

        // Switch to second frame and enter first name
        driver.switchTo().frame("frm2");  
        driver.findElement(By.id("firstName")).sendKeys("Ganesh Kumar Neeli");  
        Thread.sleep(2000);  

        // Switch back to main content before going to another frame
        driver.switchTo().defaultContent();  
        Thread.sleep(2000);  

        // Switch again to first frame and select Python
        driver.switchTo().frame("frm1");  
        Select courseName_DropDown2 = new Select(driver.findElement(By.id("course")));  
        courseName_DropDown2.selectByVisibleText("Python");  
        Thread.sleep(2000);  

        // Switch back to main content
        driver.switchTo().defaultContent();  
        Thread.sleep(2000);  

        // Final text entry
        driver.findElement(By.id("name")).clear();  
        driver.findElement(By.id("name")).sendKeys("Automation Completed");  

        // Close driver (optional)
        driver.quit();  
    }  
}
