package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.baseclass;

public class requestloanpage extends baseclass {
	
	public void reqloan() throws InterruptedException{
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Request Loan")).click();
		
		driver.findElement(By.id("amount")).sendKeys("1000");
		driver.findElement(By.id("downPayment")).sendKeys("100");
		
		WebElement dropdown4 = driver.findElement(By.id("fromAccountId"));
		
		 Select s55 = new Select(dropdown4);
		    
		     s55.selectByIndex(0); 
		
		 driver.findElement(By.xpath("//input[@value='Apply Now']")).click();
				 
				
	}
	
	

}
