package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsernamePassword {
	
	WebDriver driver;
	@BeforeTest
	public void launchurl()
	{
		 String driverPath = "C:\\Users\\KalyanChakravarthyCh\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe";
	    
	System.setProperty("webdriver.chrome.driver",driverPath);
	 driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
    }

	@DataProvider(name="Testdata")
    public  Object[][] getData()
    {
    	Object[][] data=new Object[3][2];
    	
    	data[0][0]="hgdyrtyggxyz3@gmail.com";
    	data[0][1]="Naveen@123";
    	
    	
    	data[1][0]="hgdyrtyggxyk@gmail.com";
    	data[1][1]="Naveen@123";
    	
    	data[2][0]="hgdyrtyggxyz1@gmail.com";
    	data[2][1]="Naveen@123";
    	
    	return data;
    }

		
		
	@Test(dataProvider="Testdata")
	public void searchproduct(String username,String password) throws Exception
	{
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys(username);
	    
	    driver.findElement(By.id("passwd")).sendKeys(password);
	    Thread.sleep(3000);
	    driver.findElement(By.id("SubmitLogin")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")).click();
	   
	}
	
}	
