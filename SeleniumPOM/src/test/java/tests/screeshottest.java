package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.baseclass;
import pages.loginpage;

public class screeshottest extends baseclass{
	
	@Test

	public void screenshots() throws IOException {
	
	        loginpage lp = new loginpage();
            lp.login(); 
 
            String actualTitle = driver.getTitle();
            
            try {
           
	        Assert.assertEquals(actualTitle,
	                "ParaBank | Accounts Overview");
	        
            System.out.println("Test Passed");
            
            } catch(AssertionError e){
            	
            	
            	System.out.println("Test Failed");
            
            TakesScreenshot ts = (TakesScreenshot) driver;
       
            File scr = ts.getScreenshotAs(OutputType.FILE);
       
            File dest = new File("./Screenshots/login.png");
        
            FileUtils.copyFile(scr,dest);
        
           System.out.println("Screenshot Takes successfully");
       
           System.out.println(dest.getAbsolutePath());
           
           throw e;
           
            }
       
}

}