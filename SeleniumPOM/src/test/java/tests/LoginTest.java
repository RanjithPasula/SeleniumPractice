package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.baseclass;
import pages.loginpage;

@Listeners(MyListener.class)

public class LoginTest extends baseclass{
	
	
	@Test

	public void logintest() throws InterruptedException {

		
		      loginpage lp = new loginpage();
		                lp.login();  
		          
		        
		        //logo  verification
		        
		        Assert.assertTrue(driver.findElement(By.id("headerPanel")).isDisplayed());
		                
		        // Title verification
		        
		        String actualTitle = driver.getTitle();
                
		        System.out.println(actualTitle);
		        Assert.assertEquals(actualTitle,
		                "ParaBanks | Accounts Overview");
		        //URL Verification
		        
		        String actualTitle1 = driver.getCurrentUrl();
		        
		         System.out.println(actualTitle1);
		        Assert.assertEquals(actualTitle1,"https://parabank.parasoft.com/parabank/login.htm5");
		      
		      
		     
		     //if you extends baseclass no needs baseclass.driver
		
		
	}
			
		
	}

	
