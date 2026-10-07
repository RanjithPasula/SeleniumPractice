package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.baseclass;
import pages.registerpage;

public class RegisterTest extends baseclass{
	
	@Test

	public void registerTest() {

          
               
           registerpage rp = new registerpage();
                rp.register();
                
         String name = baseclass.driver.findElement(By.xpath("//h1[@class='title']")).getText();
         
          
          System.out.println(name);
          
        
        		  
	}

}
