package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.baseclass;

public class openaccountpage extends baseclass{
	
	public void openaccount() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[contains(text(),'Open New Account')]")).click();
		
		Thread.sleep(2000);
		
		WebElement dropdown1 = driver.findElement(By.id("type"));
		
		    Select s5 = new Select(dropdown1);
		    
		       s5.selectByIndex(1);
		   
		 WebElement dropdown2 = driver.findElement(By.id("fromAccountId"));
				
			 Select s6= new Select(dropdown2);
			    
			     s6.selectByIndex(0); 
		  
        driver.findElement(By.xpath("//input[@value=\"Open New Account\"]")).click();
		    
		    
		    
		
		
	}
	
	

}
