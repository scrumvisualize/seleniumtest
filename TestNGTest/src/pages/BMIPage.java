package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BMIPage {
	
	WebDriver driver;
	public void setInputWeight(String weight ){
		driver.findElement(By.id("bw1")).sendKeys(weight);
	}
	public void setInputHeight(String height ){
		driver.findElement(By.id("bh2")).sendKeys(height);	}
	
	public String displayBMIValue(){
		return driver.findElement(By.id("bmifinal2")).getText();	
	}
	
	public String displayBMIText(){
		return driver.findElement(By.id("bmi3")).getText();	
	}
	public void clickBMIButton(){		
		//driver.findElement(By.xpath("input[type=button]")).click();
		
		driver.findElement(By.xpath("//input[@type='button'][@value='BMI']")).click();
	}
	
	public BMIPage(WebDriver driver){		
		this.driver = driver;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
