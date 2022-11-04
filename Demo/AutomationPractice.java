package Demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomationPractice {
	@Test
	public void Login()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\KalyanChakravarthyCh\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver= new ChromeDriver();
		    
		    driver.navigate().to("http://automationpractice.com/index.php");
		    driver.manage().window().maximize();
		    
		    String Title=driver.getTitle();
		    System.out.println("The Title of the page is - " +Title);
		    
		    driver.findElement(By.linkText("Sign in")).click();
		    
		    driver.findElement(By.id("email")).sendKeys("Csr@gmail.com");
		    
		    driver.findElement(By.id("passwd")).sendKeys("complex");
		    
		    driver.findElement(By.id("SubmitLogin")).click();
		    
		    System.out.println("Login Succesful");
		            
		    if(driver.findElement(By.linkText("csr complex")).isDisplayed()) {
		        System.out.println("Login is Succesfull"+ driver.findElement(By.linkText("csr complex")).getText());
		    }
		        else {
		            driver.navigate().back();
		            
		        }



		driver.close();
		}
	}
	

