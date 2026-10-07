package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

    public class baseclass {

	public static WebDriver driver;
	
    @BeforeMethod
	public void launchBrowser() {
	
	driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://parabank.parasoft.com/parabank/index.htm");}
    
    @AfterMethod
	public void logout() throws InterruptedException {
		
    Thread.sleep(5000);
  //	driver.quit();
	
    }
	}




