package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import PageObject.PageObject;

public class HomeOR extends PageObject{

	@FindBy(xpath="//a[@title='Go to Facebook Home' ]")
	WebElement GotoFacebookHome;
	
	@FindBy(xpath="//input[@type='text' and @name='q']")
	WebElement searchBox;
	
	@FindBy(xpath="//div[@id='logoutMenu']")
	WebElement logoutMenu;
	
	public HomeOR() {
		super();
	}
	public HomeOR(WebDriver driver) {
		super(driver);
	}

	
	
}
