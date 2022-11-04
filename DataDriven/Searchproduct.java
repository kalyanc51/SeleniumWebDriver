package DataDriven;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import au.com.bytecode.opencsv.CSVReader;

public class Searchproduct {
		
	
	public static void main(String[] args) throws  InterruptedException, Exception {
		String driverPath = "C:\\Users\\KalyanChakravarthyCh\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);			
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		CSVReader reader = new CSVReader(new FileReader("C:\\Users\\KalyanChakravarthyCh\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Automationpractice\\MavenWebDriver\\TestResources\\SearchProduct.csv"));
		 
		 // this will load content into list
		  List<String[]> li=reader.readAll();
		  System.out.println("Total rows that we have is "+li.size());
		            
		 // create Iterator reference
		  Iterator<String[]>i1= li.iterator();
		    
		 // Iterate all values 
		 while(i1.hasNext()){
			 String[] str=i1.next();
		 
			 driver.findElement(By.id("search_query_top")).sendKeys(str[0]);
			 driver.findElement(By.name("submit_search")).click();
			 Thread.sleep(3000);
			 String title=driver.getTitle();
			 System.out.println(title);
		     driver.navigate().back();
		     driver.findElement(By.id("search_query_top")).clear();
		 }	   
		 driver.close();
		}
		 
}