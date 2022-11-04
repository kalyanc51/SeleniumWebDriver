package DataDriven;

import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;


public class ReadXML {
	
	static String driverPath = "C:\\Users\\KalyanChakravarthyCh\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe";
	
	
	@Test
	@Parameters({"product"})
	public void login(@Optional("yellowdresses")String dresses) throws Exception
	{
		System.setProperty("webdriver.chrome.driver",driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("search_query_top")).sendKeys("yellowdresses");
			 driver.findElement(By.name("submit_search")).click();
			 Thread.sleep(3000);
			 String title=driver.getTitle();
			 System.out.println(title);
			 
		     driver.navigate().back();
		     driver.findElement(By.id("search_query_top")).clear();
		 }	   
		}

   
