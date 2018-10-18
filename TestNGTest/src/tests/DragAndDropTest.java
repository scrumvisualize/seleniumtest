package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DragAndDrop;



public class DragAndDropTest {
	
	@Test (enabled=true)
	public void dragAndDropTest(){
		System.setProperty("webdriver.chrome.driver", "C:\\Vinod\\Selenium\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();		
		driver.get("http://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		driver.manage().window().maximize();		               
	    driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		DragAndDrop dragandDrop = new DragAndDrop(driver);
		dragandDrop.dragAnItem();				
	    String droppedText = dragandDrop.droppedItem();
	    System.out.println("AfterDrop:" + droppedText);	
	    Assert.assertTrue(droppedText.equals("Draggable 1"));
	    driver.close();
		driver.quit();	
		
		
	}

}
