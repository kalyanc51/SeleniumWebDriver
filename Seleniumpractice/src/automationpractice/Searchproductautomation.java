package automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Searchproductautomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KalyanChakravarthyCh\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="http://automationpractice.com/index.php";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("search_query_top")).sendKeys("dresses");
		driver.findElement(By.name("submit_search")).click();
		driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/h5[1]/a[1]")).click();
		
		Select s=new Select(driver.findElement(By.id("group_1")));
		s.selectByValue("2");
		driver.findElement(By.name("Yellow")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		


	}

}
