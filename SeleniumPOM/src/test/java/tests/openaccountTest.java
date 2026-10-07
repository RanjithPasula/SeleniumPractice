package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.baseclass;
import pages.loginpage;
import pages.openaccountpage;

public class openaccountTest extends baseclass {
	
	@Test
	
	public void openaccounttest() throws InterruptedException {
		
		
		 loginpage lp = new loginpage();
		         lp.login();
		         
        openaccountpage op = new openaccountpage();
                 op.openaccount();
                 
               Thread.sleep(3000);
        String accNo = baseclass.driver.findElement(By.id("newAccountId")).getAttribute("innerHTML");

                 System.out.println("Account Number = " + accNo);
                  
                 
                
        
	}

}
