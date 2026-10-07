package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.baseclass;

public class accountsoverview extends baseclass {
	
	public void accountslist() {
		
		driver.findElement(By.linkText("Accounts Overview")).click();
		
		driver.findElement(By.linkText("17340")).click();
		
		    WebElement monthsele = driver.findElement(By.id("month"));
		
		      Select S8 = new Select(monthsele);
		
		        S8.selectByIndex(10);
		    
		     WebElement transtype = driver.findElement(By.id("transactionType"));
				
				Select S9 = new Select(transtype);
				
				     S9.selectByIndex(0);
				     
		driver.findElement(By.xpath("//input[@class=\"button\"]")) .click();
		
		
		  
		
		
		
		

}

}