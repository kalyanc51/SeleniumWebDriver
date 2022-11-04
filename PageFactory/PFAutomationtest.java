package PageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PFAutomationtest {
	
	WebDriver driver;
	
	PFAutomationlogin login;
	PFAutomationhomepage homepage;
	PFAutomationsignin signin;
	
	@BeforeTest
    public void setup()
    {
    	String driverPath = "C:\\Users\\KalyanChakravarthyCh\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe";

    	System.setProperty("webdriver.chrome.driver",driverPath);
           driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

            driver.get("http://automationpractice.com/index.php");
    }
        
    @Test() 
	
	public void successfulllogin()
	{ 
		
    	signin=new PFAutomationsignin(driver);
		signin.clicksignin();
    	login=new PFAutomationlogin(driver);
	    login.setUserName("Csr@gmail.com");
	    login.setPassword("complex");
	    login.clicklogin();
		homepage=new PFAutomationhomepage(driver);
		homepage.titleverification();
	}

}
