package setup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Browser_Setup {

	public static WebDriver driver;
	public static Properties prop;
	static {
		System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		
		try {
			File f= new File("C:\\\\Users\\\\kumar\\\\eclipse-workspace\\\\QTREE_Project\\\\Login_input.properties");
			FileInputStream fis= new FileInputStream(f);
			
			prop=new Properties();
			prop.load(fis);
			System.out.println(prop.getProperty(""));
			}
			catch (Exception e) {
				// TODO: handle exception
				
			}
	}
	
	

}
