package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {
	WebDriver driver;
	String filePath = "C:/Vinod/Project/image1.JPG";
	String emailaddress = "test@test.com";
	String first_name = "Guest";
	
	public void chooseFile(){	
		driver.findElement(By.id("uploadname1")).sendKeys(filePath);
	}
	
	public void beginUpload(){	
		driver.findElement(By.id("uploadbutton")).click();
	}
	
	public void setEmailAddress(){	
		driver.findElement(By.id("formfield-email_address")).sendKeys(emailaddress);
	}
	public void setFirstName(){	
		driver.findElement(By.id("formfield-first_name")).sendKeys(first_name);
	}
	
	public String getsuccessMessage(){	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fcuploadsummary"))).getText();			
	}
	
	public FileUpload(WebDriver driver){		
		this.driver = driver;
	}

}
