package Datadiven.DataDrivenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Xls_Reader reader = new Xls_Reader("D:\\Charan_java\\Datadriven_testing\\src\\Excel\\Excel_File.xlsx");
		String username = 	reader.getCellData("Logindata","username", 2);
			
		String password = 	reader.getCellData("Logindata","password", 2);
		
		String res = 	reader.getCellData("Logindata","res", 2);*/
		
		
			System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");	
			
			WebDriver driver = new ChromeDriver();
		
	}	
		
}
		