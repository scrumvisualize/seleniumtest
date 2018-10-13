package tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AlertPage;
import utilities.WriteAndSaveToFile;

public class AlertPageTest {
	@BeforeClass
	public void launchBrowser(){
	System.setProperty("webdriver.chrome.driver", "C:\\Vinod\\Selenium\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	System.out.println("Testing the Alert Message...");	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	//Author: Vinod
	//Modified on: 23-09-18
	//Details: Comments added: Sample test to automate the alert message and display of message-"Normal success message"
	@Test(enabled=true)
	public void alertTestMessage(){
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
		driver.manage().window().maximize();
		AlertPage alertPage = new AlertPage(driver);
		alertPage.clickNormalSuccessMessage();		
		String message = alertPage.checkDisplayAlert();
		System.out.println(message);	
		WriteAndSaveToFile wstf = new WriteAndSaveToFile();
		wstf.writeAndSaveText(message);
		Assert.assertEquals(message, "Normal success message");
		driver.close();
		driver.quit();			
	}

}
