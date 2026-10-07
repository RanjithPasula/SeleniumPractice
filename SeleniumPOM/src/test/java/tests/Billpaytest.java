package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.baseclass;
import pages.billpaypage;
import pages.loginpage;

public class Billpaytest extends baseclass {
	
	@Test

	public void billpaytest() throws InterruptedException {
		
        
              loginpage lp = new loginpage();

                     lp.login();
        
              billpaypage bp = new billpaypage();
        
                     bp.billp();
                     
                     Thread.sleep(5000);
        
        String ses = driver.findElement(By.xpath("//h1[contains(text(),'Bill Payment Complete')]")).getText();
        
                   System.out.println(ses);
     


	}

}
