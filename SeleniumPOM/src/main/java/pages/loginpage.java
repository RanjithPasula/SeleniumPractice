package pages;

import org.openqa.selenium.By;


import base.baseclass;

public class loginpage extends baseclass {
	
	public void login() {
		
		driver.findElement(By.name("username")).sendKeys("sas");
		driver.findElement(By.name("password")).sendKeys("sas");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		
	}

}
