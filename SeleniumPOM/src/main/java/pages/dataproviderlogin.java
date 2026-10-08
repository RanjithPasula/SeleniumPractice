package pages;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.baseclass;

public class dataproviderlogin extends baseclass {

	@DataProvider
	public Object[][] logindata() {

		return new Object[][] {

				{ "sk1", "12345" }, { "sk2", "12345" }

		};
	}

	@Test(dataProvider = "logindata")
	public void loginTest(String uname, String pwd) {

		driver.findElement(By.name("username")).sendKeys(uname);

		driver.findElement(By.name("password")).sendKeys(pwd);

		driver.findElement(By.xpath("//input[@value='Log In']")).click();

		System.out.println(uname);
		System.out.println(pwd);
	}
}