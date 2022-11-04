package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadDataProvider {
	WebDriver driver;
	@BeforeTest
	public void launch() {
		
	
	 String driverPath = "C:\\Users\\KalyanChakravarthyCh\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe";
	 System.setProperty("webdriver.chrome.driver",driverPath);
		 driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}
	@DataProvider(name="Testdata")
    public  Object[] getData()
    {
    	Object[] data=new Object[3];
    	
    	data[0]="blue dresses";
    	data[1]="green dresses";
    	data[2]="orange dresses";
    	return data;
    }
	
	@Test(dataProvider="Testdata")
	public void searchproduct(String product) throws Exception
	{
		
		driver.findElement(By.id("search_query_top")).sendKeys(product);
	    driver.findElement(By.name("submit_search")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("search_query_top")).clear();
	}
}
