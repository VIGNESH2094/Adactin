package Adactin_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel {
	public static void main(String[]args) {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://adactinhotelapp.com/");
	
	WebElement user=driver.findElement(By.id("username"));
	user.sendKeys("vignesh94");
	WebElement pass=driver.findElement(By.id("password"));
	pass.sendKeys("8ZG7YG");
	
	driver.findElement(By.id("login")).click();
	
	 WebElement  loct=driver.findElement(By.xpath("//select[@name='location']"))  ;
	 
	 Select select=new Select(loct);
	 select.selectByVisibleText("Brisbane");
	
	 WebElement hotels=driver.findElement(By.id("hotels"));
	 Select select1=new Select(hotels);
	 select1.selectByVisibleText("Hotel Hervey");
	 
	 WebElement  Rmtype=driver.findElement(By.xpath("//select[@id='room_type']"));
	 Select select2 =new Select(Rmtype);
	 select2.selectByVisibleText("Double");
	
	 WebElement  Roomnum=driver.findElement(By.id("room_nos"));
	 Select select3 =new Select(Roomnum);
	 select3.selectByVisibleText("3 - Three");
	
	
	
	 WebElement  Adult=driver.findElement(By.id("adult_room"));
	 Select select6 =new Select(Adult);
	 select6.selectByVisibleText("3 - Three");
	
	
	 WebElement search=driver.findElement(By.id("Submit"));
	 search.click();
	

}
}