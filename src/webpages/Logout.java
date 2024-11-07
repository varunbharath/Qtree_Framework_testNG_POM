package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	public static WebDriver driver;
	public Logout(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//*[@id=\"mount_0_0_Jw\"]/div/div/div[1]/div/div[2]/div[5]/div[1]/span/div/div[1]/div/svg/g/image")
	//@FindBy(xpath = "//*[@mask='url(#:R3arcdad5qq9papd5aq:)']")
	public WebElement clickonprofile;
	@FindBy (xpath = "//span[text()='Log Out']")
	public WebElement logout;
	
	
	

}
