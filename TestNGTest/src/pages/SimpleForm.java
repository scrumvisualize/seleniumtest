package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SimpleForm {
	
	WebDriver driver;
	
	public void setSingleInput(String message){
		driver.findElement(By.id("user-message")).sendKeys(message);
	}
	
	public void clickShowMessage(){
		driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();
	}
	
	public String displayYourMessage(){
		return driver.findElement(By.id("display")).getText();	
	}
	
	public String setFirstInput(String a){
		driver.findElement(By.id("sum1")).sendKeys(a);
		return a;
	}
	
	public String setSecondInput(String b){
		driver.findElement(By.id("sum2")).sendKeys(b);
		return b;
	}
	
	public void clickGetTotal(){
		driver.findElement(By.xpath("//button[contains(text(),'Get Total')]")).click();
	}
	
	public String displayTotal(){	
		return driver.findElement(By.id("displayvalue")).getText();	
	}
	
	public SimpleForm(WebDriver driver){
		this.driver = driver;	
	}

}
