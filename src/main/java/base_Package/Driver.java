package base_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	public static WebDriver driver;
	
	public void Chrome_Driver()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	

}
