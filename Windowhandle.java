package automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KalyanChakravarthyCh\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url ="file:///C:/Users/KalyanChakravarthyCh/OneDrive%20-%20Hallmark%20Health%20Care%20Solutions,%20Inc/Desktop/Selenium/Selenium%20html/Popwindow.html";
        driver.get(url);
        Thread.sleep(3000);
        String parentwindow =driver.getWindowHandle().toString();
        driver.findElement(By.name("Open")).click();
        
        driver.switchTo().window("PopupWindow");
        Thread.sleep(4000);
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(parentwindow);
        driver.close();

	}

}
