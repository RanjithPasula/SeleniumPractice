package tests;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.baseclass;

public class MyListener implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		try {
		
		        TakesScreenshot ts = (TakesScreenshot)baseclass.driver;
				
				File scr =ts.getScreenshotAs(OutputType.FILE);
				
				File dest =new File("./Screenshots/listeererror.png");
				
				FileUtils.copyFile(scr, dest);}
		
		catch (Exception e) {
			
			e.printStackTrace();
			}
		
		
		
	}
	

}
