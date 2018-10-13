package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPage {
	WebDriver driver;
	
	public void clickNormalSuccessMessage(){
		driver.findElement(By.id("normal-btn-success")).click();	
	}
	public String checkDisplayAlert() {
		String text = null;
	    try {
//	        WebDriverWait wait = new WebDriverWait(driver, 5);
//	        wait.until(ExpectedConditions.alertIsPresent());
	    	driver.switchTo().activeElement();
	        //Alert alert = driver.switchTo().alert();
	        text = driver.switchTo().activeElement().getText();
	        System.out.println("JIKJKJKJKJK:" +text);	
	    } catch (Exception e) {
	        //exception handling
	    }
	   return text;
	}
		
	public void closeAlert(){		
		driver.findElement(By.cssSelector("close")).click();	 
	}
	
	public AlertPage(WebDriver driver){
		this.driver = driver;	
	}

}
