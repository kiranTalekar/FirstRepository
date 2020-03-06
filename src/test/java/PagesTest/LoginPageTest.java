package PagesTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.PageObject;
import Pages.LoginPage;
public class LoginPageTest extends PageObject{
	
	public LoginPage loginPage;
	
	public LoginPageTest(){
		super();
	}
	public LoginPageTest(WebDriver driver){
		super(driver);
	}
	
	@BeforeMethod
	public void setup(){
		intialization();
		 loginPage=new LoginPage(driver);
		 loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	
	
	@Test(priority=1)
	public void UrlTest(){
		String url = loginPage.checkCurrentUrl();
		System.out.println(url);
	}
	
	@Test(priority=2)
	public void titleTest(){
		String title = loginPage.checkLoginPageTitle();
		System.out.println(title);
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
