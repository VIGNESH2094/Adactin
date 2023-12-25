package Adactin_selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Slider.html");
//		
//		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
		
		WebElement src=driver.findElement(By.xpath("//a[@style='left: 0%;']"));
		
		Thread.sleep(2000);
		WebElement dest=driver.findElement(By.xpath("//a[@style='left: 30%;']"));
		dest.click();
		
//		Actions action=new Actions(driver);
//		action.dragAndDrop(src, dest).perform();
//		

		
	}

}
