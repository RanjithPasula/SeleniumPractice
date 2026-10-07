package tests;

import org.testng.annotations.Test;

import base.baseclass;
import pages.accountsoverview;
import pages.loginpage;

public class accountsoverviewTest extends baseclass{
	
	@Test

	public void accountsoverview() throws InterruptedException {
		
	            
	  loginpage lp = new loginpage();
	  
	            lp.login();
	            
	   accountsoverview a0 = new accountsoverview();
	   
	            a0.accountslist();
	            
	           
		
		
	}

}
