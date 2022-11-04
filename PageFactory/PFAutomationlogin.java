package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PFAutomationlogin {
	
	WebDriver driver;
	
	@FindBy(name="email")
	WebElement emailaddress;
	
	
	@FindBy(name="passwd")
	WebElement password;
	
	@FindBy(id="SubmitLogin")
	WebElement submitlogin;
	
	public PFAutomationlogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void setUserName(String strUserName)
    {
      emailaddress.sendKeys(strUserName);
    }
	
	public void setPassword(String strPassword)
	{
		
		password.sendKeys(strPassword);
	}
	public void clicklogin()
	{
		submitlogin.click();
	}
	

}
