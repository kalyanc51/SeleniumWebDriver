package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Automationhomepage {
	
	WebDriver driver;
	
	By title=By.xpath("//span[contains(text(),'csr complex')]");
	
	public Automationhomepage(WebDriver driver)
	{

		    this.driver = driver;

	}
	
	public String titleverification()
	{
		return driver.findElement(title).getText();
	}

}
