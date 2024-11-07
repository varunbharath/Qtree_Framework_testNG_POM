package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_contact_Sendkey_actions {
	protected static WebDriver  driver;
	Actions act=new Actions(driver);
protected	My_contact_Sendkey_actions(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
@FindBy(xpath = "//input[@id='subject']")
protected static WebElement subject;
@FindBy(xpath = "//input[@id='email']")
protected static WebElement E_mailAddress;
@FindBy(xpath = "//input[@id='q1']")

 protected WebElement TextBoxField;
@FindBy(xpath = "//textarea[@id='q2']")
protected static WebElement TextBox_MultiLine;

public void Sendkey_page() {
	String subjectvalue="Subject for My contactform";
	act.sendKeys(subject,subjectvalue);
	 String  emailvalue="123456@gmail.com";
	 act.sendKeys(E_mailAddress,emailvalue);
	 String fieldbox_value="value of field box";
	 act.sendKeys(TextBoxField, fieldbox_value);
	 String textmultiline="Just pass the value here";
	 act.sendKeys(TextBox_MultiLine, textmultiline);
	
}


}
