package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxForm {
	WebDriver driver;
	
	public void singlecheckboxClicked(){
		driver.findElement(By.id("isAgeSelected")).click();
	}
	
	public String checkboxSuccessMessage(){
		return driver.findElement(By.id("txtAge")).getText();	
	}
	
	public void checkboxClick(){				
		driver.findElement(By.id("check1")).click();		
	}
	
	public void checkboxSelectALL(){
		driver.findElement(By.cssSelector("input[class='cb1-element']")).isSelected();
	}
	
	public String changeTextOfChecboxButton(){
		String button_text = driver.findElement(By.id("check1")).getAttribute("value");		
		System.out.println("Multiple select Button:" +button_text);
		return button_text;
	}
	
	public CheckboxForm(WebDriver driver){
		this.driver = driver; 
	}

}
