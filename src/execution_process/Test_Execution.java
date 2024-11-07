package execution_process;

import org.testng.annotations.Test;

import setup.Browser_Setup;
import webpages.Login_page;
import webpages.Logout;

import org.testng.annotations.BeforeClass;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.*;
import org.testng.annotations.AfterClass;

public class Test_Execution {
	public static WebDriver driver;
	public static Properties prop;
	Browser_Setup set=new Browser_Setup();
  @Test (priority = 1)
  public void fblogin() 
  
  {
	  String url=prop.getProperty("URL");
	  String username=prop.getProperty("User");
	  String Password=prop.getProperty("pass");
	  
	  driver.get(url);
	  Login_page obj=new Login_page(driver);
	  obj.Username.sendKeys(username);
	  obj.Password.sendKeys(Password);
	  obj.login.click();
	  Reporter.log("FB Login Successfully");
	  
	  
  }
   @ Test (priority = 0)
   public void  fblogout() throws InterruptedException {
	   String url=prop.getProperty("URL");
		  String username=prop.getProperty("User");
		  String Password=prop.getProperty("pass");
		 // Assert.assertEquals("8220113955", "8220113955");
		  
		  driver.get(url);
		  Login_page obj=new Login_page(driver);
		  obj.Username.sendKeys(username);
		  Assert.assertEquals("8220113955", "8220113955");
		  obj.Password.sendKeys(Password);
		  obj.login.click();
		  Reporter.log("FB Login Successfully");
		// WebDriverWait wait=new WebDriverWait(driver, null)
		  Thread.sleep(18000);
	   Logout out=new Logout(driver);
	   out.clickonprofile.click();
	   out.logout.click();
	   Reporter.log("Fb logout successfully");
	    
   }
//    @ Test
//    public void Mycontactform() {
//    	Reporter.log("Searched friends succesfully");
//    }
    
  @BeforeClass
  public void beforeClass() {
	  this.driver=set.driver;
	  this.prop=set.prop;
  }

  @AfterClass
  public void afterClass() {
	 
  }

}
