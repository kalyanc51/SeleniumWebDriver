package automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlessff {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KalyanChakravarthyCh\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
        
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.google.co.in");
		System.out.println("Executing firefox driver in headless mode..\n");
		
		System.out.println(">> Page Title : "+driver.getTitle());
		System.out.println(">> Page URL : "+driver.getCurrentUrl());
	}

}
