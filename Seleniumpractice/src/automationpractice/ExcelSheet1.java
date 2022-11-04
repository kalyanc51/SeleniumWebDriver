package automationpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheet1 {

	public static void main(String[] args) throws IOException   {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\KalyanChakravarthyCh\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
        
        FileInputStream file = new FileInputStream("C:\\Users\\KalyanChakravarthyCh\\OneDrive - Hallmark Health Care Solutions, Inc\\Documents\\Excel.xlsx");
        
        XSSFWorkbook workbook=new XSSFWorkbook(file);
        XSSFSheet sheet=workbook.getSheet("Login");
        
        int rowcount=sheet.getLastRowNum();
        int colcount=sheet.getRow(0).getLastCellNum();
        
        System.out.println(rowcount);
        System.out.println(colcount);
        
        

	}

}
