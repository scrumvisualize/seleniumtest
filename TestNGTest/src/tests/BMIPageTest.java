package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.BMIPage;

public class BMIPageTest {
	@BeforeClass
	public void launchBrowser(){
	System.setProperty("webdriver.chrome.driver", "C:\\Vinod\\Selenium\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	System.out.println("Testing the Simple Form....");	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	
	@Test(enabled=false)
	public void bmiCalculatorTest(){
		WebDriver driver = new ChromeDriver();
		driver.get("https://elementinn.com/MyFirstJavaTest/bmi.jsp");
		BMIPage bmiPage = new BMIPage(driver);
		bmiPage.setInputWeight("79");
		bmiPage.setInputHeight("172");
		bmiPage.clickBMIButton();
		String bmiValue = bmiPage.displayBMIValue();		
		try{
			double bmiDoublevalue = Double.parseDouble(bmiValue); 
			Assert.assertEquals(bmiDoublevalue, 26.70);			
		 }catch(NumberFormatException ex){ // handle your exception
			 ex.printStackTrace();  
		}
		String bmiText = bmiPage.displayBMIText();				
		Assert.assertTrue(bmiText.contains("Over Weight"));
		driver.quit();	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub..

	}

}
