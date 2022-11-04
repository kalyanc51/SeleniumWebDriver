package automationpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelsheet {

	public static void main(String[] args) throws IOException, Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KalyanChakravarthyCh\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        XSSFWorkbook workbook;
        
        FileInputStream fis = new FileInputStream("C:\\Users\\KalyanChakravarthyCh\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium\\testdata\\GoogleImages.xlsx");
         workbook = new XSSFWorkbook(fis);
         XSSFSheet ws = workbook.getSheetAt(0);
         
         int rownum  = ws.getLastRowNum();
         int colnum = ws.getRow(0).getPhysicalNumberOfCells();
         System.out.println(colnum);
         System.out.println(rownum);
	}
}	
//         XSSFCell searchkey;
//         for(int i = 1; i <= rownum ; i++) {
//             driver.get("http://www.google.com");
//             driver.manage().window().maximize();
//             searchkey= ws.getRow(i).getCell(0);
//             System.out.println("Google search image for: "+searchkey);
//             driver.findElement(By.linkText("Images")).click();
//             driver.findElement(By.name("q")).sendKeys(searchkey.toString());
//            
//             
//                          
//             WebElement textbox = driver.findElement(By.name("q"));
//             textbox.sendKeys(Keys.RETURN);
//            
//             
//            
//             
//             Thread.sleep(3000);
//            
//             System.out.println(driver.getTitle());
//             if(driver.getTitle().matches("[A-Z|a-z]+ "+"- Google Search")) 
//             {
//                 System.out.println("matches");
//             }
//             else 
//             {
//                 System.out.println("not matches");
//             }
//            // System.out.println(Pattern.matches("[A-Z|a-z|\\W]+", title));
//             //System.out.println(Pattern.matches(".*", title));
//             driver.navigate().back();
//             
//         }
//         driver.close();    
//    }
        

