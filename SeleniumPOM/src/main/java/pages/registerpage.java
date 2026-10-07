package pages;

import org.openqa.selenium.By;

import base.baseclass;

public class registerpage extends baseclass {
	
	public void register(){
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("customer.firstName")).sendKeys("shai");	
		driver.findElement(By.id("customer.lastName")).sendKeys("hope");	
		driver.findElement(By.id("customer.address.street")).sendKeys("uppal");	
		driver.findElement(By.id("customer.address.city")).sendKeys("Hyderabad");
		driver.findElement(By.id("customer.address.state")).sendKeys("Telangana");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("500062");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("9652538914");
		driver.findElement(By.id("customer.ssn")).sendKeys("12345");
		driver.findElement(By.id("customer.username")).sendKeys("rk10");	
		driver.findElement(By.id("customer.password")).sendKeys("12345");	
		driver.findElement(By.id("repeatedPassword")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
	
		}
		
		
	}

