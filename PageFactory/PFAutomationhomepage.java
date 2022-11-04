package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PFAutomationhomepage {
	
	WebDriver driver;
	
	@FindBy(xpath="//span[contains(text(),'csr complex')]")
     WebElement username;
	
	public PFAutomationhomepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public String titleverification()
	{
	
		 return username.getText();
				
    }
}	
