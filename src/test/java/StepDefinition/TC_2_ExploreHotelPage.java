package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

public class TC_2_ExploreHotelPage extends TC_1_LoginPage {
	

	@When("User Enter the {string}, {string},{string},{string},{string},{string},{string} and {string}")
	public void user_enter_the_and(String location, String hotel, String roomtype, String num, String checkin, String checkout, String adult, String child) {
	 WebElement  loct=driver.findElement(By.xpath("//select[@name='location']"))  ;
	 loct.click();
	 Select select=new Select(loct);
	 select.selectByValue(location);
	
	 WebElement hotels=driver.findElement(By.id("hotels"));
	 Select select1=new Select(hotels);
	 select1.selectByVisibleText(hotel);
	 
	 WebElement  Rmtype=driver.findElement(By.xpath("//select[@id='room_type']"));
	 Select select2 =new Select(Rmtype);
	 select2.selectByVisibleText(roomtype);
	
	 WebElement  Roomnum=driver.findElement(By.id("room_nos"));
	 Select select3 =new Select(Roomnum);
	 select3.selectByVisibleText(num);
	
	 WebElement  CheckIndate=driver.findElement(By.id("datepick_in"));
	 Select select4 =new Select(CheckIndate);
	 select4.selectByVisibleText(checkin);
	
	 WebElement  Checkout=driver.findElement(By.id("datepick_out"));
	 Select select5 =new Select(Checkout);
	 select5.selectByVisibleText(checkout);
	
	 WebElement  Adult=driver.findElement(By.id("adult_room"));
	 Select select6 =new Select(Adult);
	 select6.selectByVisibleText(adult);
	
	 WebElement  Chilren=driver.findElement(By.id("child_room"));
	 Select select7 =new Select(Chilren);
	 select7.selectByVisibleText(child);
	
	 WebElement search=driver.findElement(By.id("Submit"));
	 search.click();
	}
	@Then("User should verify the Select Hotel Success message {string}")
	public void user_should_verify_the_select_hotel_success_message(String string) {
	   
	}




}
