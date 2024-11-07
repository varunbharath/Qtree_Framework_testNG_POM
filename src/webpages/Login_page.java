package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	public static WebDriver driver;
	
	public Login_page(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

//FB login Locators
@FindBy(xpath = "//input[@id='email']")
public  WebElement Username;
@FindBy(xpath = "//input[@id='pass']")
public WebElement Password;
@FindBy (xpath = "//button[@name='login']")
public WebElement login;


}
