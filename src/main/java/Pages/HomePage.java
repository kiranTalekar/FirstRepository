package Pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends HomeOR {

	
	public HomePage(WebDriver driver){
		super(driver);	
	}
	
	
	public void redirectToOtherPage(String url){
		driver.navigate().to(url);
	}
	
	public void forword(){
		driver.navigate().forward();
	}
	
	public void back(){
		driver.navigate().back();
	}
	
	public void refresh(){
		driver.navigate().refresh();
	}
	
	
	public String checkCurrentUrl(){
		return driver.getCurrentUrl();
	}
	public String checkHomePageTitle(){
		return driver.getTitle();
	}
	
	public HomePage GotoFacebookHome(){
		GotoFacebookHome.click();
		return new HomePage(driver);
	}
}
