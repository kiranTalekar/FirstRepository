package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import PageObject.PageObject;

public class LoginOR extends PageObject {

	@FindBy(name="email")
	public WebElement emailTxt;
	
	@FindBy(name="pass")
	public WebElement passTxt;
	
	@FindBy(css="label#loginbutton")
	public WebElement loginBtn;
	
	@FindBy(xpath="//div[@id='blueBarDOMInspector']//i[@class='fb_logo img sp_3_Q1r8_qFcV sx_b88f4c']")
	public WebElement facebookText;
	
	public LoginOR(){
		super();
	}
	public LoginOR(WebDriver driver){
		super(driver);
		
	}

}
