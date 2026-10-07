package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.baseclass;
import pages.fundtransfer;
import pages.loginpage;

public class transferfundsTest extends baseclass{
	
     @Test

	public void transferfundstest() throws InterruptedException {
		
         
         loginpage lp = new loginpage();

         lp.login();
         
         fundtransfer ft = new fundtransfer();
         
         ft.fundtrans();
         
         Thread.sleep(2000);         
         String ss1 = driver.findElement(By.xpath("//h1[contains(text(),'Transfer Complete')]")).getText();
         
         System.out.println(ss1);
         
         if(ss1.equals("Transfer Complete!"))
         {
         System.out.println("Transfer completed successfully");
         }
         else
         {
         System.out.println("Transfer failed");
         }
         
     

	}

}
