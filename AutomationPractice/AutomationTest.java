package AutomationPractice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class AutomationTest {
	
	

	WebDriver driver;

    Automationlogin objLoginPage;

    Automationsignin objsignin;
    
    Automationhomepage objhomepage; 
   
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
    public void validateSuccessfulLogin() 
    {
    	objsignin=new Automationsignin(driver);
    	objsignin.clickSigninLink();
    	
    	objLoginPage=new Automationlogin(driver);
    	objLoginPage.setUserName("Csr@gmail.com");
    	objLoginPage.setPassword("complex");
    	objLoginPage.clickLogin();
    	
    	objhomepage=new Automationhomepage(driver);
    	objhomepage.titleverification();
    	
   }

	


}
