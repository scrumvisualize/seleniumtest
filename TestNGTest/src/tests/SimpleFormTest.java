package tests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.SimpleForm;
import utilities.CaptureScreenShot;
public class SimpleFormTest {
	
	@BeforeClass
	public void launchBrowser(){
	System.setProperty("webdriver.chrome.driver", "C:\\Vinod\\Selenium\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	System.out.println("Testing the Simple Form....");	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	
	@Test (enabled=true)
	public void showMessageTest(){
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
		SimpleForm simpleForm = new SimpleForm(driver);
		simpleForm.setSingleInput("Wonderful");
		simpleForm.clickShowMessage();
		String message = simpleForm.displayYourMessage();
		Assert.assertTrue(message.contains("Wonderful"));	
		driver.quit();
		
	}
	@Test (enabled=false)
	public void calculateTotal(){
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
		SimpleForm simpleForm = new SimpleForm(driver);
		simpleForm.setFirstInput("100");
		simpleForm.setSecondInput("175");
		simpleForm.clickGetTotal();
		String total = simpleForm.displayTotal();
		CaptureScreenShot capturescreenshot = new CaptureScreenShot();
		try {
			capturescreenshot.robo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(total.equals("275"));	
		driver.quit();
		
		
	}

}
