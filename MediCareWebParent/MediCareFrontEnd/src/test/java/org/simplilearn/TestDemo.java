package org.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo {

	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver", "/Users/abhinav/Documents/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/MediCare");
		
		
		driver.findElement(By.xpath("//input[@name='keyword']")).sendKeys("abhinav");
	}
	

}
