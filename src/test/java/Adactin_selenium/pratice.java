package Adactin_selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class pratice {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://adactinhotelapp.com/");

		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("vignesh94");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("8ZG7YG");

		driver.findElement(By.id("login")).click();
		ArrayList<String>actual=new ArrayList<>();

		WebElement loct = driver.findElement(By.xpath("//select[@name='location']"));

		Select select = new Select(loct);
		List<WebElement> options = select.getOptions();
		 
		
		
		
		for (WebElement webElement : options) {

			String text2 = webElement.getText();
			 
			actual.add(text2);
			
			
			 
		}
		System.out.println(actual);
		
         ArrayList<String> expected=new ArrayList<>();
			File file = new File("C:\\Users\\Prabhu\\eclipse-workspace\\Org_Vignesh_adactin\\FrameWorkbook.xlsx");
			FileInputStream stream = new FileInputStream(file);
			Workbook book = new XSSFWorkbook(stream);
			Sheet sheet = book.getSheet("Sheet1");

			for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
				Row row = sheet.getRow(i);

				for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
					Cell cell = row.getCell(j);
					String string = cell.toString();
					expected.add(string);				}
				
			}
			System.out.println(expected);
			
			if (expected.size()==actual.size()) {
				System.out.println("vignesh");
			}
			else {
				System.out.println("not vignesh");
			}
          
		}
	}


