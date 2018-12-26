package com.ibm.ass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	

public class Coup {
		public static WebDriver driver;

		   public static void main(String[] args)
		   {
			   
		  
	    	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	        driver= new ChromeDriver();       
	        driver.get("https://atozgroceries.com/admin");
	        driver.manage().window().maximize();
driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[1]/div/input")).sendKeys("demo@atozgroceries.com");        
driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[2]/div/input")).sendKeys("456789");
driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/button")).click();
driver.findElement(By.linkText("Marketing")).click();	
driver.findElement(By.linkText("Coupons")).click();
Select fruits = new Select(driver.findElement(By.id("fruits")))
Select drpDelete = new Select(driver.findElement(By.name("Delete")).click();
		
}  
}
