package tests;

import org.testng.annotations.Test;

import base.baseclass;
import pages.loginpage;
import pages.requestloanpage;

public class requestloanTest extends baseclass {
	
	@Test

	public  void requestloan() throws InterruptedException {
		
		loginpage lp = new loginpage();

        lp.login();
        
       requestloanpage pg = new  requestloanpage();
       
        pg.reqloan();
        
        
      
    
	}

}
