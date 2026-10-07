package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.baseclass;

public class updatecontactpage extends baseclass {
	
	public void updateinfo() {
		
		driver.findElement(By.linkText("Update Contact Info")).click();
		

		WebElement se = driver.findElement(By.id("customer.firstName"));
		
		          se.clear();
		          se.sendKeys("saber");
		
		WebElement se1 = driver.findElement(By.id("customer.lastName"));
		
		          se1.clear();
		          se1.sendKeys("khan");
		          
		driver.findElement(By.xpath("//input[@value=\"Update Profile\"]")).click();
		
		
	}

}
