package webpages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.*;

public class MY_contact_form_Send_To {
	protected static WebDriver driver;
	 JavascriptExecutor js1=(JavascriptExecutor)driver;
	
	 protected MY_contact_form_Send_To(WebDriver driver){
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 
		
	}
	 @FindBy(xpath = "(//input[@name='email_to[]'])[1]")
	 public WebElement  MarketingDepartment;
	 @FindBy(xpath = "(//input[@name='email_to[]'])[2]")
	 public WebElement Sales;
	 @FindBy(xpath = "(//input[@name='email_to[]'])[2]")
	 public WebElement  CustomerService;
	 
	 public void sentto() {
		 if (MarketingDepartment.isSelected()) {
			
			 Reporter.log("Marketing Dept default selected");
			
		}
		 else {
			 MarketingDepartment.click();
			 Reporter.log("Marketing Dept clicked by automation ");
				
		 }
		 if (Sales.isSelected()) {
			Reporter.log("Sales default salected");
		}
		 else {
			 Sales.click();
			 Reporter.log("Sales clicked by Automation");
		 }
		 if (CustomerService.isSelected()) {
			 Reporter.log("customerservice default selected");
			
		}
		 else {
			 js1.executeScript("arguments[0].click()",CustomerService);
			 
			 Reporter.log("customerservice clicked by automation");
		 }
			 
	 }

}
