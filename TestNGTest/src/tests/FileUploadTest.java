package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FileUpload;

public class FileUploadTest {
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
	
	@Test(enabled=true)
	public void fileUploadTest(){		
		String url = "https://encodable.com/uploaddemo/";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		FileUpload fileupload = new FileUpload(driver);
		fileupload.chooseFile();		
		fileupload.setEmailAddress();
		fileupload.setFirstName();
		fileupload.beginUpload();		
		String fileName = fileupload.getsuccessMessage();
		System.out.println(fileName);
		Assert.assertTrue(fileName.contains("Your upload is complete:"));
		driver.quit();	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub..

	}

}
