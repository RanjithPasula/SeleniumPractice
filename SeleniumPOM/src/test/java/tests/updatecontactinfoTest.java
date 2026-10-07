package tests;

import org.testng.annotations.Test;

import base.baseclass;
import pages.loginpage;
import pages.updatecontactpage;

public class updatecontactinfoTest extends baseclass{
	 @Test

	public void updatecontact() {
		 
		 loginpage lp = new loginpage();

         lp.login();
         
         updatecontactpage uc = new updatecontactpage();
         
         uc.updateinfo();
         
       
         
	}

}
