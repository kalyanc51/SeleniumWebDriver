package automationpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchproductJavascriptexecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KalyanChakravarthyCh\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="http://automationpractice.com/index.php";
		driver.get(url);
		driver.manage().window().maximize();
		
		
		
		
		//Creating the Javascriptexecutor interface object by type casting
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//To generate alert window javascriptexecutor .Display the alert message
		js.executeScript("alert('Welcome to Automation Practice')");
        Alert alt = driver.switchTo().alert();
        alt.accept();
		Thread.sleep(3000);
		
		js.executeScript("document.getElementsByName('search_query')[0].value='dresses'");
		js.executeScript("document.getElementsByName('submit_search')[0].click()");
		
		String stext=js.executeScript("return document.title;").toString();
		System.out.println("the page title is "+stext);
		
		driver.close();
		
		
		
		
	}

}
