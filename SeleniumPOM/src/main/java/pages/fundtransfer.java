package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.baseclass;

public class fundtransfer extends baseclass{
	
	public void fundtrans () {
		
		driver.findElement(By.linkText("Transfer Funds")).click();
		
		 driver.findElement(By.id("amount")).sendKeys("20");
		 
		  WebElement fromid = driver.findElement(By.id("fromAccountId"));
		  
		        Select sn = new Select(fromid);
		        
		               sn.selectByIndex(0);
		               
		  WebElement toid = driver.findElement(By.id("fromAccountId"));
		     		  
				Select sb = new Select(toid);
				      
				       sb.selectByIndex(1);
		
		 driver.findElement(By.xpath("//input[@class=\"button\"]")). click ();
		 
		 
	}

}
