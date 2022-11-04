package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Automationlogin {
	
	WebDriver driver;
	
	By email=By.id("email");
	By password=By.id("passwd");
	By clicksignin=By.id("SubmitLogin");
	
	
	public Automationlogin(WebDriver driver)
	{

		    this.driver = driver;

	}
	
	public void setUserName(String strUserName)
    {
    driver.findElement(email).sendKeys(strUserName);
    }
	
	public void setPassword(String strPassword)
	{
		driver.findElement(password).sendKeys(strPassword);
	}
	
	
	
	public void clickLogin()
	{
		driver.findElement(clicksignin).click();
	}
	


}
