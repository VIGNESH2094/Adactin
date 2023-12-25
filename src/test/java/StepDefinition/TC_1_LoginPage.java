package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class TC_1_LoginPage {
	
	static WebDriver driver;
	@Given("User is on the Hotel page")
	public void user_is_on_the_hotel_page() {
	    driver=new FirefoxDriver();
	   driver.get("https://adactinhotelapp.com/");
	   
	}
	@When("User Enter the {string} and {string}")
	public void user_enter_the_and(String string, String string2) {
		WebElement lgn=driver.findElement(By.id("username"));
		lgn.sendKeys(string);
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys(string2);
		WebElement clk=driver.findElement(By.id("login"));
		clk.click();
	   
	}
	@Then("User Should verify the login success message {string}")
	public void user_should_verify_the_login_success_message(String Successmessage) {
		WebElement sctxt=driver.findElement(By.xpath("//td[@class='welcome_menu']"));
		String text1 = sctxt.getText();
		boolean contains = text1.contains(Successmessage);
		Assert.assertTrue(contains,"verify the message");
		System.out.println("verifed the success Message");
		
	    
		
	}

	
	@When("User Enter the invalid  {string} and {string}")
	public void user_enter_the_invalid_and(String string, String string2) {
		WebElement lgn=driver.findElement(By.id("username"));
		lgn.sendKeys(string);
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys(string2);
		WebElement clk=driver.findElement(By.id("login"));
		clk.click();
	}




	
	

	
	
	@Then("User Should verify the error message {string}")
	public void user_should_verify_the_error_message(String Errormsg) {
		WebElement errtxt=driver.findElement(By.xpath("//div[@class='auth_error']"));
		String text = errtxt.getText();
		System.out.println(text);
		boolean contains = text.contains(Errormsg);
		Assert.assertTrue(contains, "verify the Error Message");
		System.out.println("verifed the Error Message");
		driver.quit();
	   
	}



}
