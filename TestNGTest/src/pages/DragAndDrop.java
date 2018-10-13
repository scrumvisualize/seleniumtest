package pages;

import javax.xml.datatype.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {	
	WebDriver driver;
	
	public DragAndDrop(WebDriver driver){
		this.driver = driver;
	}
	
	public void dragAnItem(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   //Element on which need to drag.
		//driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]/span[1]")).click();	
		WebElement source = driver.findElement(By.xpath("//span[contains(text(),'Draggable 1')]"));
		//WebElement source = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]/span[1]"));	
				//Element on which need to drop.		
		WebElement target = driver.findElement(By.xpath("//*[@id='mydropzone']"));
		
		//Using Actions class for drag and drop.		
		Actions builder = new Actions(driver);	
		//Using Action for Dragged and dropped.
		 //builder.dragAndDrop(source, target).build().perform();	
		 //new Actions(driver).dragAndDrop(source, target).build().perform();		
		(new Actions(driver)).clickAndHold(source).moveToElement(target).release(source).build().perform();
	    	   	
	}
	
	public String droppedItem(){
		return driver.findElement(By.id("droppedlist")).getText();
		//return driver.findElement(By.xpath("//div[@id='droppedlist']")).getText();
	}
	


}
