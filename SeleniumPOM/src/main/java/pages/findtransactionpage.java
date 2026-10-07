package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.baseclass;

public class findtransactionpage extends baseclass {
	
	public void fundtran() {
		
		
		driver.findElement(By.linkText("Find Transactions")).click();
		
		WebElement fint = driver.findElement(By.id("accountId"));
		
		Select S2 = new Select(fint);
		
		         S2.selectByIndex(1);
		         
		driver.findElement(By.id("transactionDate")).sendKeys("09-30-2026");
		
		driver.findElement(By.id("findByDate")).click();	         
		 
		
	}

}
