package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Automationsignin {
	
	WebDriver driver;
	
	
	By signin=By.xpath("//a[contains(text(),'Sign in')]");
	
	public Automationsignin(WebDriver driver)
{

	    this.driver = driver;

}

public void clickSigninLink()
{
	 driver.findElement(signin).click();
}

}
