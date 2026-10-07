package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.baseclass;
import pages.findtransactionpage;
import pages.loginpage;

public class findtransactionTest extends baseclass{
	
	@Test

	public void findtransactionpage() throws InterruptedException {
		
  
          loginpage lp = new loginpage();

               lp.login();
               
          findtransactionpage fp = new findtransactionpage();
     
               fp.fundtran();
               
              Thread.sleep(3000);
              
        String ses1 = driver.findElement(By.xpath("//h1[contains(text(),'Transaction Results')]")).getText();
              
              System.out.println(ses1);
 
	}

}
