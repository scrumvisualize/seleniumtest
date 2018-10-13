package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Console;

import pages.CheckboxForm;
import utilities.CaptureScreenShot;

public class CheckboxFormTest {
	@BeforeClass
	public void launchBrowser(){
	System.setProperty("webdriver.chrome.driver", "C:\\Vinod\\Selenium\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	System.out.println("Testing the CheckboxDemo...");	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// Auto-generated catch block
		e.printStackTrace();
		}
	}
	//Author: Vinod
	//Modified on: 23-09-18
	//Details: Comments added: Simple test is automate the checkbox selection and display of message- "Check box is checked"
	@Test (enabled=true)
	public void singleCheckboxTest(){
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		CheckboxForm checkboxForm = new CheckboxForm(driver);
		checkboxForm.singlecheckboxClicked();		
		String message = checkboxForm.checkboxSuccessMessage();
		Assert.assertTrue(message.contains("Check box is checked"));
		System.out.println(message);		
		driver.quit();		
	}
	@Test(enabled=true)
	public void multipleCheckboxTest(){
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		CheckboxForm checkboxForm = new CheckboxForm(driver);
		checkboxForm.checkboxClick();
		checkboxForm.checkboxSelectALL();
		String buttonTextChanged = checkboxForm.changeTextOfChecboxButton();
		System.out.println(buttonTextChanged);		
		CaptureScreenShot capturescreenshot = new CaptureScreenShot();
		try {
			capturescreenshot.robo();
		} catch (Exception e) {
			// Auto-generated catch block
			e.printStackTrace();
			}
		Assert.assertEquals(buttonTextChanged, "Uncheck All");
		System.out.println(buttonTextChanged);		
		driver.quit();
	}
	
}
