package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.baseclass;

public class billpaypage extends baseclass {
	
	public void billp() throws InterruptedException {
	
	driver.findElement(By.linkText("Bill Pay")).click();
	
	driver.findElement(By.name("payee.name")).sendKeys("anil");
	driver.findElement(By.name("payee.address.street")).sendKeys("unesh chnadras statue");
	driver.findElement(By.name("payee.address.city")).sendKeys("sr nagar, hyder");
	driver.findElement(By.name("payee.address.state")).sendKeys("telangan");
	driver.findElement(By.name("payee.address.zipCode")).sendKeys("500038");
	driver.findElement(By.name("payee.phoneNumber")).sendKeys("9652538914");
	driver.findElement(By.name("payee.accountNumber")).sendKeys("17340");
	driver.findElement(By.name("verifyAccount")).sendKeys("17340");
	driver.findElement(By.name("amount")).sendKeys("15");
	 
	WebElement acc = driver.findElement(By.name("fromAccountId"));
	
	Select S2 = new Select(acc);
	
	         S2.selectByIndex(1);
	        
	driver.findElement(By.xpath("//input[@value='Send Payment']")).click();

	         
	      
	   
}
}
