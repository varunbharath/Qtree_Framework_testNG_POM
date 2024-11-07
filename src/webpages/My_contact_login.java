package webpages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.*;

public class My_contact_login {
	public static WebDriver driver;
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	
public	My_contact_login(WebDriver driver){
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
		
	}
@FindBy(xpath = "(//input[@id='user'])[1]")
public WebElement contactusername;
@FindBy(xpath = "(//input[@id='pass'])[1]")
protected WebElement contactpassword;
@FindBy(xpath = "(//input[@name='btnSubmit'])[1]")
protected WebElement contactlogin;
public void contactusername() {
	
}

public void contactloginclick() {
	js.executeScript("arguments[0].click()", contactlogin);
	Reporter.log("contactlogin clicked successfully");
}


	
}
